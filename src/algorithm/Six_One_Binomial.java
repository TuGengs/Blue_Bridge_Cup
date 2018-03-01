package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T http://lx.lanqiao.cn/problem.page?gpid=T399
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Six_One_Binomial {

	// Cn k
	public static int recursion(int k, int n) {
		
		if (k == 0 || k == n) {
			
			return 1;
			
		}
		
		return recursion(k, n - 1) + recursion(k - 1, n - 1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer k = sc.nextInt();
		
		Integer n = sc.nextInt();
		
		System.out.println(recursion(k, n));
		
	}
	
}
