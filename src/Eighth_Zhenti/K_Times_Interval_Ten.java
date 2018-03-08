package Eighth_Zhenti;

import java.util.Scanner;

/**
 * 
 * T 给定一个长度为N的数列，A1, A2, … AN，
 *   如果其中一段连续的子序列Ai, Ai+1, … Aj(i <= j)之和是K的倍数，
 *   我们就称这个区间[i, j]是K倍区间。
 * 
 * 你能求出数列中总共有多少个K倍区间吗？
 * 
 * 
 * @author tugeng
 *
 */
public class K_Times_Interval_Ten {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		Integer k = sc.nextInt();
		
		int a[] = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		int times = 0;
		
		for (int z = 1; z <= n; z++) {
		
			for (int i = 1; i < a.length - z + 1; i ++) {
				
				int sum = 0;
				
//				System.out.println(i + " " + (i + z - 1));
				
				for (int j = i; j < i + z; j++) {
					
					sum += a[j];
					
				}
				
				if (sum % k == 0) {
					
					times ++;
					
				}
				
			}
		
		}
		
		
		System.out.println(times);
		
		
	}

}
