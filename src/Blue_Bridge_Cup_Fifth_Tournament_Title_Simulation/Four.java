package Blue_Bridge_Cup_Fifth_Tournament_Title_Simulation;

public class Four {
	
	static int a[] = new int[21];
	
	static int dp[][] = new int[21][21];
	
	static int dfs(int l, int r) {
		
		if (l > r) {
			
			return 1;
			
		}
		
		if (l == r) {
			
			return a[l];
			
		}
		
		int ans = 0;
		
		for (int i = l; i <= r; i++) {
			
			int w = dfs(l, i - 1) * dfs(i + 1, r) + a[i];
			
			ans = Math.max(ans, w);
			
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		a[1] = 9; a[2] = 8; a[3] = 9; a[4] = 9; a[5] = 5;
		a[6] = 7; a[7] = 4; a[8] = 2; a[9] = 2; a[10] = 4;
		a[11] = 5; a[12] = 6; a[13] = 7; a[14] = 8; a[15] = 9;
		a[16] = 3; a[17] = 3; a[18] = 4; a[19] = 5; a[20] = 1;
		
		System.out.println(dfs(1, 20));		// 53071238
		
	}

}
