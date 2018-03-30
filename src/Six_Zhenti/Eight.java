package Six_Zhenti;

public class Eight {

	static int recursion(int m) { // m : 瓶盖   init n
		
		if (m < 3) return 0;
			
		return m / 3 + recursion(m / 3 + m % 3);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(10000 + recursion(10000));
		
	}
	
}
