package algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 
 * 
 * T 科学家     问题
 *   i	       ki          (1…n)编号  每个问题的计算都必须依赖前一个问题的计算结果
 *   
 * 	 每个教授的每个问题都用一个数 ai, j  来描述，
 * 	 i（1≤i≤n）是科学家的编号，
 * 	 j（1≤j≤ ki ）是问题的编号
 * 	 ai, j  表示解决这个问题所需资源单位的数量。
 * 
 * 	 所谓“坏对”，就是相邻两个问题中，后一个问题需求的资源比前一个问题少。
 * 	 别忘了，对于同一个科学家给出的问题，计算它们的相对顺序必须是固定的。
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */

public class Beaver_Calculator {
	
	public static int MAX_N = 200000 + 100;
	
	static class type {
		
		public int t;
		
		public long a;
		
		public int i;
		
		type(int t, long a, int i) {
			
			this.a = a;	// 所需要资源
			this.i = i;	// 科学家编号
			this.t = t; // 最大坏对数
			
		}
		
	}
	
	public static type[] d;
	
	public static int n;
	
	public static int tot = 0;
	
	public static int ans = 0;
	
	public static void main(String[] args) {
		
		d = new type[MAX_N];
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			long k, a, x, y, m;
			  
			k = sc.nextLong();
			a = sc.nextLong();
			x = sc.nextLong();
			y = sc.nextLong();
			m = sc.nextLong();
			
			int t = 0;
			long b = 0;
			
			for(int j = 0; j < k; j++) {
				
				if(tot < 2e5) d[tot++] = new type(t, a, i);
				
	            b = (a * x + y) % m;
	            
//	            System.out.println(b);
	            
	            if(b < a && j != k - 1) 
	            		t++;
	            
	            a = b;
	            
			}
			
			ans = Math.max(ans, t);
			
		}
		
		System.out.println(ans);
		
		 if(tot < 2e5) {
			 
			 Arrays.sort(d, 0, tot, new Comparator<type>() {
//				a;	// 所需要资源
//				i;	// 科学家编号
//				t; // 最大坏对数
				@Override
				public int compare(type x, type y) {

					if(x.t == y.t) 
						return (x.a < y.a || (x.a == y.a && x.i < y.i)) ? 1 : -1;
					else
				        return x.t < y.t ? 1 : -1;
					
				}
				 
			});
		   
		        for(int lc = 0; lc < tot; lc++) {
		        	
		        		System.out.println(d[lc].a + " " + d[lc].i);
		        		
		        }

		 }
		 
		
	}
	
	
}
















