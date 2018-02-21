package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 
 * 
 * T 给两组数，各n个。
 * 请调整每组数的排列顺序，使得两组数据相同下标元素对应相乘，然后相加的和最小。要求程序输出这个最小值。
 * 例如两组数分别为:1 3 	-5和-2 4 1
 * 那么对应乘积取和的最小值应为：
 * (-5) * 4 + 3 * (-2) + 1 * 1 = -25
 * 
 * 
 * @author tugeng
 *
 */
public class Minimum_Product_Basic {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String r = "";
		
		Integer t = sc.nextInt();
		
		
		for (int j = 1; j <= t; j++) {
			
			Integer n = sc.nextInt();
			
			int b[] = new int[n];
			
			Integer[] c = new Integer[n];
			
			for (int i = 0; i < n; i++) {
				
				b[i] = sc.nextInt();
				
			}
			
			for (int i = 0; i < n; i++) {
				
				c[i] = sc.nextInt();
				
			}
			
			
			Arrays.sort(b);
			
			Arrays.sort(c, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {

					if (o1 < o2) {
						
						return 1;
						
					}
					
					if (o1 > o2) {
						
						return -1;
						
					}
					
					return 0;
					
				}
						
			});
			
			int sum = 0;
			
			for (int i = 0; i < n; i++) {
				
				sum += b[i] * c[i];
				
			}
			
			r += sum + "\n";
			
			
		}
		
		System.out.println(r);
		
		
	}
	

}
