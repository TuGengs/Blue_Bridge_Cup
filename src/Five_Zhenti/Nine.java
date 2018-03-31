package Five_Zhenti;

import java.util.Scanner;

public class Nine {
	
	static int mod = 1000000007;
	
	static long map[][];
	
	static long state[][][][];
	
	static int m, n, num;
	
	static long dfs(int i, int j, int k, int v) {
		
		long s = 0;
		
		long t = 0;
		
		if(state[i][j][k][v + 1] != -1) {
			
			return state[i][j][k][v + 1];
			
		}
		
		if (i == m && j == n) {
			
			if (k == num) {
				
				state[m][n][k][v + 1] = 1;
				
				return state[m][n][k][v + 1];
				
			}
			
			else if (k == num - 1 && map[m][n] > v) {
				
				state[m][n][k][v + 1] = 1;
				
				return state[m][n][k][v + 1];
				
			}
			
			else {
				
				state[m][n][k][v + 1] = 0;
				
				return state[m][n][k][v + 1];
				
				
			}
			
			
		}
		
		else {
			
			
			if (map[i][j] > v) {
				
				t = map[i][j];
				
				if (i + 1 <= m)
					
					s = (s + dfs(i + 1, j, k + 1, (int) t) % mod 
							+ dfs(i + 1, j, k, v) % mod) % mod;
				
				if (j + 1 <= n) 
					
					s = (s + dfs(i, j + 1, k + 1, (int) t) % mod 
							+ dfs(i, j + 1, k, v) % mod) % mod;
				
				
			}
			
			else {
				
				if (i + 1 <= m)
					s = (s + dfs(i + 1, j, k, v) % mod) % mod;
				
				if (j + 1 <= n) 
					s = (s + dfs(i, j + 1, k, v) % mod) % mod;
				
			}
			
			state[i][j][k][v + 1] = s % mod;
			
			
			return state[i][j][k][v + 1];
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		map = new long[60][60];
		
		state = new long[60][60][15][15];
		
		for (int i = 0; i < 60; i ++) 
			for (int j = 0; j < 60; j ++) 
				for (int k = 0; k < 15; k ++) 
					for (int p = 0; p < 15; p++)
						state[i][j][k][p] = -1;
		
		m = sc.nextInt();
		
		n = sc.nextInt();
		
		num = sc.nextInt();
		
		
		for (int i = 1; i <= m; i++) {
			
			for (int j = 1; j <= n; j++) {
				
				map[i][j] = sc.nextLong();
				
			}
			
		}
		
		dfs(1, 1, 0, -1);
		
		System.out.println(state[1][1][0][0]);
		
		
		
	}
	
}
