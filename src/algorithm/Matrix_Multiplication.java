package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 输入两个矩阵，分别是m*s，s*n大小。输出两个矩阵相乘的结果。
 * 
 * 输入格式
 * 第一行，空格隔开的三个正整数m,s,n（均不超过200）。
 * 接下来m行，每行s个空格隔开的整数，表示矩阵A（i，j）。
 * 接下来s行，每行n个空格隔开的整数，表示矩阵B（i，j）。
 * 
 * 输出格式
 * m行，每行n个空格隔开的整数，输出相乘後的矩阵C（i，j）的值。
 * 
 * 
 * 样例输入
 * 2 3 2
 * 1 0 -1
 * 1 1 -3
 * 0 3
 * 1 2
 * 3 1
 * 
 * 样例输出
 * -3 2
 * -8 2
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Matrix_Multiplication {
	
	public static int f[][];
	
	public static int s[][];
	
	public static int Cij(int i, int j) {
		
		int ff[][] = f;
		
		int ss[][] = s;
		
		int sum = 0;
		
		for (int k = 0; k < f[0].length; k++) {
			
			sum += f[i][k] * s[k][j];
			 
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a  = sc.nextInt();
		
		Integer b  = sc.nextInt();
		
		Integer c  = sc.nextInt();
		
		f = new int[a][b];
		
		s = new int[b][c];
		
		
		for (int i = 0; i < a; i++) {
			
			for (int j = 0; j < b; j++) {
				
				f[i][j] = sc.nextInt();
				
			}
			
		}
		
		for (int i = 0; i < b; i++) {
			
			for (int j = 0; j < c; j++) {
				
				s[i][j] = sc.nextInt();
				
			}
			
			
		}
		
		
		
		int rs[][] = new int[a][c];
		
		for (int i = 0; i < a; i++) {
			
			for (int j = 0; j < c; j++) {
				
				rs[i][j] = Cij(i, j);
				
				System.out.print(rs[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
