package Competition_Course;

public class Thirty_Nine_Steps {

	static int sum = 0;
	
	static void dfs(int num, int step) {
		
		if (num > 39)
			
			return ;
			
		if (num == 39) {
			
			if (step % 2 == 0) 
				sum += 1;
			
			return ;
			
		}
		
		
		dfs(num + 1, step + 1);
		
		dfs(num + 2, step + 1);
		
		
	}
	
	public static void main(String[] args) {
		
		dfs(0, 0);
		
		System.out.println(sum);	// 51167078
		
	}
	
}
