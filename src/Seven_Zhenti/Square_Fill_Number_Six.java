package Seven_Zhenti;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Square_Fill_Number_Six {
	
	static int a[][] = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}};
	
	static int b[][] = new int[3][4];
	
	static int c[] = new int[10];
	
	static Set<String> set = new HashSet<String>();
	
	static int times = 0;
	
	static boolean judge3() {
		
		for (int i = 0; i < c.length; i++) {
			
			if (c[i] > 1) return false;
			
		}
		
		return true;
		
	}
	
	static boolean judge2(int x, int y) {
		
		if (x < 0 || x > a.length - 1 || y < 0 || y > a[0].length - 1) {
			
			return false;
			
		}
		
		return true;
		
	}
	
	static boolean judge(int x, int y, int i) {
		
		if (a[x][y] == 1) return false;
		
		if (judge2(x - 1, y - 1)) {
			
			if (Math.abs(b[x - 1][y - 1] - i) <= 1) {
				
				return false;
				
			}
			
		}
		
		if (judge2(x, y - 1)) {
			
			if (Math.abs(b[x][y - 1] - i) <= 1) {
				
				return false;
				
			}
			
		}

		if (judge2(x + 1, y - 1)) {
	
			if (Math.abs(b[x + 1][y - 1] - i) <= 1) {
		
				return false;
				
			}
	
		}

		if (judge2(x - 1, y)) {
			
			if (Math.abs(b[x - 1][y] - i) <= 1) {
				
				return false;
				
			}
			
		}

		if (judge2(x + 1, y)) {
			
			if (Math.abs(b[x + 1][y] - i) <= 1) {
				
				return false;
				
			}
			
		}

		if (judge2(x - 1, y + 1)) {
			
			if (Math.abs(b[x - 1][y + 1] - i) <= 1) {
				
				return false;
				
			}
			
		}

		if (judge2(x, y + 1)) {
			
			if (Math.abs(b[x][y + 1] - i) <= 1) {
				
				return false;
				
			}
			
		}

		if (judge2(x + 1, y + 1)) {
			
			if (Math.abs(b[x + 1][y + 1] - i) <= 1) {
				
				return false;
				
			}
			
		}
		
		return true;
		
		
	}
	
	public static void dfs(int x, int y, int times) {
		
		if (!judge2(x, y)) return ;
		
		if (times == 10) {
			
			if (judge3()) {
				
				String sg = "";
				
				for (int k = 0; k < b.length; k++) {
					
					for (int kj = 0; kj < b[0].length; kj++) {
						
						sg = sg + b[k][kj];
						
					} 
					
				}

				set.add(sg);
				
				
				Square_Fill_Number_Six.times ++;
				
			}
			
			return ;
			
		}
		
		for (int i = 0; i <= 9; i++) {
			
			if (c[i] == 0) {
			
			if (judge(x, y, i)) {
				
					if (x > 0) {
						a[x][y] = 1;
						c[i] = 1;
						b[x][y] = i;
						dfs(x - 1, y, times + 1);
						a[x][y] = 0;	
						c[i] = 0;
						b[x][y] = -2;
					}
							
					if (x < a.length - 1) {
						a[x][y] = 1;
						c[i] = 1;
						b[x][y] = i;
						dfs(x + 1, y, times + 1);
						a[x][y] = 0;	
						c[i] = 0;
						b[x][y] = -2;
					}
						
					if (y > 0) {
						a[x][y] = 1;
						c[i] = 1;
						b[x][y] = i;
						dfs(x, y - 1, times + 1);
						a[x][y] = 0;	
						c[i] = 0;
						b[x][y] = -2;
					}
					
					if (y < a[0].length - 1) {
						a[x][y] = 1;
						c[i] = 1;
						b[x][y] = i;
						dfs(x + 1, y + 1, times + 1);
						a[x][y] = 0;	
						c[i] = 0;
						b[x][y] = -2;
						
					}
			
				
				}
		
			}
			
		}
			
	}
	
	public static void main(String[] args) {
		
		Arrays.fill(b[0], -2);
		Arrays.fill(b[1], -2);
		Arrays.fill(b[2], -2);
		
		dfs(0, 3, 0);
		
		System.out.println(set.size());
		
//		System.out.println(times);
		
	}

}
