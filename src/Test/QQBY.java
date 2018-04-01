package Test;

import java.util.Arrays;
import java.util.Scanner;

public class QQBY {

	static int a[] = {1, 3, 7, 8};
	
	static int sg[];
	
	static int hash[];
	
	static void getsg(int n) {
		
		for (int i = 1; i <= 1000; i++) {
			
			Arrays.fill(hash, 0);
			
			for (int j = 0; j < a.length && a[j] <= i; j++) {
				
				hash[sg[i - a[j]]] = 1;
				
			}
			
			for (int j = 0 ; ; j ++) {
				
				if (hash[j] == 0) {
					
					sg[i] = j;
					
					break;
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nc = sc.nextInt();
		
		for (int i = 0; i < nc; i++) {
		
			int n = sc.nextInt();
			
			sg = new int[1010];
			
			hash = new int[1010];
			
			getsg(1000);
			
			if (sg[n] == 1) System.out.println(0);
			
			else System.out.println(1);
		
		}
		
		
	}
	
}
