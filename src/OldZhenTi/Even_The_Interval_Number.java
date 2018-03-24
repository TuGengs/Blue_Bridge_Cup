package OldZhenTi;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
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
		
//		MemoryMXBean bean = ManagementFactory.getMemoryMXBean();
//
//		MemoryUsage memoryUsage = bean.getHeapMemoryUsage();
//		
//		System.out.println(memoryUsage.getUsed());	bytes.
		
		System.out.println(sum);
		
	}
	
}
