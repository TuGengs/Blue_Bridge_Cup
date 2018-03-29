package Competition_Course;

public class Stack_Order {
	
	static int recursion(int x, int y) { 	// x: 左边  y: 里边
		
		if (x == 0) return 1;
		
		if (y == 0) return recursion(x - 1, y + 1);
		
		return recursion(x - 1, y + 1) + recursion(x, y - 1);
		
	}

	public static void main(String[] args) {
		
		System.out.println(recursion(16, 0));	// 35357670
		
	}
	
}
