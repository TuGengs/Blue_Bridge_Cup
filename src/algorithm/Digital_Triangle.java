package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 请编一个程序计算从顶至底的某处的一条路径，使该路径所经过的数字的总和最大。
 * 	 ●每一步可沿左斜线向下或右斜线向下走；
 * 	 ●1＜三角形行数≤100；
 * 	 ●三角形中的数字为整数0，1，…99；
 * 
 * 输入格式
 * 文件中首先读到的是三角形的行数。
 * 接下来描述整个三角形
 * 
 * 输出格式
 * 最大总和（整数）
 * 
 * 
 * 样例输入
 * 5
 * 7
 * 3 8
 * 8 1 0
 * 2 7 4 4
 * 4 5 2 6 5
 * 
 * 样例输出
 * 30
 * 
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Digital_Triangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer b = sc.nextInt();
		
		int a[][] = new int[b + 1][b + 1];
		
		for (int i = 1; i <= b; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				a[i][j] = sc.nextInt();
				
				a[i][j] = a[i][j] + Math.max(a[i - 1][j], a[i - 1][j - 1]);
				
			}
			
		}
		
		int max = 0;
		
		for (int i = 1; i <= b; i++) {
			
			if (a[b][i] > max) {
				
				max = a[b][i];
				
			}
			
		}
		
		
		System.out.println(max);
		
		
	}

}
