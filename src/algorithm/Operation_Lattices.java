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
public class Operation_Lattices {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] one = bf.readLine().split(" ");
		
		Integer a = Integer.valueOf(one[0]);
		
		int toint[] = new int[a]; //初始权值
		
		Integer b = Integer.valueOf(one[1]);
		
		String[] two = bf.readLine().split(" ");
		
		String rs = "";
		
		for (int i = 0; i < a; i++) {
			
			toint[i] = Integer.valueOf(two[i]);
			
		}
		
		
		for (int i = 0; i < b; i++) {
			
			
			String[] three = bf.readLine().split(" ");
			
			if (Integer.valueOf(three[0]) == 1) {
				
				toint[(Integer.valueOf(three[1]) - 1)] = Integer.valueOf(three[2]);
				
			}
			
			if (Integer.valueOf(three[0]) == 2) {
				
				int sum = 0;
				
				for (int c = Integer.valueOf(three[1]) - 1; 
						c < Integer.valueOf(three[2]); c++) {
					
					sum += toint[c];
					
				}
				
				rs = rs + String.valueOf(sum) + "\n";
				
			}
			
			if (Integer.valueOf(three[0]) == 3) {
				
				int max = 0;
				
				for (int c = Integer.valueOf(three[1]) - 1; 
						c < Integer.valueOf(three[2]); c++) {
					
					if (toint[c] > max) {
						
						max = toint[c];
						
					}
					
				}
				
				rs = rs + String.valueOf(max) + "\n";
				
			}
			
			
			
		}
		
		
		System.out.println(rs);
		

	}
	

}
