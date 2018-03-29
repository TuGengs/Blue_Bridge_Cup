package Competition_Course;

public class China {

	static char[][] a = {{'从','我','做','起','振'},  
             			 {'我','做','起','振','兴'},  
             			 {'做','起','振','兴','中'},  
             			 {'起','振','兴','中','华'}};  
	
	static char[] bp = new char[8];
	
	static int sum = 0;
	
	static boolean in(int x, int y) {
		
		if (x >= 0 && x < a.length && y >= 0 && y < a[0].length) 
			return true;
		
		return false;
		
	}
	
	static void dfs(int x, int y, int step) {
		
		if (!in(x, y)) return ;
		
		bp[step] = a[x][y];
		
		if (step == 7) {
			
			if ("从我做起振兴中华".equals(String.valueOf(bp))) {
				
				sum += 1;
				
			}
			
			return ;
			
		}
		
		dfs(x + 1, y, step + 1);
		
		dfs(x, y + 1, step + 1);
		
	}
	
	public static void main(String[] args) {
		
		dfs(0, 0, 0);
		
		System.out.println(sum);
		
	}
	
}
