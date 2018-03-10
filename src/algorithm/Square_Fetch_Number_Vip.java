package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * T 设有N*N的方格图(N<=10),我们将其中的某些方格中填入正整数,而其他的方格中则放入数字0。
 * 	 某人从图的左上角的A 点(1,1)出发，可以向下行走，也可以向右走，直到到达右下角的B点(N,N)。
 * 	 在走过的路上，他可以取走方格中的数（取走后的方格中将变为数字0）。
 * 	 此人从A点到B 点共走两次，试找出2条这样的路径，使得取得的数之和为最大。
 * 
 * 
 * @author tugeng
 *
 */
public class Square_Fetch_Number_Vip {
	
	static class Point {
		
		public int x;
		
		public int y;
		
		public Point(int x, int y) {
			 
			this.x = x;
			
			this.y = y;
			
		}

		
		
		@Override
		public boolean equals(Object obj) {
			
			Point obj2 = (Point) obj;

			if (this.x == obj2.x && this.y == obj2.y) {
				
				return true;
				
			}
			
			return false;
			
			
		}
		
		@Override
		public int hashCode() {
			
			return 1;
			
		}
		
	}
	
	public static int a[][];
	
	public static int n;
	
	public static List<Point> st;
	
	public static List<List<Point>> sts;
	
	public static int costMax = 0;
	
	
	public static void precaculate() {
		
		for (int i = 0; i < sts.size(); i++) {
			
			for (int j = i + 1; j < sts.size(); j++) {
				
				Set<Point> set1 = new HashSet<Point>(sts.get(i));
				
				Set<Point> set2 = new HashSet<Point>(sts.get(j));
				
				set1.addAll(set2);
				
				List<Point> l = new ArrayList<Point>(set1);
				
				caculateCost(l);
				
			}
			
		}
		
	}
	
	public static void caculateCost(List<Point> s) {
		
		int sum = 0;
		
		Iterator<Point> it = s.iterator();
		
		while(it.hasNext()) {
			
			Point p = it.next();
			
			sum += (a[p.x][p.y]);
			
		}
		
		if (sum > costMax) {
			
			costMax = sum;
			
		}
		
//		System.out.println(costMax);

	}
	
	public static void dfs(int x, int y) {
		
		if (x > n || y > n) {
			
			return ;
			
		}
		
		
		if (x == n && y == n) {
			
			st.add(new Point(x, y));
			
			sts.add(new ArrayList<Point>(st));
			
			st.remove(st.size() - 1);
			
			return ;
			
		}
		
		for (int k = 0; k <= 1; k++) {

			if (k == 0) {
				
				st.add(new Point(x, y));
				
				dfs(x + 1, y);
				
				st.remove(st.size() - 1);

				
			} else {
				
				st.add(new Point(x, y));
				
				dfs(x, y + 1);
				
				st.remove(st.size() - 1);
				
			}
			
			
		}
		
		
}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		st = new ArrayList<Point>();
		
		sts = new ArrayList<List<Point>>();
		
		n = sc.nextInt();
		
		a = new int[n + 1][n + 1];
		
		while (true) {
			
			int a1 = sc.nextInt();
			
			int a2 = sc.nextInt();
			
			int a3 = sc.nextInt();
			
			if (a1 == 0 && a2 == 0 && a3 == 0) {
				
				break;
				
			}
			
			a[a1][a2] = a3;
			
		}
		
		dfs(1, 1);
		
		precaculate();
		
		System.out.println(costMax);
		
		
	}

}
