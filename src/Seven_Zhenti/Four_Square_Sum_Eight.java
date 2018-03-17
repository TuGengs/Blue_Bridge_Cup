package Seven_Zhenti;

import java.util.Scanner;

public class Four_Square_Sum_Eight {
	

	public static void main(String[] args) {
		
		int n = new Scanner(System.in).nextInt();
		
		for (int i = 0; i < 3000; i++) {
			
			for (int j = i; j < 3000; j++) {
				
				for (int k = j; k < 3000; k++) {
					
					if (Math.pow((n - i * i - j * j - k * k), 0.5) 
							- (int) Math.pow((n - i * i - j * j - k * k), 0.5) == 0) {
						
						System.out.println(i + " " + j + " " + k + " " 
								+ (int)Math.pow((n - i * i - j * j - k * k), 0.5));
						
						return ;
						
					}  
					
				}
				
			}
			
		}
		
		
	}
	
	
}
