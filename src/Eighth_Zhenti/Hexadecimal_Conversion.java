package Eighth_Zhenti;

import java.util.Scanner;

/**
 * 
 * T Hexadecimal conversion
 * 
 * @author tugeng
 *
 */
public class Hexadecimal_Conversion {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String strg = sc.next();
		
		Integer inr = Integer.parseInt(strg, 16);
		
		System.out.println(Integer.toString(inr, 16).toUpperCase() + " " 
				+ Integer.toString(inr, 10) + " " + Integer.toString(inr, 8));
		
	}

}












