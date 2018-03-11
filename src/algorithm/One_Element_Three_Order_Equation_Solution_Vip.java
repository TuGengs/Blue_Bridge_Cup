package algorithm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * T 有形如：ax3+bx2+cx+d=0 这样的一个一元三次方程。
 * 	 给出该方程中各项的系数(a，b，c，d 均为实数)，
 * 	 并约定该方程存在三个不同实根(根的范围在-100至100之间)，
 * 	 且根与根之差的绝对值>=1。要求三个实根。。
 * 
 * 
 * @author tugeng
 *
 */
public class One_Element_Three_Order_Equation_Solution_Vip {
	
	public static double rsy(double a, double b, double c, double d, int x) {
		
		double rs = a * x * x * x;
		
		if (b < 0) {
			
			rs = rs - Math.abs(b) * x * x;
			
		} 
		
		if (b >= 0) {
			
			rs = rs + b * x * x;
			
		}
		
		if (c < 0) {
			
			rs = rs - Math.abs(c) * x;
			
		} 
		
		if (c >= 0) {
			
			rs = rs + c * x;
			
		}
		
		if (d < 0) {
			
			rs = rs - Math.abs(d);
			
		} 
		
		if (d >= 0) {
			
			rs = rs + d;
			
		}
	
		return rs;
		
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println(rsy(1, -2, -1, 2, -1));
		
		Double a = sc.nextDouble() / 1000000.0;
		
		Double b = sc.nextDouble() / 10000.0;
		
		Double c = sc.nextDouble() / 100.0;
		
		Double d = sc.nextDouble();
		
//		System.out.println(rsy(a, b, c, d, -1000));
		
		List<Integer> l = new ArrayList<Integer>();
		
		List<Integer> l2 = new ArrayList<Integer>();
		
		for (int x = -1000; x <= 1000; x++) {
			
			if (rsy(a, b, c, d, x) == 0) {
				
				l.add(x);
				
			}
			
			if ((int)(rsy(a, b, c, d, x) * 100) == 0 && rsy(a, b, c, d, x) != 0) {
				
				l2.add(x);
				
			}
			
			
		}
		
		l.addAll(l2);
		
		Collections.sort(l);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println(df.format(l.get(0) / 100.0) + " " 
							+ df.format(l.get(1) / 100.0) + " " 
								+ df.format(l.get(2) / 100.0));
		
		
	}

}
