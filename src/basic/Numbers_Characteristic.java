package basic;

import java.util.Scanner;

/**
 * 
 * 
 * T 给出n个数，找出这n个数的最大值，最小值，和。
 * 
 * 
 * @author tugeng
 *
 */
public class Numbers_Characteristic {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a;
		
		a = sc.nextInt();
		
		int b[] = new int[a.intValue()];
		
		for(int i = 0; i < a.intValue(); i++) {
			
			b[i] = sc.nextInt();
			
		}
		
		int max = b[0];
		
		int min = b[0];
		
		int sum = 0;
				
		for(int i = 0; i < a.intValue(); i++) {
			
			if(b[i] > max) {
				
				max = b[i];
				
			} 
			
			if(b[i] < min) {
				
				min = b[i];
				
			}
			
			sum += b[i];
			
		}
		
		System.out.println(max);
		
		System.out.println(min);
		
		System.out.println(sum);
		
	}

}




























