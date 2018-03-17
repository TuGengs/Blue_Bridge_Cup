package Seven_Zhenti;

public class Birthday_Candle {
	
	public static void main(String[] args) {
		
		for (int x = 1; x <= 100; x++) {
			
			for (int n = 1; n <= 100; n++) {
				
				if ((2 * x + n) * (n + 1) == 472)
					
					System.out.println(x + " " +  n);
				
			}
			
		}
		
		
	}

}
