package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 设有一个长度为N的数字串，要求选手使用K个乘号将它分成K+1个部分，
 * 	 找出一种分法，使得这K+1个部分的乘积能够为最大。
 *   同时，为了帮助选手能够正确理解题意，主持人还举了如下的一个例子：
 *   有一个数字串：312， 当N=3，K=1时会有以下两种分法：
 *   3*12=36
 *   31*2=62
 *   这时，符合题目要求的结果是：31*2=62
 *   现在，请你帮助你的好朋友XZ设计一个程序，求得正确的答案。
 * 
 * 样例输入
 * 4 2
 * 1231
 * 
 * 样例输出
 * 62
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Product_Maximum_Vip {
	
	public static String str = "";
	
	public static long dp[][] = new long[45][60];
	
	// 1  2
	public static long cut (int s, int r) {
		
//		System.out.println(s + " " + r);
		
		char[] ch = str.substring(s - 1, r).toCharArray();
		
		long rs = 0;
		
		for (int i = 0; i < ch.length; i++) {
			
			rs = rs * 10 + ch[i] - '0';
			
		}
		
		return rs;
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer N = sc.nextInt();
		
		Integer K = sc.nextInt();
		
		str = sc.next();
		
		for(int i = 1;i <= N; i++) {
			
			dp[i][0] = cut(1, i);
			
		}
		
		for (int i = 2; i <= N; i++) {
			
			for (int j = 1; j <= Math.min(K, i - 1); j++) {
				
				for (int z = j; z < i; z++) {
					
//					if (i==3 && j == 1)
					
//					System.out.println(dp[i][j] + "  " + dp[z][j - 1] + " * " + cut(j + 1, i));
					
					dp[i][j] = Math.max(dp[i][j], dp[z][j - 1] * cut(z + 1, i));
					
					
				}
				
			}
			
		}
		
		System.out.println(dp[N][K]);
		
	}
	
	
}

















