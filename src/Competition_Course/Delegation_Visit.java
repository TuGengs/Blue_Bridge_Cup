package Competition_Course;

public class Delegation_Visit {

	static int a[]={4,2,2,1,1,3};
	
	static int sum = 0;
	
	static void recursion(int n, int k) {
		
		if (n < 0) {
			
			return ;
			
		}
		
		if (k == 6) {
			
			if (n == 0) {
				
				sum ++;
				
			}
			
			return ;
			
		}
		
		for (int i = 0; i <= a[k]; i++) {
			
			recursion(n - i, k + 1);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		recursion(5, 0);
		
		System.out.println(sum);	// 101
		
	}
	
}
