package algorithm;

import java.util.Scanner;

/**
 * 
 * T 设有N*N的方格图(N<=10),我们将其中的某些方格中填入正整数,而其他的方格中则放入数字0。
 * 	 某人从图的左上角的A 点(1,1)出发，可以向下行走，也可以向右走，直到到达右下角的B点(N,N)。
 * 	 在走过的路上，他可以取走方格中的数（取走后的方格中将变为数字0）。
 * 	 此人从A点到B 点共走两次，试找出2条这样的路径，使得取得的数之和为最大。
 * 
 * 
 * @author tugeng
 *
 */
public class Square_Fetch_Number_Vip2 {
	
	public static int square[][][][] = new int[10][10][10][10];
	
	public static int n;
	
	public static int a[][] = new int[10][10];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		while (true) {
			
			int a1 = sc.nextInt();
			
			int a2 = sc.nextInt();
			
			int a3 = sc.nextInt();
			
			if (a1 == 0 && a2 == 0 && a3 == 0) {
				
				break;
				
			}
			
			a[a1][a2] = a3;
			
		}
		
		for (int i=1;i<=n;++i){
			
			for (int j=1;j<=n;++j){
				
				for (int k=1;k<=n;++k){
					
					for (int l=1;l<=n;++l){
						
	                    int tmp=0;
	                    
	                    tmp=Math.max(tmp,square[i-1][j][k-1][l]);
	                    
	                    tmp=Math.max(tmp,square[i-1][j][k][l-1]);
	                    
	                    tmp=Math.max(tmp,square[i][j-1][k-1][l]);
	                    
	                    tmp=Math.max(tmp,square[i][j-1][k][l-1]);
	                    
	                    if (i==k&&j==l) {
	                    	
	                    		square[i][j][k][l]=tmp+a[i][j];
	                    	
	                    }
	                    
	                    else {
	                    	
	                    		square[i][j][k][l]=tmp+a[i][j]+a[k][l];
	                    	
	                    }
	                    
	                    
	                }
					
	            }
				
	        }
			
	    }
		
		
		System.out.println(square[n][n][n][n]);
		
		
	}
	
	
}










