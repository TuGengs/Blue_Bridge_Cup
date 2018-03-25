package Blue_Bridge_Cup_Fifth_Tournament_Title_Simulation;

public class One {

	public static void main(String[] args) {
		
		int n = 101;
		
		int middle = (n + 1) / 2;
		
		int sum = 0;
		
		int a[][] = new int[n + 1][n + 1];
		
		int num = 1;

		for (int i = 1; i < a.length; i++) {
			
			for (int j = 1; j < a[0].length; j++) {
				
				a[i][j] = num;
				
				num ++;
				
			}
			
		}
		
		
		for (int i = 1; i <= middle - 1; i++) {
			
			for (int j = middle - i + 1; j <= middle + i - 1; j++) {
				
				sum += a[i][j];
				
				sum += a[n - i + 1][j];
				
			}
			
		}
		
		for (int i = 1; i <=n ; i++) 
			
			sum += a[middle][i];
		
		
		System.out.println(sum);
		
		
	}
	
}
