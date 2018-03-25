package Blue_Bridge_Cup_Fifth_Tournament_Title_Simulation;

public class Three {
	
	static int d[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}}; 

	static int a[][];
	
	static int b[][];
	
	static boolean judge2(int x, int y) {
		
		if (x >= 1 && x < a.length && y >= 1 && y < a[0].length) 
				return true;
		
		return false;
			
	}
	
	static boolean judge(int x, int y) {
		
		if (b[x][y] != 0) return false;
		
		for (int i = 0; i < d.length; i++) {
			
			int dx = x + d[i][0];
			
			int dy = y + d[i][1];
			
			if (!judge2(dx, dy)) {
				
				return true;
				
			}
			
			if (b[dx][dy] != 0)
				return true;
			
			
		}
		
		return false;

		
	}
	
	static int ans = 0;
	
	static void dfs(int step, int value) {
		
		ans = Math.max(value, ans);
		
		for (int i = 1; i < a.length; i++) {
			
			for (int j = 1; j < a[0].length; j++) {
				
				if (judge(i, j)) {
					
					for (int pi = 1; pi < a.length; pi++) {
						
						for (int pj = 1; pj < a[0].length; pj++) {
							
							if (pi == i && pj == j) {
								
								continue;
								
							}
							
							if (a[i][j] == a[pi][pj] && judge(pi, pj)) {
								
								b[i][j] = b[pi][pj] = 1;
								
								dfs(step + 1, value + step * (a[i][j]));
								
								b[i][j] = b[pi][pj] = 0;
								
							}
							
							
						}
						
					}
					
					
				}
				
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		a = new int[5][5];
		
		b = new int[5][5];
		
		a[1][1] = 1; a[1][2] = 4; a[1][3] = 2; a[1][4] = 5; 
		a[2][1] = 2; a[2][2] = 1; a[2][3] = 2; a[2][4] = 1;
		a[3][1] = 3; a[3][2] = 1; a[3][3] = 3; a[3][4] = 2; 
		a[4][1] = 2; a[4][2] = 5; a[4][3] = 3; a[4][4] = 4;
		
		dfs(1, 0);
		
		System.out.println(ans);	// 89
		
		
	}
	
}
