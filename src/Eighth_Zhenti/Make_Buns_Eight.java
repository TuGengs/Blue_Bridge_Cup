package Eighth_Zhenti;

import java.util.Scanner;

public class Make_Buns_Eight {
	
	public static int min = Integer.MAX_VALUE;
	
	public static int[] rs;
	
	public static int judge(int a, int b) {
		
		int c = Math.max(a, b);
		
		int d = Math.min(a, b);
		
		a = c;
		
		b = d;
		
		while (b != 0){
			
			int x = a;
			
			a = b;
			
			b = x % b;
			
		}
		
		return a;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		int b[] = new int[a + 1];
		
		for (int i = 1; i < b.length; i++) {
			
			b[i] = sc.nextInt();
			
		}
		
		int flag = 0;
		
		for (int i = 1; i < b.length; i++) {
			
			for (int j = i + 1; j < b.length; j++) {
				
				if (judge(b[i], b[j]) == 1) {
					
					flag = 1;
					
					if ((b[i] * b[j] - (b[i] + b[j])) < min) {
						
						min = b[i] * b[j] - (b[i] + b[j]);
						
					}
					
				}
				
			}
			
		}
		
		if (flag == 0) {
			
			System.out.println("INF");
			
			return;
			
		}
		
		rs = new int[min + 1];
		
		rs[0] = 1;
		
		for (int i = 0; i < rs.length; i++) {
			
			for (int k = 1; k < b.length; k++) {
				
				if (rs[i] == 1) {
					
					if (i + b[k] > min) {
						
						continue;
						
					}
					
					rs[i + b[k]] = 1;
					
				}
				
			}
			
		}
		
		int sum = 0;
		
		for (int i = min; i >= 0; i--) {
			
			if (rs[i] == 0) {
				
				sum ++;
				
			}
			
		}
		
		System.out.println(sum);
		
	}

}
