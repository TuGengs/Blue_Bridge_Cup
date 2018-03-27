package Blue_Bridge_Cup_Fifth_Tournament_Title_Simulation;

public class Six {

	static int a[] = {258055, 69760, 163908, 249856, 53440, 151684, 
			77958, 176134, 8262, 229446, 245953, 20676, 45189, 69826, 
			131075, 28672, 155717, 118851, 221318, 254150, 135235, 
			86083, 41089, 28743, 32772, 225475, 118855, 249862, 184320, 217154};
	
	public static void main(String[] args) {
		
		int max = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				for (int k = 0; k < a.length; k++) {
					
					if (i == j || i == k || j == k) {
						
						continue;
						
					}
					
					if ((a[i] ^ a[j] ^ a[k]) > max) System.out.println(i + " " + j + " " + k);
					
					max = Math.max(a[i] ^ a[j] ^ a[k], max);
					
					
				}
				
			}
			
		}
		
		
		System.out.println(max);	// 258247
		
	}
	
}
