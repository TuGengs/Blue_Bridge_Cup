package Improve;

import java.util.Scanner;

public class The_Legend_Of_Wang_And_Afte {
	
	public static int a[][];
	
	public static int times = 0;
	
	public static int dp[];
	
	public static int gwx;
	
	public static int gwy;
	
	public static boolean preinit(int x) {
		
		if (x > 0 && x < a.length) {
			
			return true;
			
		} 
		
		return false;
		
	}
	
	public static void initA(int x, int y) {
		
		a[x][y] = 1;
		
		if (preinit(x - 1)) {
			
			a[x - 1][y] = 1;
			
			if (preinit(y - 1))
				
				a[x - 1][y - 1] = 1;
			
			if (preinit(y + 1))
				
				a[x - 1][y + 1] = 1;
			
		}
		
		if (preinit(y - 1)) {
			
			a[x][y - 1] = 1;
			
			if (preinit(x - 1)) {
				
				a[x - 1][y - 1] = 1;
				
			}
			
			if (preinit(x + 1)) {
				
				a[x + 1][y - 1] = 1;
				
			}
			
		}
		
		if (preinit(y + 1)) {
			
			a[x][y + 1] = 1;
			
			if (preinit(x + 1)) {
				
				a[x + 1][y + 1] = 1;
				
			}
			
			if (preinit(x - 1)) {
				
				a[x - 1][y + 1] = 1;
				
			}
			
			
		}
		
		
		if (preinit(x + 1)) {
			
			a[x + 1][y] = 1;
			
		}
		
		
	}
	
	public static boolean judge(int x, int y) {
		
		if (a[x][y] == 1) {	//等于1为国王占领的范围
			
			return false;
			
		}
		
		int k = 1;
		
		for (int i = x - 1; i > 0; i--, k++) {
			
			if (a[i][y] == 2) {
				
				return false;
				
			}
			
			if (preinit(y - k)) {
			
				if (a[i][y - k] == 2) {
					
					return false;
					
				}
				
			}
			
			if (preinit(y + k)) {
				
				if (a[i][y + k] == 2) {
					
					return false;
					
				}
				
			}
			
			
		}
		
		for (int j = 1; j < y; j++) {
			
			if (a[x][j] == 2) {
				
				return false;
				
			}
			
		}

		return true;
		
		
	}
	
	public static void dfs(int current) {
		
		if (current == a.length) {
			
//			for (int i = 1; i < a.length; i++) {
//			
//				for (int j = 1; j < a.length; j++) {
//					
//					System.out.print(a[i][j] + " ");
//					
//				}
//				
//				System.out.println();
//				
//			}
			
			times ++;
			
			return ;
			
		}
		
		for (int j = 1; j < a.length; j++) {
			
			if (judge(current, j)) {
				
				a[current][j] = 2;
				
				dp[current] = j;
				
				dfs(current + 1);
				
				a[current][j] = 0;
				
				dp[current] = 0;
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		a = new int[n + 1][n + 1];
		
		dp = new int[n + 1];
		
		gwx = sc.nextInt();
		
		gwy = sc.nextInt();
		
		initA(gwx, gwy);
		
		dfs(1);
		
		System.out.println(times);
		
	}

}
