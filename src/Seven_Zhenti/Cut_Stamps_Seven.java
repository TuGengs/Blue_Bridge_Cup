package Seven_Zhenti;

public class Cut_Stamps_Seven {

	static int dx[] = {0, -1, 0, 1};
	
	static int dy[] = {-1, 0, 1, 0};
	
	static int a[][] = new int[3][4];
	
	static int times = 0;
	
	static int times2 = 0;
	
	public static boolean overstep(int x, int y) {
		
		if (x < 0 || y < 0 || x > a.length - 1 || y > a[0].length - 1)
			return false;
		
		return true;
		
	}
	
	
	public static void dfs(int x, int y, int time) {
		
		if (time == 5) {
			
			times ++;
			
			return ;
			
		}
		
		if (a[x][y] == 0) {
			
			
			for (int i = 0; i < 4; i++) {
				
				if (overstep(x + dx[i], y + dy[i])) {
					
					a[x][y] = 1;
					
					dfs(x + dx[i], y + dy[i], time + 1);
					
					a[x][y] = 0;
					
				}
				
			}

			
		}
		
	}
	
	public static void dfs2(int x, int y, int time) {
		
		if (x == 1 && y == 1)
			
			return ;
		
		if (time == 5) {
			
			times2 ++;
			
			return ;
			
		}
		
		if (a[x][y] == 0) {
			
			for (int i = 0; i < 4; i++) {
				
				if (overstep(x + dx[i], y + dy[i])) {
					
					a[x][y] = 1;
					
					dfs2(x + dx[i], y + dy[i], time + 1);
					
					a[x][y] = 0;
					
				}
				
			}

			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		dfs(1, 1, 0);
		
		a = new int[3][4];
		
		dfs2(0, 0, 1);
		
		System.out.println(times * 2 + times2 * 4);
		
	}
	
}
