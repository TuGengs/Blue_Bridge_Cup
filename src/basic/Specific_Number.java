package basic;

/**
 * 
 * 
 * T 153是一个非常特殊的数，它等于它的每位数字的立方和，
 * 		即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 * 
 * @author tugeng
 *
 */
public class Specific_Number {
	
	public static void main(String[] args) {
		
		for (int i = 100; i <= 999; i++) {
			
			int w = i / 100;
			
			int q = (i % 100) / 10;
			
			int b = i % 10;
			
			if (i == (w * w * w + q * q * q + b * b * b)) {
				
				System.out.println(i);
				
			}
			
		}
		
	}

}










