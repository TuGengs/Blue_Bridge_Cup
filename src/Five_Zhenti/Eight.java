package Five_Zhenti;

import java.util.Scanner;

public class Eight {
	
	static int candy[];
	
	static boolean judge(int candy[]) {
		
		int num = candy[0];
		
		for (int i = 1; i < candy.length; i++) {
			
			if (num != candy[i]) return false; 
			
		}
		
		return true;
		
	}
	
	static void recursion(int candy[], int k) {
		
		if (judge(candy)) {
			
			System.out.println(k);
			
			return ;
			
		}
		
		int add[] = new int[candy.length];
		
		for (int i = 0; i < candy.length; i++) {
			
			int left = i - 1;
			
			if (left == -1) left = candy.length - 1;
			
			add[left] = candy[i] / 2;
			
			candy[i] = candy[i] - candy[i] / 2;
			
		}
		
		for (int i = 0; i < candy.length; i++) {
			
			candy[i] += add[i];
			
		}
		
		int fill = 0;
		
		for (int i = 0; i < candy.length; i++) {
			
			if ((candy[i] & 1) == 1) {
				fill ++;
				candy[i] ++;
			}
			
		}
		
		recursion(candy, k + fill);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		candy = new int[n];
		
		for (int i = 0; i < n; i++) {
			
			candy[i] = sc.nextInt();
			
		}
		
		
		
		recursion(candy, 0);
		
		
	}
	
}







