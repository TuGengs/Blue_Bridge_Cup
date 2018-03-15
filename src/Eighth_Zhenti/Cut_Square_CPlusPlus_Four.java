package Eighth_Zhenti;

/**
 * 
 * C/C++组:第四题 剪格子
 * 
 * @author tugeng
 *
 */
public class Cut_Square_CPlusPlus_Four {
	
	public static int Square[][];
	
	public static int nums = 0;
	
	public static boolean judge() {
		
		for (int i = 1; i < Square.length; i++) {
			
			for (int j = 1; j < Square[i].length; j++) {
				
				if (Square[i][j] == 1 && Square[7 - i][7 - j] != 0) {
					
					return false;
					
				}
				
			}
			
		}
		
		return true;
		
	}
	
	public static void dfs(int x, int y, int times) {
		
		if (times == 6 * 3) {
			
			if (judge()) {
			
				nums ++;
				
			}
			
			return ;
			
		}
		
		
		if (Square[x][y] == 0) {
			
			if (x > 1) {
				Square[x][y] = 1;
				dfs(x - 1, y, times + 1);
				Square[x][y] = 0;
			}
			
			if (x < 6) {
				
				Square[x][y] = 1;
				dfs(x + 1, y, times + 1);
				Square[x][y] = 0;
				
			}
			
			if (y > 1) {
				
				Square[x][y] = 1;
				dfs(x, y - 1, times + 1);
				Square[x][y] = 0;
				
			}
			
			if (y < 6) {
				
				Square[x][y] = 1;
				dfs(x, y + 1, times + 1);
				Square[x][y] = 0;
				
			}
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Square = new int[7][7];
		
		dfs(1, 1, 0);
		
		System.out.println(nums / 4);	//旋转对称
		
	}

}
