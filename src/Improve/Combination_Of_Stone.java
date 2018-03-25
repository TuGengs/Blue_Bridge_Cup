package Improve;

import java.util.Scanner;

/**
 * 
 * T 合并石子 石子合并问题
 * 
 * 0 0 3 9 19 
 * 0 0 5 14 28 
 * 0 0 7 19 26 
 * 0 0 9 16 23 
 * 0 0 6 11 20 
 * 
 * 
 * @author tugeng
 *
 */
public class Combination_Of_Stone {

	public static int dp[][];
	
	public static int sum[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer N = sc.nextInt();
		
		dp = new int[N + 1][N + 1];
		
		sum = new int[N + 1];
		
		for (int i = 1; i <= N; i++) {
			
			sum[i] = sum[i - 1] + sc.nextInt();
			
		}
		
		for (int j = 1; j <= N; j++) {
			
			for (int i = 1; i <= N - j; i++) {

				int ij = i + j;
				
				dp[i][ij] = Integer.MAX_VALUE;
				
				int tmp = sum[ij] - sum[i - 1];
				
				for(int k = i; k < ij; k++)
	                dp[i][ij] = Math.min(dp[i][ij], (dp[i][k] + dp[k + 1][ij] + tmp));
				
			}
			
		}
		
		System.out.println(dp[1][N]);
		
	}
	
}












