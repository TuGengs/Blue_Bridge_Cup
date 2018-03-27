package Blue_Bridge_Cup_Fifth_Tournament_Title_Simulation;

// 258247
public class Six2 {

	static int a[] = {258055, 69760, 163908, 249856, 53440, 151684, 
			77958, 176134, 8262, 229446, 245953, 20676, 45189, 69826, 
			131075, 28672, 155717, 118851, 221318, 254150, 135235, 
			86083, 41089, 28743, 32772, 225475, 118855, 249862, 184320, 217154};
	
	static boolean dp[] = new boolean[1000000];
	
	public static void main(String[] args) {
		
		dp[0] = true;
		
		// 必须取不同的
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < 258248; j++) {
				
				dp[j] = dp[j] | dp[j ^ a[i]];

				
			}
			
		}
		
		int ans = 0;
		
		for (int i = 258248 - 1; i >= 0; i--) {
			
			if (dp[i]) {
				
				ans = i;
				
				break;
				
			}
			
			
		}
		
		System.out.println(ans);	// 258247
		
		
	}
	
}
