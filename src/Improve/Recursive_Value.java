package Improve;

import java.util.Scanner;

/**
 * 
 * 
 * T F(n, 1)=F(n-1, 2) + 2F(n-3, 1) + 5,
 * 	 F(n, 2)=F(n-1, 1) + 3F(n-3, 1) + 2F(n-3, 2) + 3.
 * 
 * 初始值为：F(1, 1)=2, F(1, 2)=3, F(2, 1)=1, F(2, 2)=4, F(3, 1)=6, F(3, 2)=5。
 * 
 * 输入n，输出F(n, 1)和F(n, 2)，由于答案可能很大，你只需要输出答案除以99999999的余数。
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Recursive_Value {
	
	static Matrix multiply(Matrix x, Matrix y, int m, int n, int s) { //m*s   s*n  矩阵相乘
		
		Matrix temp = new Matrix();
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				for(int k=0;k<s;k++)
					temp.a[i][j]=(temp.a[i][j]
							+(x.a[i][k]*y.a[k][j])%99999999)%99999999;
	    
		return temp;
		
	}
	
	public static void main(String[] args) {
		
		Matrix temp = new Matrix();
		
		long tmp[][] = {{0,1,1,0,0,0,0,0},
					   {1,0,0,1,0,0,0,0},
					   {0,0,0,0,1,0,0,0},
					   {0,0,0,0,0,1,0,0},
					   {2,3,0,0,0,0,0,0},
					   {0,2,0,0,0,0,0,0},
					   {1,0,0,0,0,0,1,0},
					   {0,1,0,0,0,0,0,1}};
		
		temp.a = tmp;
		
		long f[]={6,5,1,4,2,3,5,3},sum1,sum2;
		
		Matrix res = new Matrix();
		
		for(int i=0;i<8;i++)
	        res.a[i][i]=1;
		
		
		Long n = new Scanner(System.in).nextLong();
		
		 if(n==1) {
			 
			 System.out.println(2);
		 	 System.out.println(3);
		 	 
		 }
	
		 if(n==2) {
			 
			 System.out.println(1);
		 	 System.out.println(4);
			 
		 }

		 if(n==3) {
			 
			 System.out.println(6);
		 	 System.out.println(5);
			 
		 }
		
		 if(n>=4) {
			 
			 n=n-3;
			 
			 while(n != 0) {   //矩阵快速幂
				 
		        if((n & 1) != 0) {
		        	
		            res = multiply(res,temp,8,8,8);
		        }
		        n>>=1;
		        temp = multiply(temp,temp,8,8,8);
			 }
			 
			 sum1=sum2=0;
			 
			 for(int i=0;i<8;i++) {
				 sum1=(sum1+(f[i]*res.a[i][0])%99999999)%99999999;
				 sum2=(sum2+(f[i]*res.a[i][1])%99999999)%99999999;
			 }
			 
			 	System.out.println(sum1);
			 	System.out.println(sum2);
			 	
		 }
			 
	}	 

}

class Matrix {
	
	public long a[][] = new long[8][8];
	
}
