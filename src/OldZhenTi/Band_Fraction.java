package OldZhenTi;

import java.util.Scanner;

/**
 * 
 * T 100 可以表示为带分数的形式：100 = 3 + 69258 / 714
 * 	 还可以表示为：100 = 82 + 3546 / 197。
 * 	 注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。
 * 	 类似这样的带分数，100 有 11 种表示法。
 * 
 * 
 * @author tugeng
 *
 */
public class Band_Fraction {
	
	public static int sum = 0;
	
	public static String strSum = "";
	
	public static int times = 0;
	
	public static void fun(char[] aa, int k) {
		
		if (k == aa.length - 1) {
			
			for (int f = 1; f < strSum.length(); f++) {
				
				int a = Integer.valueOf(String.valueOf(aa).substring(0, f));
						
				for (int i = aa.length - 1; i > f; i--) {
					
					int zi = Integer.valueOf(String.valueOf(aa).substring(f, i));

					int mu = Integer.valueOf(String.valueOf(aa).substring(i));
					
					if (zi < mu) {
						 
						break;
						
					}
					
					if (zi >= mu && zi % mu == 0 && (a + zi / mu) == sum) {
						
//						System.out.println(a + " " + zi + " " + mu);
						
						times ++;
						
						break;
						
					}
					
				}
				
			}
			
			
			
			return ;
			
		}
		
		for (int i = k; i < aa.length; i++) {
			
			{char t = aa[k];
			
			aa[k] = aa[i];
			
			aa[i] = t;}
			
			
			fun(aa, k + 1);
			
			
			{char t = aa[k];
			
			aa[k] = aa[i];
			
			aa[i] = t;}
			
			
		}
		
	} 

	public static void main(String[] args) {
		
		sum = new Scanner(System.in).nextInt();
		
		strSum = String.valueOf(sum);
		
		fun("123456789".toCharArray(), 0);
		
		System.out.println(times);
		
	}
	
}
