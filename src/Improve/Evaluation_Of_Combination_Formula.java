package Improve;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * T Evaluation of combination formula
 * 
 * http://lx.lanqiao.cn/problem.page?gpid=T397
 * 
 * 
 * (a/b) mod m = a * b^(p-2) mod p
 *  
 * 要求：gcd（b , m）== 1 且 m为素数 且 a能整除b （利用费小马定理）
 * 
 * (a/b) mod m = a%(b⋅m) / b （不知道用了什么奇技淫巧。。。）
 * 
 * @author tugeng
 *
 */
public class Evaluation_Of_Combination_Formula {
	
	 public static long cnm(long n,long m){  
		 
	        if(m > n) return 1;  
	        
	        if(n == m || m == 0) return 1;  
	        
	        if(m > n - m) m = n - m;  
	        
	        long tmpi = 1,tmpn = 1, ans = 1;
	        
	        BigInteger s1 = new BigInteger("1");
	        
	        BigInteger s2 = new BigInteger("1");
	        
	        for (int i = 1; i<= m; i++) { 
	        	
	            tmpi = i;
	            
	            tmpn = n - i + 1;
	            
	            s1 = s1.multiply(new BigInteger(String.valueOf(tmpi)));
	            
	            s2 = s2.multiply(new BigInteger(String.valueOf(tmpn)));	// 分子 up
	            
	        }
	        
	        ans = s2.mod(s1.multiply(new BigInteger("987654321"))).divide(s1).longValue();
	        
//	        System.out.println(ans);
	        
	        return ans;
	        
	    }  
	
	 public static long pow(long a, long b) {
		 
		 long s = 1;  
		 
		 while (b > 0) {  
			 
	        if (b % 2 == 1) {  
	            s = s % 987654321; 
	            a = a % 987654321;
	            s = s * a;
	        }  
	        
	        a = a % 987654321;
	        a = a * a;  
	        b = b >> 1;
	        
		 }

		 return s % 987654321;

	 }
 
	 public static long lucas(long n, long m, long p) {
		 
		 if (m == 0) return 1;
		 
		 return (cnm(n % p, m % p) * lucas(n / p, m / p, p));
		 
	 }
	 
	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		long cnmv = cnm(n, m);
		
		long sum = 0;
		
		if(cnmv!=0){
			
            long[][] a = new long[5][5];
            
            a[0][0] = 1;
            
            for (int i = 0; i < 4; i++) {
            	
                for (int j = 0; j <= i; j++) {
                
                	 a[i + 1][j] = (a[i+1][j]+(long)j*a[i][j]) % 987654321;  
                	 
                     a[i + 1][j + 1] =(a[i+1][j+1]+(long)(n-j)*a[i][j]) % 987654321;
                	
                }
                
            }
            
            for (int i = 3 ; i >= 0; i--) {
                
            	sum += a[3][i] * pow(2, n - i) % 987654321;
            	
            	sum = sum % 987654321;
            
            }
            
//            System.out.println(cnmv);
            
            sum = (sum * cnmv) % 987654321;
            
            System.out.println(sum);
		
		}
		
		
		
	}

}
