package basic;

/**
 * 
 * 
 * T 回文数。 1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 * 
 * @author tugeng
 *
 */
public class Palindrome_Number {
	
	public static int Four_First_Const = 10;
	
	public static int Four_Last_Const = 99;
	
	public static int Ten = 10;

	public static int Hundred = 100;

	public static int Thousand = 1000;

	public static void main(String[] args) {
		
		Integer q;
		Integer b;
		Integer r;
		
		for (int i = Four_First_Const; i <= Four_Last_Const; i++) {
			
			q = i / 10;
			
			b = i % 10;
			
			r = (q * Thousand + q) + b * (Hundred + Ten); 
			
			System.out.println(r);
			
		}
		
	}
	
}

















