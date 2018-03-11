package Improve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * T 给定一个信封，最多只允许粘贴N张邮票，
 * 	 计算在给定K（N+K≤13）种邮票的情况下（假定所有的邮票数量都足够），
 * 	 如何设计邮票的面值，能得到最大值MAX，使在1～MAX之间的每一个邮资值都能得到。
 * 
 * 
 * @author tugeng
 *
 */
public class Face_Value_Design_Of_Stamps_Vip {
	
	public static List<Result> l = new ArrayList<Result>();
	
	public static int flag = 0;
	
	static class Result {
		
		public int a[];
		
		public int max;
		
		public Result(int a[], int max) {
			
			this.a = a;
			
			this.max = max;
			
		}
		
	}
	
	public static void predfs(int[] a, int n, int k, int index) {
		
		if (index == k + 1) {
			
			int sx = 0;
			
			for (int i = 1; i < a.length; i ++) {
				
				if (a[i] > sx) {
					
					sx = a[i];
					
				}
				
			}
			
//			for (int i = 1; i < a.length; i++) {
//				
//				System.out.print(a[i] + " ");
//				
//			}
//			
//			System.out.println();
			
			int times = 0;
			
			for (int i = 1; i <= n * sx; i++) {

				
			
				dfs(n, i, i, a.clone(), new Result(a.clone(), 0));
				
				if (flag == 1) {
					
					times ++;
					
				}
				
				if (flag == 0) {
					
					l.add(new Result(a.clone(), times));
					
					times = 0;
					
					break;
					
				}
				
				
				flag = 0;
				
			}
			
			return;
			
		}
		
		
		for (int i = 1; i <= 50; i++) { // 最小值
			
			if (a[index - 1] == i || a[index - 1] >= i) {
				
				continue;
				
			}
			
			a[index] = i;
			
			predfs(a, n, k, index + 1);
			
		}
		
		a[index] = 0;
		
		
	}
	
	public static void dfs(int n, int prem, int m, int a[], Result rs) {
		
		if (flag == 1) {
			
			return ;
			
		}
		
		if (m == 0 && n >= 0) {
			
			rs.a = a;
			
			rs.max = prem;
			
			flag = 1;
			
			return ;
			
		}
		
		if (m < 0 || n < 0) {
			
			return ;
			
		}
		
		
		for (int i = 1; i < a.length; i++) {
			
			dfs(n - 1, prem, m - a[i], a, rs);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer N = sc.nextInt();
		
		Integer K = sc.nextInt();
		
		int[] a = new int[K + 1];
		
		predfs(a, N, K, 1);
		
		int max = -1;
		
		int mdex = -1;
		
		for (int i = 0; i < l.size(); i++) {
			
			if (l.get(i).max > max) {
				
				max = l.get(i).max;
				
				mdex = i;
				
			}
			
		}
		
		for (int i = 1; i < l.get(mdex).a.length; i++) {
			
			System.out.print(l.get(mdex).a[i] + " ");
			
		}
		
		System.out.println();
		
		System.out.println("MAX=" + max);
		
		
	}

}
