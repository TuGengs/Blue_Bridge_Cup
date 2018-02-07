package basic;

import java.util.Scanner;

/**
 * 
 * 
 * T 详见图片
 * 
 * 
 * @author tugeng
 *
 */
public class Sine_Dance_Vip {
	
	public static String SN(String[] strs, int n) {
		
		String rs = "";
		
		if (n == 1) {
			
			rs = strs[1] + "+" + "1";
			
			return rs;
			
		} else {
			
			int k = 1;
			
			for (int i = n; i > 1; i--) {
				
				rs = strs[k] + i + ")"; 
				
				k++;
				
			}
			
			
			rs = rs + strs[k] + "+" + "1";
			
			
			for (int i = 2; i <= n; i++) {
				
				rs = "(" + rs;
				
			}
			
			
		}
		
		
		return rs;
		
		
		
	}
	
	public static String AN(int n) {
		
		String an = "sin(1";
		
		if (n == 1) {
			
			an = an + ")";
			
			return an;
			
		} else {
			
			for (int i = 2; i <= n; i++) {
				
				if (i % 2 == 0) {
					
					an = an + "-sin(" + i;
					
				}
				else {
					
					an = an + "+sin(" + i;
					
				}
				
			}
			
			
		}
		
		
		
		for (int i = 1; i <= n; i++) {
			
			an = an + ")";
			
		}
		
		
		return an;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Integer a = new Scanner(System.in).nextInt();
		
		String[] strs = new String[a.intValue() + 1];

		for (int i = 1; i <= a.intValue(); i++) {
			
			strs[i] = AN(i);
			
		}
//		
//		for (int i = 1; i <= a.intValue(); i++) {
//			
//			System.out.println(strs[i]);
//			
//		}
		
		
		String rs = SN(strs, a.intValue());
		
		
		System.out.println(rs);
		
		
		
	}

}
















