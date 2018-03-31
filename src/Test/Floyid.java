package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Floyid {
	
	static int P[][];
	
	static int D[][];
	
	static void floyid() {
		
		for (int k = 1; k < P.length; k++) 
			for (int i = 1; i < P.length; i++) 
				for (int j = 1; j < P.length; j++)
					P[i][j] = Math.min(P[i][j], (P[i][k] + P[k][j]));

	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n; // 顶点
		
		int m; // 边
		
		String one[] = bf.readLine().split(" ");
		
		n = Integer.valueOf(one[0]);
		
		m = Integer.valueOf(one[1]);
		
		P = new int[n + 1][n + 1];
		
		D = new int[n + 1][n + 1];
		
		for (int i = 1; i <= n; i ++) {
			
			for (int j = 1; j <= n; j++) {
				
				if (i != j) 
					P[i][j] = Integer.MAX_VALUE / 2;
				
				D[i][j] = j;
				
			}
			
		}
		
		for (int i = 0; i < m; i++) {
			
			String[] strs = bf.readLine().split(" ");
			
			P[Integer.valueOf(strs[0])][Integer.valueOf(strs[1])] = Integer.valueOf(strs[2]);
			
		}
		
		floyid();
		
		for (int i = 2; i <= n; i++)
			
			System.out.println(P[1][i]);
		
		
	}

}
