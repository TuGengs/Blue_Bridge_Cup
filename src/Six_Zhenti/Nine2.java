package Six_Zhenti;

import java.util.Scanner;

public class Nine2 {
	
	static int mod = 1000000000 + 7;
	
	static class Matrix {
		
		public int m[][] = new int[7][7];
		
	}
	
	static Matrix mul(Matrix x, Matrix y) {
		
		Matrix ans = new Matrix();
		
		for(int i=0 ;i<6 ;i++) {
			
			for(int j=0 ;j<6 ;j++) {
				
				for(int k=0 ;k<6 ;k++) {
					
					ans.m[i][j] = (ans.m[i][j] + x.m[i][k] * y.m[k][j]) % mod;
					
				}
				
			}

		}  
		    
		return ans;
		
	}
	
	static Matrix q_pow(Matrix x,int k) {
		
	    Matrix ans = new Matrix();
	    
	    for(int i=0 ;i<6 ;i++) 
	    	ans.m[i][i] = 1;  
	    
	    while(k != 0) {
	    	
	        if((k & 1) == 1)
	        	ans = mul(ans, x);
	        
	        x = mul(x, x);
	        
	        k >>= 1;
	    
	    }  
	    
	    return ans;
	    
	}  

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Matrix T = new Matrix();
		
		Matrix ans = new Matrix();
		
	    for(int i=0; i < 6; i++) {
	    	
	        for(int j = 0; j < 6; j++){
	        	
	            T.m[i][j] = 1;
	        }
	        
	    }  
		
	    int n, m, a, b;
	    
	    n = sc.nextInt();
	    
	    m = sc.nextInt();
	    
	    for (int i = 0; i < m; i++) {
	    	
	    	a = sc.nextInt();
	    	
	    	b = sc.nextInt();
	    	
	    	T.m[a - 1][b - 1] = 0;
	    	
	    	T.m[b - 1][a - 1] = 0;
	    	
	    }
	    
	    ans = q_pow(T, n - 1);
	    
	    int sum = 0;  
	    
	    for(int i = 0; i < 6; i++){
	    	
	        for(int j = 0; j < 6; j++){
	        	
	            sum = (sum + ans.m[i][j]) % mod;  
	            
	        }
	        
	    }  
	    
	    System.out.println(
	    		(sum * ((int)Math.pow(4,n)) % mod) % mod
	    );
	    
	}
	
}





