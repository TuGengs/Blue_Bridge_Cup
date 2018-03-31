package Five_Zhenti;

// (i & 1) == 0
public class Four {
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 100; i++) {   
			if((i & 1) == 0)  //填空  
				System.out.println(i*i/2);   
			else  
				System.out.println((i*i-1)/2); 
			
		}
		
		
	}


}
