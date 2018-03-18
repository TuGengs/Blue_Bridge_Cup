package Competition_Course;

import java.util.Scanner;

// 1000 以内素数筛选法
public class Prime_Number_Form {

	public static boolean[] nList = new boolean[1000]; 
	
	public static void main(String[] args) {
		
		Integer times = new Scanner(System.in).nextInt();
		
		if (times == 1) {
			
			System.out.println(2);
			
			return ;
			
		}
		
		int n = 0;
		
		int t,sq = (int)Math.sqrt(500 * 2 + 1);  
		
		for (n = 3; n <= sq; n += 2) {
			
	        if (nList[n>>1]) continue;
	        
	        for (t = n * n; t <= 500 << 1; t += n << 1) {//筛选循环 
	            nList[t >> 1] = true;
	        }
	        
	    }
		
		int tm = 1;
		
		for (t = 1; t < 500; ++t) {
			
	        if (nList[t]) continue;
	        
	        tm ++; 
	        
	        if (tm == times) {
	        		
	        		System.out.println((t << 1) + 1);
	        
	        		return ;
	        		
	        }
	        
	        
	    }  
		
	}
	
}
