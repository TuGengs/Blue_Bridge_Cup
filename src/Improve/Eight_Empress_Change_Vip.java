package Improve;

import java.util.Scanner;

/**
 * 
 * T 规则同8皇后问题，但是棋盘上每格都有一个数字，
 * 	 要求八皇后所在格子数字之和最大。
 * 
 * @author tugeng
 *
 */
public class Eight_Empress_Change_Vip {
	
	public static int a[][];
	
	public static int dp[];
	
	public static int max = 0;
	
	
	public static boolean judge(int i, int j) {
		
		if (dp[i] != 0) {
			
			return false;
			
		}
		
		for (int k = 1; k < i; k++) {
			
			if (dp[k] == j) {
				
				return false;
				
			}
			
			if (i - k == Math.abs(j - dp[k])) {
				
				return false;
				
			}
			
		}
		
		return true;
		
		
	}
	
	public static void dfs(int current) {
		
		if (current == 9) {
			
			int sum = 0;
			
			for (int d = 1; d < dp.length; d++) {
				
				sum += a[d][dp[d]];
				
			}
			
			if (sum > max) {
				
				max = sum;
				
			}
			
			return ;
			
		}
		
		
		for (int j = 1; j < 9; j++) {
			
			if (judge(current, j)) {
				
				dp[current] = j;
				
				dfs(current + 1);
				
				dp[current] = 0;
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		a = new int[9][9];
		
		dp = new int[9];
		
		for (int i = 1; i < a.length; i++) {
			
			for (int j = 1; j < a[0].length; j++) {
				
				a[i][j] = sc.nextInt();
				
			}
			
		}
		
		dfs(1);
		
		System.out.println(max);
		
		
	}

}
