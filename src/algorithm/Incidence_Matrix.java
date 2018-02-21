package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * 
 * T 有一个n个结点m条边的有向图，请输出他的关联矩阵。
 * 
 * 
 * 输入格式
 * 第一行两个整数n、m，表示图中结点和边的数目。n<=100,m<=1000。
 * 接下来m行，每行两个整数a、b，表示图中有(a,b)边。
 * 注意图中可能含有重边，但不会有自环。
 * 
 * 输出格式
 * 输出该图的关联矩阵，注意请勿改变边和结点的顺序。
 * 
 * 
 * 
 * 样例输入
 * 5 9
 * 1 2
 * 3 1
 * 1 5
 * 2 5
 * 2 3
 * 2 3
 * 3 2
 * 4 3
 * 5 4
 * 
 * 样例输出
 * 1 -1 1 0 0 0 0 0 0
 * -1 0 0 1 1 1 -1 0 0
 * 0 1 0 0 -1 -1 1 -1 0
 * 0 0 0 0 0 0 0 1 -1
 * 0 0 -1 -1 0 0 0 0 1
 * 
 * 
 * B[i][k]表示
 * (1)如果B[i][k]=1，则第k条边为点i的 出边；
 * (2)如果B[i][k]=-1;则第k条边为点i的 入边；
 * (3)如果B[i][k]=0;则点i与第k条边无关；
 * 
 * 
 * (a -> b : a = -1, b = 1;)
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Incidence_Matrix {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] one = bf.readLine().split(" ");
		
		Integer n = Integer.valueOf(one[0]);	// n 个 顶点
		
		Integer m = Integer.valueOf(one[1]);	// m 条 边
		
		int rs[][] = new int[n + 1][m + 1];
		
		for (int i = 1; i <= m; i++) {
			
			String two[] = bf.readLine().split(" ");
			
			rs[Integer.valueOf(two[0])][i] = 1;
			
			rs[Integer.valueOf(two[1])][i] = -1;
			
		}
		
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= m; j++) {
			
				System.out.print(rs[i][j] + " ");
			
			}
			
			System.out.println();
			
		}
		
		
		
	}
	

}
