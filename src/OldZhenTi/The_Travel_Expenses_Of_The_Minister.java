package OldZhenTi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class The_Travel_Expenses_Of_The_Minister {

	public static int a[][];
	
	public static int max = 0;	// 最大的费用
	
	public static List<Integer> list = new ArrayList<Integer>();
	
	public static int caculate(int n) {
		
		return n * 10 + (1 + n) * n / 2;
		
	}
	
	public static void dfs(int p, int cost) {
		
		for (int j = 0; j < a[p].length; j++) {
			
			if (a[p][j] > 0 && !list.contains(j)) {
				
				list.add(j);
				
				dfs(j, cost + a[p][j]);
				
				list.remove(list.indexOf(j));
				
			}
			
		}
		
		if (cost > max) 
			max = cost;
		
		return ;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		a = new int[n + 1][n + 1];
		
		for (int i = 0; i < n - 1; i++) {
			
			int x1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			
			int cost = sc.nextInt();
			
			a[x1][x2] = cost;
			
			a[x2][x1] = cost;
			
		}
		
		for (int i = 1; i <= n; i++) {
		
			list.add(i);
			
			dfs(i, 0);
			
			list.remove(list.indexOf(i));

		}

		System.out.println(max);

	}

}
