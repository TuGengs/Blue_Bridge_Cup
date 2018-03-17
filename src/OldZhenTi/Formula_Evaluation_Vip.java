package OldZhenTi;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 	m
 * Cn
 * 
 * @author tugeng
 *
 */
public class Formula_Evaluation_Vip {
	
	//组合计数
	static int fun(int n, int m) { 
			
        if(m>n)return 0;    
        
        if(m==0)return 1;
        
        return fun(n-1,m-1) + fun(n-1,m);
	        
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int k = sc.nextInt();
		
		double sum = 0;
		
		int nm = fun(n, m);
		
		for (int i = 0; i <= n; i++) {
			
			sum = sum + fun(n, i) * nm * Math.pow(i, k);
			
			sum = sum % 999101;
			
		} 

		DecimalFormat df = new DecimalFormat("0");
		
		System.out.println(df.format(sum));
		
	}

}
