package OldZhenTi;

import java.util.Scanner;

/**
 * 
 * T http://lx.lanqiao.cn/problem.page?gpid=T125
 * 
 * @author tugeng
 *
 */
public class Langton_Ant {
	
	public static int a[][];
	
	public static void PrintA() {
		
		for (int i = 1; i < a.length; i++) {
			
			for (int j = 1; j < a[0].length; j++) {
				
				System.out.print(a[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void dfs(int prex, int prey, int x, int y, int sn, int k) {	// sn: 0123 UDLR表示
		
		if (x < 0 || x >= a.length || y < 0 || y >= a.length) {
			
			System.out.println(prex + " " + prey);
			
			return ;
			
		}
		
		if (k == -1) {	//坑点
			
//			PrintA();
			
			System.out.println((prex - 1) + " " + (prey - 1));
			
			return ;
			
		}
		
		sn = translate(a[x][y], sn);
		
		switch (sn) {
		
		case 0:
			
			a[x][y] = (a[x][y] + 1) % 2;
			
			dfs(x, y, x - 1, y, sn, k - 1);
			
			break;
			
		case 1:
			
			a[x][y] = (a[x][y] + 1) % 2;
			
			dfs(x, y, x, y + 1, sn, k - 1);
			
			break;
			
		case 2:
			
			a[x][y] = (a[x][y] + 1) % 2;
			
			dfs(x, y, x + 1, y, sn, k - 1);
	
			break;
	
		case 3:
			
			a[x][y] = (a[x][y] + 1) % 2;
			
			dfs(x, y, x, y - 1, sn, k - 1);
	
			break;

		default:
			
			break;
			
		}
		
	}
	
	public static int initSN(String s) {
		
		int sn = -1;
		
		if ("U".equals(s)) {
			
			sn = 0;
			
		}
		
		if ("R".equals(s)) {
			
			sn = 1;
			
		}
		
		if ("D".equals(s)) {
			
			sn = 2;
			
		}
		
		if ("L".equals(s)) {
			
			sn = 3;
			
		}	
		
		return sn;
		
	}
	
	// 0123 URDL
	public static int translate(int color, int fxx) {
		
		int fx = fxx;
		
		if (color == 1) {
			
			fx = (fx + 1) % 4;
			
		}
		
		if (color == 0) {
			
			if (fx - 1 == -1) {
				
				fx = 3;
				
			} else {
				
				fx = fx - 1;
				
			}
			
		}
		
		return fx;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hang = sc.nextInt();
		
		int lie = sc.nextInt();
		
		a = new int[hang + 1][lie + 1];
		
		for (int i = 1; i <= hang; i++) {
			
			for (int j = 1; j <= lie; j++) {
				
				a[i][j] = sc.nextInt();
				
			}
			
		}
		
		int x = sc.nextInt() + 1;
		
		int y = sc.nextInt() + 1;
		
		String s = sc.next();	// 上下左右分别用：UDLR表示
		
		int sn = initSN(s);
		
		int k = sc.nextInt();	// 步数

		dfs(x, y, x, y, sn, k);
		
	}

}
