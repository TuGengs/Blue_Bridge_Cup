package algorithm;

import java.util.Scanner;

/**
 * 
 * T 要求n个物品中，任取若干个装入箱内，使箱子的剩余空间为最小。
 * 
 * 输入格式
 * 第一行为一个整数，表示箱子容量；
 * 第二行为一个整数，表示有n个物品；
 * 接下来n行，每行一个整数表示这n个物品的各自体积。
 * 
 * 输出格式
 * 一个整数，表示箱子剩余空间。
 * 
 * 样例输入
 * 24
 * 6
 * 8
 * 3
 * 12
 * 7
 * 9
 * 7
 * 
 * 样例输出
 * 0
 * 
 * 
 * 
 * 
 * @author tugeng
 * 
 *
 */
public class Packing_Problem_Vip {
	
	public static int Maxs = 100000; 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer size = sc.nextInt();
		
		Integer n = sc.nextInt();
		
		int a[] = new int[n];
		
		int dp[] = new int[size + 1];
		
		
		for (int i = 0; i < n; i++) {
			
			a[i] = sc.nextInt();
			
			for (int j = size; j >= a[i]; j--) {
				
				dp[j] = Math.max(dp[j], dp[j-a[i]]+a[i]);
			
			}
			
		}

		
		System.out.println(size - dp[size]);
		
		
	}
	

}







