package Improve;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * T Probability calculation
 * 
 * @author tugeng
 *
 */
public class Probability_Calculation {
	
	public static void main(String[] args) {
		
		double dp[][] = new double[110][10000];
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int sum = sc.nextInt();
		
		for(int i = a; i <= b; i++)  
            dp[1][i] =  1.0 / (b - a + 1); 
		
		for (int i = 2; i <= n; i++) {
			
			for (int j = a; j <= b; j++) {
				
				for (int k = 1; k <= sum; k++) {
					
					if (k - j > 0) {
						
						dp[i][k] += dp[i - 1][k - j] * 1.0 / (b - a + 1);  
						
					}
					
				}
				
			}
			
		}
		
		DecimalFormat df = new DecimalFormat("0.0000");
			
		System.out.println(df.format(dp[n][sum]));
		
	}

}











