package OldZhenTi;

import java.util.Scanner;

/**
 * 
 * T +--*--+--+
 * 	 |10* 1|52|
 * 	 +--****--+
 *   |20|30* 1|
 *   *******--+
 *   | 1| 2| 3|
 *   +--+--+--+ 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Shear_Lattice {
	
	public static int a[][];
	
	public static int b[][];
	
	public static int times = Integer.MAX_VALUE;
	
	public static void dfs(int i, int j, int sum, int self, int count) {
		
//		System.out.println(i + " " + j + " " + sum + " " + self + " " + count);
		
		if (sum > self) {
			
			return ;
			
		}
		
		if (sum == self) {
			
			if (count < times)
				times = count;
			
			return ;
			
		}
		
		if (b[i][j] == 1) {
			
			return ;
			
		}
		
		if (b[i][j] == 0) {
			
			if (i > 1 && b[i][j] == 0) {
				b[i][j] = 1;
				dfs(i - 1, j, sum + a[i][j], self, count + 1);
				b[i][j] = 0;
			}
			if (i < a.length - 1 && b[i][j] == 0) {
				b[i][j] = 1;
				dfs(i + 1, j, sum + a[i][j], self, count + 1);
				b[i][j] = 0;
			}
			if (j > 1 && b[i][j] == 0) {
				b[i][j] = 1;
				dfs(i, j - 1, sum + a[i][j], self, count + 1);
				b[i][j] = 0;
			}
			if (j < a[0].length - 1 && b[i][j] == 0) {
				b[i][j] = 1;
				dfs(i, j + 1, sum + a[i][j], self, count + 1);
				b[i][j] = 0;
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();	//j
		
		int n = sc.nextInt();	//i
		
		a = new int[n + 1][m + 1];
		
		b = new int[n + 1][m + 1];
		
		int sums = 0;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= m; j++) {
				
				a[i][j] = sc.nextInt();
				
				sums += a[i][j];
				
			}
			
		}
		
		dfs(1, 1, 0, sums / 2, 0);
		
		System.out.println(times);
		
	}
	
}
