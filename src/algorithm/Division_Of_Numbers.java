package algorithm;

import java.util.Scanner;

/**
 * 
 * T 将整数n分成k份，且每份不能为空，任意两份不能相同(不考虑顺序)。
 * 	 例如：n=7，k=3，下面三种分法被认为是相同的。
 * 	 1，1，5; 1，5，1; 5，1，1;
 * 	 问有多少种不同的分法。
 * 
 * 
 * @author tugeng
 *
 */
public class Division_Of_Numbers {
	
	public static int cnt = 0;  
	
	public static void dfs(int front, int n, int step) {
		
//		System.out.println(front + " " + n + " " + step);
		
		if(step == 1) {  
			
	        cnt++;  
	        
	        return ;  
	        
	    }  
		
	    for(int i = front; i <= n / step; i++) 
	        dfs(i, n - i, step - 1);  
	    
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, k;  
		
		n = sc.nextInt();
		
		k = sc.nextInt();
	    
	    dfs(1, n, k);
	    
	    System.out.println(cnt);
		
	}
	

}
