package primer;

import java.util.Scanner;

public class Alignment_Sum {

	/**
	 * 
	 * 3.0 -> 3
	 * 3.1 -> 3.1
	 * 
	 * @param d
	 * @return
	 */
	public static String doubleTrans(double d) {
		
		if (Math.round(d) - d == 0) {
			
			return String.valueOf((long) d);
		}
		
		return String.valueOf(d);
	}

	public static void main(String[] args) {

		Double a;
		Double b;

		a = new Scanner(System.in).nextDouble();
		b = (Integer.valueOf(1) + a) * a * 0.5;

		/**
		 * 5.000000005E17 5
		 * 
		 * String str = String.valueOf(b); int v = str.indexOf('.');
		 * 
		 */
		
		System.out.println(doubleTrans(b));


	}
}
