package algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 
 * 
 * T 编写一个程序，输入3个整数，然后程序将对这三个整数按照从大到小进行排列。
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Blue_Sort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer b[] = new Integer[3];
		
		for (int i = 0; i < 3; i++) {
			
			b[i] = sc.nextInt();
			
		}
		
		
		Arrays.sort(b, new Comparator<Integer>() {

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
		
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print(b[i] + " ");
			
		}
		
		
	}
	
}
