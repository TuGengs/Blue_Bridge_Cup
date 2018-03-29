package Competition_Course;

public class Five_One {
	
	static int recursion(int m, int n) {	// m: 5角  n: 1元
		
		if (m < n) {
			
			return 0;
			
		}
		
		if (n == 0) {
			
			return 1;
			
		}
		
		return recursion(m - 1, n) + recursion(m, n - 1);
		
	}

	public static void main(String[] args) {
		
		System.out.println(recursion(10, 5));
		
	}
	
}
