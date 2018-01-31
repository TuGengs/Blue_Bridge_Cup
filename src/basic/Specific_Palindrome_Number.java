package basic;

import java.util.Scanner;

/**
 * 
 * 
 * T 特殊回文数。 输入一个正整数n， 编程求所有这样的 五位和六位十进制数，满足各位数字之和等于n。
 * 
 * 注: 
 * 	1、奇数->只能是五位数、偶数->五位数六位数都行。
 * 	2、5位数排序10->99(第三位0-9都行) 六位数排序100->999。
 * 
 * @author tugeng
 *
 */
public class Specific_Palindrome_Number {

	public static int Middle_Const = 99999;

	public static int Five_First_Const = 10;

	public static int Five_Last_Const = 99;

	public static int Six_First_Const = 100;

	public static int Six_Last_Const = 999;

	public static int Ten = 10;

	public static int Hundred = 100;

	public static int Thousand = 1000;

	public static int Ten_Thousand = 10000;

	public static int Hundred_Thousand = 100000;

	public static void is_Five_Palindrome(int a, int b, int c) {

		int d = (a * Ten_Thousand + a) + b * (Thousand + Ten) + c * Hundred;

		System.out.println(d);

	}

	public static void is_Six_Palindrome(int a, int b, int c) {

		int d = (a * Hundred_Thousand + a) + b * (Ten_Thousand + Ten) + c * (Thousand + Hundred);

		System.out.println(d);

	}

	public static void main(String[] args) {

		Integer a;

		a = new Scanner(System.in).nextInt();
		
		if (a.intValue() % 2 == 0) {
			
			for (int i = Five_First_Const; i <= Five_Last_Const; i++) {

				// 10X01
				int q = i / 10;
				int b = i % 10;

				int m = a.intValue() - (q + b) * 2;

				if (m <= 9 && m >= 0) {

					is_Five_Palindrome(q, b, m);
					
				}

			}
			
			for (int i = Six_First_Const; i <= Six_Last_Const; i++) {

				// 101 101
				int w = i / 100;
				int q = (i % 100) / 10;
				int b = i % 10;
				

				int m = (w + q + b) * 2;
				

				if (a.intValue() == m) {

					is_Six_Palindrome(w, q, b);

				}

			}
			
		} else {
			
			for (int i = Five_First_Const; i <= Five_Last_Const; i++) {

				// 10X01
				int q = i / 10;
				int b = i % 10;

				int m = a.intValue() - (q + b) * 2;

				if (m <= 9 && m >= 0) {

					is_Five_Palindrome(q, b, m);
					
				}

			}
			
		}
		
	}

}
