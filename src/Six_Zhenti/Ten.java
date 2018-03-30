package Six_Zhenti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ten {

	@SuppressWarnings("rawtypes")
	static List li[];
	
	static int flag[];
	
	static int dp[][];
	
	static int v[];
	
	static void dfs(int u) {
		
		dp[u][1] = v[u];
		
		dp[u][0] = 0;
		
		flag[u] = 1;
		
		for (int i = 0; i < li[u].size(); i++) {
			
			if (flag[(Integer) li[u].get(i)] == 0) {
				
				dfs((Integer) li[u].get(i));
				
				dp[u][1] += Math.max(dp[(Integer) li[u].get(i)][0],
						dp[(Integer) li[u].get(i)][1]);
				
			}
			
			else {
				
				dp[u][1] = Math.max(dp[u][1], v[u]);	// ???

				dp[u][0] = Math.max(dp[u][0], 0);
				
			}
			
		}
		
 		
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		li = new ArrayList[n + 1];
		
		flag = new int[n + 1];
		
		v = new int[n + 1];
		
		dp = new int[n + 1][2];
		
		for (int i = 1; i <= n; i++) {
			
			v[i] = sc.nextInt();
			
			li[i] = new ArrayList<Integer>();
			
		}
		
		for (int i = 1; i < n; i++) {
			
			int a = sc.nextInt();
			
			int b = sc.nextInt();
			
			li[a].add(b);
			
			li[b].add(a);
			
		}

		dfs(1);
		
		int ans = -1;
		
		for(int i = 1; i <= n ; i++){
			
			ans = Math.max(ans,dp[i][1]);
			
			ans = Math.max(ans,dp[i][0]); 
			
		}  

		System.out.println(ans);
		
	}
	
}
