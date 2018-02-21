package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 整数数组a[],数组元素个数小于1等于100。
 * 	 输出数据分作两行：第一行只有一个数，表示数组元素个数；第二行为数组的各个元素。
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Maximum_In_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		int max = 0;
		
		@SuppressWarnings("unused")
		int index = -1;
		
		for (int i = 0; i < n; i++) {
			
			Integer a = sc.nextInt();
			
			if (a > max) {
				
				max = a;
				
				index = i;
				
			}
			
			
		}
		
		
		System.out.println(max + " " + index);
				
		
	}
	
	
}
