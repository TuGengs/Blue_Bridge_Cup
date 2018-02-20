package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

/**
 * 
 * 
 * T 有n个格子，从左到右放成一排，编号为1-n。
 * 	 共有m次操作，有3种操作类型：
 * 	 1.修改一个格子的权值，
 * 	 2.求连续一段格子权值和，
 * 	 3.求连续一段格子的最大值。
 * 	 对于每个2、3操作输出你所求出的结果。
 * 
 * 
 * 输入格式
 * 第一行2个整数n，m。
 * 接下来一行n个整数表示n个格子的初始权值。
 * 接下来m行，每行3个整数p,x,y，p表示操作类型，
 * p=1时表示修改格子x的权值为y，
 * p=2时表示求区间[x,y]内格子权值和，
 * p=3时表示求区间[x,y]内格子最大的权值。
 * 
 * 
 * 输出格式
 * 有若干行，行数等于p=2或3的操作总数。
 * 每行1个整数，对应了每个p=2或3操作的结果。
 * 
 * 
 * 
 * 样例输入
 * 4 3
 * 1 2 3 4
 * 2 1 3
 * 1 4 3
 * 3 1 4
 * 样例输出
 * 6
 * 3
 * 数据规模与约定
 * 对于20%的数据n <= 100，m <= 200。
 * 对于50%的数据n <= 5000，m <= 5000。
 * 对于100%的数据1 <= n <= 100000，m <= 100000，0 <= 格子权值 <= 10000。
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Operation_Lattices2 {
	
	static class Node {
		
		int r;
		int l;
		int sum;
		int max;
		
	}
	
	public static Node node[];
	
	public static String rs = "";
	
	public static int Testmax(int a, int b) {
		
		return a > b ? a : b;
		
	}
	
	public static void Build(int n,int l,int r) { //构建一棵范围在l至r范围的线段树 
	
	     node[n].l=l;//左边距 
	     
	     node[n].r=r;//右边距
	     
	     node[n].sum=0;//范围在l至r之间权值和
	     
	     node[n].max=0;//范围在l至r之间权值最大值
	     
	     if(l == r)//如果左右边距相同不再构建孩子 
	    	 return;
	     
	     Build(n*2,l,(l+r)/2);//构建范围为l至(l+r)/2的左孩子 
	     
	     Build(n*2+1,(l+r)/2+1,r);//构建范围为l至(l+r)/2的右孩子 
	
	}
	
	public static void Insert(int n, int v, int num) { //为线段树插入一个值 
	
		node[n].sum += num;//总和加入新数 
		
	    if(node[n].max < num)
	    	node[n].max = num;//更新最大值 
	    
	    if(node[n].l == node[n].r)//左右边距相等不再插入更新 
	    	return;
	    
	    if(v <= (node[n].l + node[n].r) / 2)
	    	Insert(n*2, v, num);//更新左孩子 
	    else
	    	Insert(n*2+1, v, num);//更新右孩子 
	    
	}
	
	public static void Change(int n, int v, int num) { //为线段树改变一个权值  

	    if(v == node[n].l && v == node[n].r) { //下标与左右范围相等 ，存本数 
	    	node[n].sum = num;
	    	node[n].max = num;
	        return;
	    }
	    
	    int middle = (node[n].l + node[n].r) / 2;
	    
	    if(v <= middle)
	    	Change(n*2, v, num);//更改左孩子 
	    else
	    	Change(n*2+1, v, num);//更改右孩子 
	    
	    node[n].sum = node[n*2].sum + node[n*2+1].sum;//更新总和 
	    
	    node[n].max = Testmax(node[n*2].max, node[n*2+1].max);//更新最大值 
	
	}
	
	public static int QSum(int n, int l, int r) { //求一个范围内的权值总和 

	    if(l == node[n].l && r == node[n].r)//所求范围与左右范围相等 ，直接输出总和 
	    	return node[n].sum;
	    int middle = (node[n].l + node[n].r) / 2;
	    
	    if(r <= middle)
	    	return QSum(n*2, l, r);//若所求范围在左孩子范围内，从左孩子寻找 
	    else if(l > middle)
	    	return QSum(n*2+1, l, r);//若所求范围在右孩子范围内，从右孩子寻找 
	    else 
	    	return QSum(n*2,l,middle) + QSum(n*2+1,middle+1,r);//若范围在左右孩子之间，分别求总和 
	}
	
	public static int QMax(int n, int l, int r) {//计算b至c范围内的最大权值 

	    if(l == node[n].l && r == node[n].r)//所求范围与左右范围相等 ，直接输出最大值 
	    	return node[n].max;
	    int middle = (node[n].l + node[n].r) / 2;
	    
	    if(r <= middle)
	    	return QMax(n*2, l, r);//若所求范围在左孩子范围内，从左孩子寻找 
	    else if(l > middle)
	    	return QMax(n*2+1, l, r);//若所求范围在右孩子范围内，从右孩子寻找
	    else 
	    	return Testmax(QMax(n*2, l, middle), QMax(n*2+1, middle+1, r));//若范围在左右孩子之间，分别求最大值，然后求最终最大值 
	
	}

	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] one = bf.readLine().split(" ");
		
		Integer n = Integer.valueOf(one[0]);
		
		Integer m = Integer.valueOf(one[1]);
		
		int x = (int) Math.pow(
				2.0, (Math.ceil(Math.log(n) / Math.log(2.0)) + 1));
		
		node = new Node[x];
		
		for (int i = 1; i < x; i++) {
			
			node[i] = new Node();
			
		}
		
		Build(1, 1, n); //构建一个范围为1至n的线段树
		
		String two[] = bf.readLine().split(" ");
		
		 for(int i=1; i<=n; i++) {
			 
			 int value = Integer.valueOf(two[i - 1]);
			 
			 Insert(1,i,value);//向已有线段树中插入权值 
		 
		 }
		
		 while(m-- != 0) {
			 
			 String three[] = bf.readLine().split(" ");
			 
			 int que = Integer.valueOf(three[0]);
					 
			 int b = Integer.valueOf(three[1]);
			 
			 int c = Integer.valueOf(three[2]);

		     switch(que) {
		     
		     	case 1:Change(1, b, c);break;//改变节点b的权值为c 
		     	
		     	case 2:rs = rs + QSum(1,b,c) + "\n";break;//计算b至c范围内的权值和 
		        
		     	case 3:rs = rs + QMax(1,b,c) + "\n";break;//计算b至c范围内的最大权值 
		     
		     }

		 }
		
		
		 System.out.println(rs);
		 
		
	}
	

}


































