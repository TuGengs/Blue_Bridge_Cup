package Six_Zhenti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nine {
	
	static int mod = 1000000000 + 7;
	
	static int a[][] = new int[7][7];
	
	static int num = 0;
	
	static int value = 0;
	
	static void recursion(int n, List<Integer> list) { // n个骰子
		
		if (n == num) {
			
			value = (value + list.size()) % mod;
			
			return ;
		}

		for (int i = 0; i < list.size(); i++) {
			
			int current = list.get(i);
			
			List<Integer> l = new ArrayList<Integer>();
			
			for (int j = 1; j <= 6; j++) {
				
				if (a[current][j] == 0) {
					
					l.add(j);
					
				}
				
			}
			
			recursion(n + 1, l);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		int m = sc.nextInt();
		
		for (int i = 1; i <= m; i++) {
			
			int x = sc.nextInt();
			
			int y = sc.nextInt();
			
			a[x][y] = 1;
			
			a[y][x] = 1;
			
		}
		
		int v = 1;
		
		// 快速幂
		for (int i = 1; i <= num; i++) {
			
			v = (v * 4) % mod;
			
		}
		
		List<Integer> xl = new ArrayList<Integer>();
		
		xl.add(1); xl.add(2); xl.add(3); xl.add(4); xl.add(5); xl.add(6);
		
		recursion(1, xl);
		
//		System.out.println(v);
		
		System.out.println((v * value) % mod);
		
		
	}

}





