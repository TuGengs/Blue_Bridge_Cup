package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 有一长度为N(1<=Ｎ<=10)的地板，给定两种不同瓷砖：
 * 	 一种长度为1，另一种长度为2，数目不限。要将这个长度为N的地板铺满，
 * 	 一共有多少种不同的铺法？
 * 
 * 　例如，长度为4的地面一共有如下5种铺法：
 * 		  4=1+1+1+1		
 * 		  4=2+1+1		
 * 		  4=1+2+1		
 * 		  4=1+1+2		
 *  	 	  4=2+2			
 *  
 *  
 *  
 * 
 * @author tugeng
 *
 */
public class Tile_Placement {
	
	public static void main(String[] args) {
		
		Integer a = new Scanner(System.in).nextInt();
		
		if (a < 1 || a > 10) {
			
			return;
			
		}
		
		int dp[][] = new int[a][a];
		
		for (int i = 1; i < a; i++) {
			
			dp[i][i] = 1;
			
			dp[i][0] = 1;
			
			for (int j = 1; j <= i / 2; j++) {
				
				if (j == 1) {
					
					dp[i][j] = i;
					
					continue;
					
				}
				
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				
				
			}
			
			if ((i / 2.0 - i / 2) != 0 && i / 2 < i - 1) {
				
				dp[i][i / 2 + 1] = dp[i][i / 2];
				
			}
			
			
		}
		
		int sum = 1;
		
		int s = 1;
		
		for (int i = a - 1; i > 0; i--) {
			
			if (s > i) break;
			
			if (s > i / 2) {
			
				sum += dp[i][i - s];
			
				
			} else {
				
				sum += dp[i][s];
				
			}
			
			s++;

			
		}
		
		System.out.println(sum);
		
		
	}

}
