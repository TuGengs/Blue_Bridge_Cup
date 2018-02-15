package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。
 * 
 * 输入格式
 * 输入一个正整数N。
 * 输出格式
 * 输出一个整数，表示你找到的最小公倍数。
 * 
 * 样例输入
 * 9
 * 样例输出
 * 504
 * 
 * 
 * 数据规模与约定
 * 1 <= N <= 106。
 * 
 * 
 * 
 * (SL)
 * 先判断n是不是奇数 ，如果是  直接输出n*(n-1)*(n-2)  
 * 否则判断n能不能被3整除，如果不能，输出n*(n-1)*(n-3)，
 * 否则输出(n-1)*(n-2)*(n-3) 
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Least_Common_Multiple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		
        long n = sc.nextInt();  
          
        long result1 = n*(n-1)*(n-2);
        
        long result2 = n*(n-1)*(n-3);
        
        long result3 = (n-3)*(n-1)*(n-2);
        
        if(n == 1) {
        
        	System.out.println(1);
        
        } else {

            if(n == 2) {
            	System.out.println(2);
            	
            } else {
            	
                if(n % 2 != 0){
                	
                    System.out.println(result1);
                    
                } else {
                	
                    if(n % 3 != 0){
                    	
                        System.out.println(result2);
                        
                    } else {
                    	
                        System.out.println(result3);  
                        
                    }  
                    
                }  
                
            }  
            
        }  
        
		
	}
	
}
