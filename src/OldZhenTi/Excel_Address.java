package OldZhenTi;

import java.util.Scanner;

/**
 * 
 * Excel单元格的地址表示很有趣，它使用字母来表示列号。
 * 比如，
 * A表示第1列，
 * B表示第2列，
 * Z表示第26列，
 * AA表示第27列，
 * AB表示第28列，
 * BA表示第53列，
 * 
 * 
 * 2 26
 * 3 26 * 26 = 676
 * 4 26 * 26 * 26 = 17576
 * 5 26 * 26 * 26 * 26 = 456976
 * 6 26 * 26 * 26 * 26 * 26 = 11881376
 * 
 * 7 26 * 26 * 26 * 26 * 26 * 26 = 308915776							  
 * 
 * @author tugeng
 *
 */
public class Excel_Address {
																	  
	public static int a[] = {-1, 1, 26, 676, 17576, 456976, 11881376, 308915776};

	public static String str[] = {"", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
			"S", "T", "U", "V", "W", "X", "Y", "Z"};
	
	public static void main(String[] args) {
		
//		System.out.println(Integer.MAX_VALUE);
		
//		System.out.println(a[a.length - 1]);
		
		Integer n = new Scanner(System.in).nextInt();
		
		for (int i = a.length - 1; i > 0; i--) {
			
			if ((n / a[i]) != 0) {
				
				if (n % a[i] > a[i - 1] || (n % a[i] >= a[i - 1] && (i - 1 == 1))) {
					
					System.out.print(str[n / a[i]]);
					
					n = n - (n / a[i]) * a[i];
					
				} else {
					
					System.out.print(str[n / a[i] - 1]);
					
					n = n - (n / a[i] - 1) * a[i]; 
					
				}
				
				
			}
			
		}
		
	}
	
}
