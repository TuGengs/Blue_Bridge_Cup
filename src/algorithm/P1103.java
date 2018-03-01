package algorithm;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * T (a+bi)+(c+di)=(a+c)+(b+d)i
 * 	 (a+bi)-(c+di)=(a-c)+(b-d)i
 * 	 (a+bi)*(c+di)=(ac-bd)+(ad+bc)i
 * 	 (a+bi)/(c+di)=(a+bi)(c-di)/(c^2+d^2)=(ac+bd)+(bc-ad)i/(c^2+d^2)
 * 
 * 
 * @author tugeng
 *
 */
public class P1103 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String f = sc.next();
		
		double a = sc.nextDouble();
		
		double b = sc.nextDouble();
		
		double c = sc.nextDouble();
		
		double d = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		if ("+".equals(f)) {
			
			double shi = a + c;
			
			double xu = b + d;
			
			System.out.println(df.format(shi) + "+" + df.format(xu) + "i");
			
		}
		
		if ("-".equals(f)) {
					
			double shi = a - c;
			
			double xu = b - d;
			
			System.out.println(df.format(shi) + "+" + df.format(xu) + "i");
					
		}
		
		if ("*".equals(f)) {
			
			//(ac-bd)+(ad+bc) i 
			
			double shi = a * c - b * d;
			
			double xu = a * d + b * c;
			
			System.out.println(df.format(shi) + "+" + df.format(xu) + "i");
			
		}
		
		if ("/".equals(f)) {
			
			//(ac+bd)+(bc-ad)i/(c^2+d^2)
			
			double shi = a * c + b * d;
			
			shi = shi / (c * c + d * d);
			
			double xu = b * c - a * d;
			
			xu = xu / (c * c + d * d);
			
			System.out.println(df.format(shi) + "+" + df.format(xu) + "i");
			
		}
		
		
	}
	

}
