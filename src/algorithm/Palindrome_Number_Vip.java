package algorithm;

import java.util.Scanner;

/**
 * 
 * T 例如：给定一个10进制数56，将56加65（即把56从右向左读），得到121是一个回文数。
 * 又如：对于10进制数87：
 * STEP1：87+78 = 165 STEP2：165+561 = 726
 * STEP3：726+627 = 1353 STEP4：1353+3531 = 4884
 * 
 * 写一个程序，给定一个N（2<=N<=10或N=16）进制数M（其中16进制数字为0-9与A-F），
 * 求最少经过几步可以得到回文数。
 * 如果在30步以内（包含30步）不可能得到回文数，则输出“Impossible!”
 * 
 * 输入格式
 * 两行，N与M
 * 
 * 输出格式
 * 如果能在30步以内得到回文数，输出“STEP=xx”（不含引号），
 * 其中xx是步数；否则输出一行”Impossible!”（不含引号）
 * 
 * 样例输入
 * 9
 * 87
 * 
 * 样例输出
 * STEP=6
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Palindrome_Number_Vip {
	
	public static int is_Palindrome(String str) {
		
		if (str.length() % 2 == 0) {
		
			String str1 = str.substring(0, str.length() / 2);
			
			String str2 = str.substring(str.length() / 2, str.length());
			
			str2 = new StringBuffer(str2).reverse().toString();
			
			if (str1.equals(str2)) {
				
				return 1;
				
			}
		
		} else {
			
			String str1 = str.substring(0, str.length() / 2);
			
			String str2 = str.substring(str.length() / 2 + 1, str.length());
			
			str2 = new StringBuffer(str2).reverse().toString();
			
			if (str1.equals(str2)) {
				
				return 1;
				
			}
			
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int time = 1;
		
		Integer M = sc.nextInt();
		
		String N = sc.next();
		
		while (true) {
			
			if (time == 31) {
				
				System.out.println("Impossible!");
				
				return;
				
			}
			
			Long nz = Long.valueOf(N, M);
			
			String nf = new StringBuffer(N).reverse().toString();
			
			Long nn = Long.valueOf(nf, M);
			
			Long rs = nz + nn;
			
			String rss = Long.toString(rs, M);
			
			if (is_Palindrome(rss) == 1) {
				
				System.out.println("STEP=" + time);
				
				return;
				
			}
			
			time ++;
			
			N = String.valueOf(rss);
			
		}
		
	}

}
