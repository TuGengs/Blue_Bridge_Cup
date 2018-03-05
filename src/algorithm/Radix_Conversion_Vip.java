package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T １１０００１＝１＊（－２）５＋１＊（－２）４
 * 	 			＋０＊（－２）３＋０＊（－２）２＋０＊（－２）１ ＋１＊（－２）０
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Radix_Conversion_Vip {
	
	public static String str = "";
	
	public static String strs[] = {"0","1","2","3","4","5","6","7","8",
			"9","A","B","C","D","E","F","G","H","I","J"}; 
	
	// 十进制 n    进制 radix
	public static void recursion(int n, int radix) {
		
		while (n != 0) {
			
			if (n % radix < 0) {
				
				str = str + strs[(n - (n / radix + 1) * radix)];
				
				n = n / radix + 1;
				
				
			} else {
				
				str = str + strs[n % radix];
				
				n = n / radix;
				
			}
			
			
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		Integer k = sc.nextInt();
		
		recursion(a, k);
		
		System.out.println(a + "=" + new StringBuffer(str).reverse().toString() 
				+ "(base" + k + ")");
		
	}
	
	
}
