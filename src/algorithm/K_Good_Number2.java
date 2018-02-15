package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 如果一个自然数N的K进制表示中任意的相邻的两位都不是相邻的数字， 那么我们就说这个数是K好数。求L位K进制数中K好数的数目。 例如K = 4，L =
 * 2的时候，所有K好数为11、13、20、22、30、31、33 共7个。 由于这个数目很大，请你输出它对1000000007取模后的值。
 * 
 * 输入格式 输入包含两个正整数，K和L。 输出格式 输出一个整数，表示答案对1000000007取模后的值。
 * 
 * 
 * 样例输入 4 2 样例输出 7
 * 
 * 
 * 数据规模与约定 对于30%的数据，KL <= 106； 对于50%的数据，K <= 16， L <= 10； 对于100%的数据，1 <= K,L <=
 * 100。
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class K_Good_Number2 {
								   
	public static final int MOD = 1000000007;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int k = input.nextInt();
		
		int l = input.nextInt();
		
		int num = 0;
		
		int[][] nums = new int[l][k];
		
		for (int i = 0; i < l; i++) {
			
			for (int j = 0; j < k; j++) {
				
				nums[i][j] = 0;
				
			}
			
		}
		
		for (int j = 1; j < k; j++) {
			
			nums[0][j] = 1;
			
		}
		
		for (int i = 1; i < l; i++) {
			
			for (int j = 0; j < k; j++) {
				
				int sum = 0;
				
				nums[i][j] += nums[i - 1][j] % MOD;
				
				for (int m = 0; m < k; m++) {
					
					if (Math.abs(m - j) > 1) {
						
						sum += nums[i - 1][m] % MOD;
						
						sum = sum % MOD;
						
					}
					
				}
				
				
				nums[i][j] += sum;
				
				nums[i][j] = nums[i][j] % MOD;
				
			}
			
		}
			
		
		int rs = 0;
		
		for (int j = 0; j < k; j++) { 
//			
//			for (int jj = 0; jj < k; jj++) {
//				
//				System.out.print(nums[j][jj] + " ");
//				
//			}
//			
			rs += nums[l - 1][j];
			
			rs = rs % MOD;
//			
//			System.out.println();
//
		}
		
		
		System.out.println(rs % MOD);
		
		
	}
	

}
