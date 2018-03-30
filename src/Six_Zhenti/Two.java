package Six_Zhenti;

// 6
public class Two {
	
	static int translate(int sum) {
		
		int n = 0;
		
		while (sum > 0) {
			
			n += sum % 10;
			
			sum /= 10;
			
		}
		
		return n;
		
	}
	
	static int times = 0;

	public static void main(String[] args) {
		
		for (int i = 1; i < 100000; i++) {
			
			int sum = i * i * i;
			
			if (i == translate(sum)) {
				
				times ++;
				
				System.out.println(i + " " + sum);
				
			}
			
		}
	}
	
}
