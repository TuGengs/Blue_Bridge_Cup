package Competition_Course;

public class Por_Una_Cabeza {

	static int d = 0;
	
	static int x, y;
	
	static int extgcd(int a, int b) {
		
		if (b == 0) {
			
			x = 1;	y = 0;
			
			return a;
			
		} else {
			
			d = extgcd(b, a % b);
			
			int temp = x;
			
			x = y;
			
			y = temp - a / b * y;
			
			return d;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		extgcd(-127, 97);
		
		System.out.println(x + y);
		
	}
	
}
