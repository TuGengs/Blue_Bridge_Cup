package algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 
 * T 从键盘读入n个整数，使用动态数组存储所读入的整数，
 * 	 并计算它们的和与平均值分别输出。要求尽可能使用函数实现程序代码。
 * 	 平均值为小数的只保留其整数部分。
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Anagrams_Problem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		
		String str2 = sc.next();
		
		char ch1[] = str1.toLowerCase().toCharArray();
		
		char ch2[] = str2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		
		Arrays.sort(ch2);
		
		if (Arrays.equals(ch1, ch2)) {
			
			System.out.println("Y");
			
		} else {
			
			System.out.println("N");
			
		}
		
		
	}
	

}













