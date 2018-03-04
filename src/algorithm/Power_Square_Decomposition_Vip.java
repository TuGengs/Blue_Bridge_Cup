package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 任何一个正整数都可以用2的幂次方表示。例如：137=27+23+20 
 *   2（7）+2（3）+2（0）
 *   进一步：7= 22+2+20 （21用2表示）
 *   
 *   3=2+20
 *   所以最后137可表示为：
 *   2（2（2）+2+2（0））+2（2+2（0））+2（0）
 *   
 *   又如：
 *   1315=210 +28 +25 +2+1
 *   所以1315最后可表示为：
 *   2（2（2+2（0））+2）+2（2（2+2（0）））+2（2（2）+2（0））+2+2（0）
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Power_Square_Decomposition_Vip {
	
	public static void result(int n) {
		
		if (n == 0) {  
	        System.out.print("2(0)");  
	        return;  
	    }     
	    if (n == 1) {  
	        System.out.print("2");  
	        return;  
	    }  
	    if (n == 2) { 
	        System.out.print("2(2)");  
	        return;  
	    }  
		
	}
	
	public static int resolve(int n) {
		
		if (n == 1) {
			
			return 0;
			
		}
		
		int i = 2;
		
		int h = 1;
		
		while (i < n) {
			
			i = i << 1;
			
			if (i > n) {
				
				break;
				
			}
			
			h = h + 1;
			
		}
		
		return h;
		
	}
	
	// 2（2（2）+2+2（0））+2（2+2（0））+2（0）
	public static void recursion(int n) {
		
		int t;  
	    
		while (n > 0) {

	        t = resolve(n);
	        
	        if (t > 2) {
	        	
	        		System.out.print("2(");
 
	        		recursion(t); 
	            
	        }
	        
	        result(t);
	        
	        n -= 1 << t;
	        
	        if (n != 0 && t <= 2)  
	            System.out.print("+");
	        
	        if (t > 2) {	
	            
	        		if (n == 0)
	        			System.out.print(")");      
	            else  
	            		System.out.print(")+");   
	        }             
	        
	    }     

		
		
	}
	
	public static void main(String[] args) {
		
		Integer N = new Scanner(System.in).nextInt();
		
		recursion(N);
		
	}

}
