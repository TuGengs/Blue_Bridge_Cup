package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T Torry从小喜爱数学。一天，老师告诉他，像2、3、5、7……这样的数叫做质数。
 * 	 Torry突然想到一个问题，前10、100、1000、10000……个质数的乘积是多少呢？
 * 	 他把这个问题告诉老师。老师愣住了，一时回答不出来。
 * 	 于是Torry求助于会编程的你，请你算出前n个质数的乘积。
 * 	 不过，考虑到你才接触编程不久，Torry只要你算出这个数模上50000的值。
 * 
 * 
 * 输入格式
 * 仅包含一个正整数n，其中n<=100000。
 * 
 * 输出格式
 * 输出一行，即前n个质数的乘积模50000的值。
 * 
 * 
 * 样例输入
 * 1
 * 
 * 样例输出
 * 2
 * 
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Perplexity_Of_Torry_Basic {
	
	public static boolean is_prime(Integer a) {
			
			if(a.intValue() ==2 || a.intValue()==3) {
				
				return true;
				
			}  
			
			//bug所在，不加的话，会判断1为true
			if (a.intValue() == 1) {
				
				return false;
				
			}
			
	        //不在6的倍数两侧的一定不是质数  
	        if(a.intValue() % 6!= 1 && a.intValue() % 6!= 5) {
	        	
	        	return false;
	        	
	        }
	
	        //在6的倍数两侧的也可能不是质数  
	        double tmp = Math.sqrt(a.intValue());  
	        
	        for(double i = 5; i <= tmp; i+=6 ) {
	        	
	        	if(a.intValue() % i== 0 || a.intValue() % (i+ 2) == 0) {
	        		
	        		 return false;  
	        		
	        	}
	
	        	
	        }
	        
	        return true;
	        
			
		}
	
	public static void main(String[] args) {
		
		Integer n = new Scanner(System.in).nextInt();
		
		int rs = 1;
		
		int i = 1;
		
		while (n > 0) {
		
			i ++;
			
			if (is_prime(i)) {
				
				rs = ((rs % 50000) * (i % 50000) % 50000);
				
				n --;
				
			}
			
			
		}
		
		
		System.out.println(rs);
		
	}
	

}
