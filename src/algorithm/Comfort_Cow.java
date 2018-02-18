package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 
 * T 道路被用来连接N个牧场，牧场被连续地编号为1到N。每一个牧场都是一个奶牛的家。
 *   你首先要决定那些道路是需要保留的N-1条道路。
 *   
 *   第j条双向道路连接了牧场Sj和Ej(1 <= Sj <= N; 1 <= Ej <= N; Sj != Ej)，
 *   而且走完它需要Lj的时间。没有两个牧场是被一条以上的道路所连接。
 *   
 *   每次你到达第i个牧场的时候(即使你已经到过)，你必须花去Ci的时间和奶牛交谈。
 *   你每个晚上都会在同一个牧场(这是供你选择的)过夜,
 *   在早上起来和晚上回去睡觉的时候，你都需要和在你睡觉的牧场的奶牛交谈一次。
 *   
 *   请计算出使所有奶牛都被安慰的最少时间。
 * 
 * 
 * 
 * 
 * 输入格式
 * 第1行包含两个整数N和P。
 * 接下来N行，每行包含一个整数Ci。
 * 接下来P行，每行包含三个整数Sj, Ej和Lj。
 * 
 * 输出格式
 * 输出一个整数, 所需要的总时间(包含和在你所在的牧场的奶牛的两次谈话时间)。
 * 
 * 样例输入
 * 5 7
 * 10
 * 10
 * 20
 * 6
 * 30
 * 1 2 5
 * 2 3 5
 * 2 4 12
 * 3 4 17
 * 2 5 15
 * 3 5 6
 * 4 5 12
 * 
 * 样例输出
 * 176
 * 
 * 数据规模与约定
 * 5 <= N <= 10000，N-1 <= P <= 100000，0 <= Lj <= 1000，1 <= Ci <= 1,000。
 * 
 * 
 * 
 * 有向图的最小生成树又叫: 最小树形图
 * 
 * 
 * @author tugeng
 *
 */
public class Comfort_Cow {
	
	 private static int f[];	// f[i] 记录i结点开始的边的目的结点f[i]
	 
	 private static int c[];	// 奶牛安慰的时间
	 
	 private static List<edge> l;
	
	 private static int sum = 0;
	
	 static class edge {
		 
	        public int a;
	        public int b;
	        public int value;
	        
	        edge(int a, int b, int value) {
	            this.a = a;
	            this.b = b;
	            this.value = value;
	        }
			
	    }
	 
	 public static int find(int x) {
		 
		 if(f[x] == -1) {
			 
			 return x;
			 
		 }
		 
		 return f[x] = find(f[x]);  
	
	 }  
	 
	 
	 public static void merge(int x) {  
		 
		 int t1 = find(l.get(x).a);
		 
		 int t2 = find(l.get(x).b);
		 
		 if (t1 != t2) {
			 
			 f[t1] = t2;
			 
			 sum += l.get(x).value;
			 
		 }
		 
		 
	 }
	 
	 
	 public static void main(String[] args) throws Exception {

//		 Scanner sc = new Scanner(System.in);
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
//		 Integer n = sc.nextInt();	// n个农场
//		 
//		 Integer p = sc.nextInt();	// p条双向路
		 
		 String[] valueString = br.readLine().split(" ");
		 
		 Integer n = Integer.valueOf(valueString[0]);	// n个农场
		 
		 Integer p = Integer.valueOf(valueString[1]);	// p条双向路
		 
		 c = new int[n + 1];
		 
		 f = new int[n + 1];
		 
		 l = new ArrayList<edge>();	// 记录edge
		 
		 int minc = Integer.MAX_VALUE;
		 
		 for (int i = 1; i <= n; i++) {
			 
//			 c[i] = sc.nextInt();
			 
			 String one_valueString = br.readLine();
			 
			 c[i] = Integer.valueOf(one_valueString);
			 
			 f[i] = -1;
			 
			 if (c[i] < minc) {
				 
				 minc = c[i];
				 
			 }
			 
		 }
		 
		 for (int i = 1; i <= p; i++) {
			 
			 valueString = br.readLine().split(" ");
			 
//			 int a = sc.nextInt();
//			 
//			 int b = sc.nextInt();
//			 
//			 int v = sc.nextInt();
			 
			 int a = Integer.valueOf(valueString[0]);
			 
			 int b = Integer.valueOf(valueString[1]);
			 
			 int v = Integer.valueOf(valueString[2]);
			 
			 int value = 2 * v + c[a] + c[b];
			 
			 edge e = new edge(a, b, value);
			 
			 l.add(e);
			 
		 }
		 
//		 long start_time = System.nanoTime();
		 
		 Collections.sort(l, new Comparator<edge>() {
			 
			@Override
			public int compare(edge o1, edge o2) {

				return o1.value - o2.value;
				
			}
			 
		});
		 
		 for (int i = 0; i < p; i++) {
			 
			 merge(i);
			 
		 }
		 
//		 long end_time = System.nanoTime();

		 System.out.println(minc + sum);    //开始所处位置并没有记录所以 + minc
		
		 // 130.611000 ms and 118.516000 ms	缓存输入
		 // 131.843000 ms and 114.265000 ms 非缓存输入
//		 System.out.println(end_time - start_time);
		 
	}
	 
	 
}





