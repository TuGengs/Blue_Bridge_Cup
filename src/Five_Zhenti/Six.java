package Five_Zhenti;

// 12 + 2 // 2/6*6/5      1/9*9/5 
public class Six {
	
	static int fenzi[] = new int[10];
	
	static int fenmu[] = new int[10];
	
	static int sum = 0;
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			
			fenzi[i] = i;
			
			fenmu[i] = i;
			
		}
		
		for (int i = 1; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				
				for (int k = 1; k < 10; k++) {
					
					for (int p = 1; p < 10; p++) {
			
						if (((fenzi[i] * 1.0) / fenmu[j] * (fenzi[k] * 1.0) / fenmu[p]) == ((fenzi[i] * 10 + fenzi[k]) * 1.0) / (fenmu[j] * 10 + fenmu[p])) {
							
							if (fenzi[i] == fenzi[j] && fenzi[k] == fenmu[p]) continue;
							
							System.out.println(fenzi[i] + "/" + fenzi[j] 
									+ " " + fenzi[k] + "/" + fenmu[p]);
							
							sum += 1;
							
						}
						
					}
					
				}
				
				
				
			}
			
			
		}
		
		System.out.println(sum);
		
	}

}
 