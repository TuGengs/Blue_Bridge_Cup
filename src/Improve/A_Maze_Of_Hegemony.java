package Improve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
  * 
  * T 学霸的迷宫 BFS
  * 
  * @author tugeng
  *
  */
public class A_Maze_Of_Hegemony {
	
	static class Point {
		
		int x;
		int y;
		int step;
		String str;

		public Point(int x, int y, int step, String str) {
			this.x = x;
			this.y = y;
			this.step = step;
			this.str = str;
		}
		
	}
	
	public static int direct[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	
	public static int a[][];
	
	public static String sa[][];
	
	public static Queue<Point> queue = new LinkedList<Point>();
	
	public static String translate(int i) {
		
		if (i == 0) return "U";
		
		if (i == 1) return "D";
		
		if (i == 2) return "L";
		
		return "R";
		
	}
	
	public static boolean judge(int x, int y) {
		
		if (x >= a.length || x < 0 || y >= a[0].length || y < 0 || a[x][y] > 0) {
			
			return false;
			
		}
		
		return true;
		
	}
	
	public static void bfs() {
		
		while (!queue.isEmpty()) {
			
			Point p = queue.poll();
			
			int x = p.x;
			
			int y = p.y;
			
			for (int i = 0; i < direct.length; i++) {
				
				int xx = x + direct[i][0];
				
				int yy = y + direct[i][1];
				
				if (judge(xx, yy)) {
				
					queue.add(new Point(xx, yy, p.step + 1, p.str + translate(i)));
					
					a[xx][yy] = p.step + 1;
					
					sa[xx][yy] = p.str + translate(i);

				}
				
			}
			
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		Integer m = sc.nextInt();
		
		a = new int[n][m];
		
		sa = new String[n][m];
		
		for (int i = 0; i < n; i++) {
			
			String scr = sc.next();
			
			for (int j = 0; j < scr.length(); j++) {
				
				a[i][j] = Integer.valueOf(scr.substring(j, j + 1));
				
			}
			
		}
		
		queue.add(new Point(0, 0, 0, ""));
		
		bfs();
		
		System.out.println(a[n - 1][m - 1]);
		
		System.out.println(sa[n - 1][m - 1]);
		
	}
	
	
}
