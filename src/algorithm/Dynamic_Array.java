package algorithm;

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
public class Dynamic_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();

		int b[] = new int[n];
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			
			b[i] = sc.nextInt();
			
			sum += b[i];
			
		}
		
		System.out.println(sum + "  " + sum / n);
		
		
	}
	
}
