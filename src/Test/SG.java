package Test;

import java.util.Arrays;
import java.util.Scanner;

// 两人博弈，非偏博弈，最后取的赢
// 三堆石头，规定序列取石头
public class SG {
	
	static int a[] = {1, 3, 7, 9};
	
	static int sg[];
	
	static int hash[];
	
	static void getSG(int n) {
		
		for (int i = 1; i <= n; i++) {
			
			Arrays.fill(hash, 0);
			
			for (int j = 0; a[j] <= i && j < a.length; j++) {
				
				hash[sg[i - a[j]]] = 1;
				
			}
			
			for (int j = 0; ; j++) {
				
				if (hash[j] == 0) {
					
					sg[i] = j;
					
					break;
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int k = sc.nextInt();
		
		sg = new int[1010];
		
		hash = new int[1010];
		
		getSG(4);
		
		if ((sg[n] ^ sg[m] ^ sg[k]) == 1) 
			System.out.println("win");
		else 
			System.out.println("lose");
		
	}

}
