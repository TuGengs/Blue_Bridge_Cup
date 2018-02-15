package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 如果一个自然数N的K进制表示中任意的相邻的两位都不是相邻的数字，
 * 那么我们就说这个数是K好数。求L位K进制数中K好数的数目。
 * 例如K = 4，L = 2的时候，所有K好数为11、13、20、22、30、31、33 共7个。
 * 由于这个数目很大，请你输出它对1000000007取模后的值。
 * 
 * 输入格式
 * 输入包含两个正整数，K和L。
 * 输出格式
 * 输出一个整数，表示答案对1000000007取模后的值。
 * 
 * 
 * 样例输入
 * 4 2
 * 样例输出
 * 7
 * 
 * 
 * 数据规模与约定
 * 对于30%的数据，KL <= 106；
 * 对于50%的数据，K <= 16， L <= 10；
 * 对于100%的数据，1 <= K,L <= 100。
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class K_Good_Number {
	
	public static int rss = 0;
	
	public static String convert(int i) {
		
		if (i == 10) {
			
			return "A";
			
		}
		
		if (i == 11) {
			
			return "B";
			
		}
		
		if (i == 12) {
			
			return "C";
			
		}
		
		if (i == 13) {
			
			return "D";
			
		}
		
		if (i == 14) {
			
			return "E";
			
		}
		
		if (i == 15) {
			
			return "F";
			
		}
		
		return "";
		
	}
	
	public static void recur(int k, int l, int recursions[], int kwv) {
		
		int recursion[] = recursions.clone();
		
		recursion[0] = kwv;
		
		int kw = 1;
		
		while (kw > 0 && kw < l) {
			
				if (recursion[kw] >= k) {
					
					recursion[kw] = 0;
					
				}
				
				while (recursion[kw] < k && 
						!(Math.abs(recursion[kw] - recursion[kw - 1]) > 1 
								|| recursion[kw] == recursion[kw - 1])) {
					
					recursion[kw] = recursion[kw] + 1;
					
					
				}
			
				//  2
				if (recursion[kw] < k) {
					
					if (kw == l - 1) {
						
//						String rs = "";
//						
//						for (int p = 0; p < l; p++) {
//							
//							if (recursion[p] > 9) {
//								
//								rs = rs + convert(recursion[p]);
//								
//								
//							} else {
//								
//								rs = rs + recursion[p];
//								
//							}
//							
//							
//						}
//
//						System.out.print(rs + " ");
						
						rss = (rss + 1) % 1000000007;
						
						int time = 0;
						
						for (int i = 1; i < l; i++) {
							
							if (recursion[i] == k - 1) {
								
								time = time + 1;
								
							}
							
						}
						
						if (time == l - 1) {
							
							return;
							 
						} else {
							
							time = 1;
							
						}
						
						recursion[kw] = recursion[kw] + 1;
						
						int kw2 = kw;

						//2003
						if (recursion[kw2] >= k) {

							kw2 = kw2 - 1;
							
							//2033
							while (recursion[kw2] >= k - 1) {
								
								recursion[kw2] = recursion[kw2] + 1;
								
								kw2 = kw2 - 1;
								
							}
							
							if (kw2 == 0) {
								
								return;
								
							}
							
						} 
						
						if (kw2 != kw) {
							
							kw = kw2;
							
							recursion[kw2] = recursion[kw2] + 1;
							
						}

							
						
						if (kw == 0) {
							
							kw = kw + 1;
							
						}
						
						
					} else {
						
						kw = kw + 1;
						
					}

					
				} else {
					
					kw = kw - 1;
					
					recursion[kw] = recursion[kw] + 1;
					
				}
				
			
				
			}
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer k = sc.nextInt();   // 进制 for 4 (0 1 2 3)
		
		Integer l = sc.nextInt();   // 位数 2 for 13 11
		
		if (l == 1) {
			
			if (k == 1) {
				
				System.out.println(0);
				
				return;
				
			}
			
			for (int i = 1; i < k; i++) {
				
				System.out.print(i + " ");
				
			}
			
			return;
			
		}
		
		
		int recursion[] = new int[l.intValue()]; // 2位数	
		
		for (int i = 1; i < k; i++) {
			
			recur(k, l, recursion, i);
			
		}

		System.out.println(rss);
		
		
	}
	
	
	
}
