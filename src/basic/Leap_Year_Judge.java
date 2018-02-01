package basic;

import java.util.Scanner;

/**
 * 
 * 
 * T 给定一个年份，判断这一年是不是闰年。
 * 
 * 当以下情况之一满足时，这一年是闰年：
 * 
 * 1. 年份是4的倍数而不是100的倍数；
 * 
 * 2. 年份是400的倍数。
 * 
 * 其他的年份都不是闰年。
 * 
 * 
 * @author tugeng
 *
 */
public class Leap_Year_Judge {
	
	public static boolean is_Leap(int year){
		
		
		if ((year % 4 == 0) && year % 100 != 0) {
			
			return true;
			
		}
		
		if (year % 400 == 0) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		Integer a = new Scanner(System.in).nextInt();
		
		if (is_Leap(a.intValue())) {
			
			System.out.println("yes");
			
		} else {
			
			System.out.println("no");
			
		}
		
		
	}

}
