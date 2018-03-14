package Eighth_Zhenti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * T 小明一共有N块巧克力，其中第i块是Hi x Wi的方格组成的长方形。
 * 	 小明需要从这 N 块巧克力中切出K块巧克力分给小朋友们。切出的巧克力需要满足：
 *   1. 形状是正方形，边长是整数  
 *   2. 大小相同
 * 
 *
 * 例如一块6x5的巧克力可以切出6块2x2的巧克力或者2块3x3的巧克力。
 * 
 * 当然小朋友们都希望得到的巧克力尽可能大，你能帮小Hi计算出最大的边长是多少么？
 * 
 * 
 * @author tugeng
 *
 */
public class Chocolate_Nine {
	
	static class rectangle {
		
		public int chang;
		
		public int kuang;
		
		rectangle(int chang, int kuang) {
			
			this.chang = chang;
			
			this.kuang = kuang;
			
		}
		
	}
	
	public static List<rectangle> l = new ArrayList<rectangle>();
	
	public static void dfs(int edge, int k) {
		
		int sum = 0;
		
		for (int i = 0; i < l.size(); i++) {
			
			int a = l.get(i).chang / edge;
			
			int b = l.get(i).kuang / edge;
			
			sum += a * b;
			
		}
		
		if (sum >= k) {
			
			System.out.println(edge);
			
			return;
			
		} else {
			
			dfs(edge - 1, k);
			
		}

	}
	
	public static void main(String[] args) {
		
		int min = Integer.MAX_VALUE;
		
		int min_index = -1;
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		Integer k = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			l.add(new rectangle(sc.nextInt(), sc.nextInt()));
			
			if (Math.min(l.get(i).chang, l.get(i).kuang) < min) {
				
				min = Math.min(l.get(i).chang, l.get(i).kuang);
				
				min_index = i;
				
			}
			
		}
		
		dfs(min, k);
		
	}
	

}
