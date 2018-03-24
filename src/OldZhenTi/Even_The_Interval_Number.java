package OldZhenTi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * T 连号区间数
 * 
 * @author tugeng
 *
 */
public class Even_The_Interval_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			list.add(sc.nextInt());
			
		}
		
//		int sum = n;
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			
			int min = n;
			
			int max = 1;
			
			for(int j = i; j < n; j++) {
				
				if(min > list.get(j)) {  
	                min = list.get(j);  
	            }  
	            if(max < list.get(j)) {  
	                max = list.get(j);  
	            }  
	            if(max - min == j - i) {  
	                sum++;  
	            }  
				
			}
			
			
		}
		
//		for (int k = 0; k < n; k++) {
//			
//			for (int i = 0; i < n - k; i++) {
//				
//				List<Integer> l = list.subList(i, i + k + 1);
//				
//				if ((Collections.max(l) - Collections.min(l)) == l.size() - 1) {
//					
//					sum = sum + 1;
//					
//				}
//				
//			}
//			
//		}
		
		
		System.out.println(sum);
		
		
	}
	
}
