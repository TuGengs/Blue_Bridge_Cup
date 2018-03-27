package Blue_Bridge_Cup_Fifth_Tournament_Title_Simulation;

import java.util.Scanner;

public class Ten {

	static int f[] = {1, 3, 7, 9};
	
	static int sg[] = new int[1010];
	
	static int s[] = new int[1010];
	
	static void getsg(int n) {
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 0; j < 4 && f[j] <= i; j++)
				s[sg[i - f[j]]] = 1;
			
			for (int j = 0; ; j++) {
				
				if (s[j] == 0) {
					
					sg[i] = j; break;
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int n, m, k;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		m = sc.nextInt();
		
		k = sc.nextInt();
		
		getsg(1000);
		
		if ((sg[n] ^ sg[m] ^ sg[k]) == 1) 
			System.out.println("win");
		else 
			System.out.println("lose");
		
		
	}
	
}
