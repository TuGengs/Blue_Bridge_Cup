package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 
 * T 给定一个n个顶点，m条边的有向图（其中某些边权可能为负，但保证没有负环）。
 * 	 请你计算从1号点到其他点的最短路（顶点从1到n编号）。
 * 
 * 输入格式
 * 第一行两个整数n, m。
 * 接下来的m行，每行有三个整数u, v, l，表示u到v有一条长度为l的边。
 * 
 * 输出格式
 * 共n-1行，第i行表示1号点到i+1号点的最短路。
 * 
 * 
 * 样例输入
 * 3 3
 * 1 2 -1
 * 2 3 -1
 * 3 1 2
 * 样例输出
 * -1
 * -2
 * 
 * 
 * 样例输入
 * 3 3
 * 1 2 -1
 * 2 3 -1
 * 3 1 2
 * 
 * 样例输出
 * -1
 * -2
 * 
 * 
 * 数据规模与约定
 * 对于10%的数据，n = 2，m = 2。
 * 对于30%的数据，n <= 5，m <= 10。
 * 对于100%的数据，1 <= n <= 20000，1 <= m <= 200000，-10000 <= l <= 10000，保证从任意顶点都能到达其他所有顶点。
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Shortest_Path {

	public static int INF = Integer.MAX_VALUE;
	
	public static void Floyid(int P[][], int D[][]) {
		
	for (int k = 1; k < P.length; k++) {
			
			for (int i = 1; i < P.length; i ++) {
				
				for (int j = 1; j < P.length; j++) {
					
					
					 int tmp = (P[i][k]==INF || P[k][j]==INF) ? INF : (P[i][k] + P[k][j]);
					 
					 if (P[i][j] > tmp) {
						 
						 P[i][j] = tmp;
						 
						 D[i][j] = k;
						 
					 }
					
					
					
				}
			
				
			}
			
			
		}
	
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		Integer b = sc.nextInt();
		
		int P[][] = new int[a + 1][a + 1];
		
		int D[][] = new int[a + 1][a + 1];
		
		for (int i = 1; i < a + 1; i ++) {
			
			for (int j = 1; j < a + 1; j++) {
				
				if (i != j) {
					
					P[i][j] = INF;
					
				}
				
				D[i][j] = j;
				
			}
			
		}
		
		
		for (int i = 0; i < b; i++) {
			
			Integer u = sc.nextInt();
			
			Integer v = sc.nextInt();
			
			Integer w = sc.nextInt();
			
			
			P[u][v] = w;
			

		}
		
		
		Floyid(P, D);
		
		for (int i = 1; i < a; i++) {
			
			System.out.println(P[1][i + 1]);
		
		}
		
//		for (int i = 1; i < a; i++) {
//			
//			List<Integer> list = new ArrayList<Integer>();
//			
//			int j = D[1][i + 1];	// 3
//			
//			int bj = 1;		// 1
//			
//			while (j != i + 1) {
//				
//				list.add(P[bj][j]);
//				
//				bj = j;
//				
//				j = D[bj][i + 1];	// 4
//				
//			}
//			
//			list.add(P[bj][j]);
//			
//			int sum = 0;
//			
//			for (int it = 0; it < list.size(); it++) {
//				
//				sum += list.get(it);
//				
//			}
//			
//			System.out.println(sum);
//			
//			
//		}
		
		
	}
	
	
}
