package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 　如果一个序列满足下面的性质，我们就将它称为摆动序列：
 * 1. 序列中的所有数都是不大于k的正整数；
 * 2. 序列中至少有两个数。
 * 3. 序列中的数两两不相等；
 * 4. 如果第i – 1个数比第i – 2个数大，
 * 	  则第i个数比第i – 2个数小；
 * 	  如果第i – 1个数比第i – 2个数小，
 * 	  则第i个数比第i – 2个数大。
 * 比如，当k = 3时，有下面几个这样的序列：
 * 1 2
 * 1 3
 * 2 1
 * 2 1 3
 * 2 3
 * 2 3 1
 * 3 1
 * 3 2
 * 一共有8种，给定k，请求出满足上面要求的序列的个数。
 * 
 * 
 * a[i][j] = a[i-1][j]+a[i-1][j-1]; (i k j n)
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Oscillating_Sequence_Vip2 {
	
	public static void main(String[] args) {
		
		Integer k = new Scanner(System.in).nextInt();
		
		int a[][] = new int[k + 1][k + 1];
		
		for (int i = 1; i <= k; i++) {
			
			for (int j = 1; j <= k; j++) {
				
				if (j == 1 && i != j) {
					
					a[i][j] = i * (i + 1);
					
					continue;
					
				}
				
				if (i == j) {
					
					a[i][j] = 2;
					
				} else {
					
					a[i][j] += a[i-1][j] + a[i-1][j-1];
					
				}
				
				
			}
			
		}
		
		int ans = 0;
		
		for (int o = 1; o <= k; o++) {
			
			ans += a[k - 1][o];
			
		}
		
		System.out.println(ans);
		
		
	}

}
