package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 
 * T 给定一个n*n的棋盘，棋盘中有一些位置不能放皇后。
 * 现在要向棋盘中放入n个黑皇后和n个白皇后，
 * 使任意的两个黑皇后都不在同一行、同一列或同一条对角线上，
 * 任意的两个白皇后都不在同一行、同一列或同一条对角线上。
 * 问总共有多少种放法？n小于等于8。
 * 
 * 
 * 
 * 输入格式
 * 输入的第一行为一个整数n，表示棋盘的大小。
 * 接下来n行，每行n个0或1的整数，
 * 如果一个整数为1，表示对应的位置可以放皇后，
 * 如果一个整数为0，表示对应的位置不可以放皇后。
 * 
 * 输出格式
 * 输出一个整数，表示总共有多少种放法。
 * 
 * 
 * 样例输入
 * 4
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 样例输出
 * 2
 * 
 * 样例输入
 * 4
 * 1 0 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 
 * 样例输出
 * 0
 * 
 * 
 *
 * 1 0 1 1
 * 1 1 1 0
 * 0 1 1 1
 * 1 1 0 1
 * 
 * 1 1 0 1
 * 0 1 1 1
 * 1 1 1 0
 * 1 0 1 1
 *
 *
 * object [][] array;
 * array.length 就是行数
 * array[0].length 就是列数
 *
 *
 * @author tugeng
 *
 */
public class Double_N_Empress_Vip {
	
	public static void print(int b[]) {
		
		
		for (int i = 1; i < b.length; i++) {
			
			for (int j = 1; j < b.length; j++) {
				
				if (b[i] == j) {
					
					System.out.print(1 + " ");
					
				} else {
					
					System.out.print(0 + " ");
					
				}
				
				
			}
			
			System.out.println();
			
			
		}
		
		
	}
	
	public static int judge2(List<int[]> l, int n) {
		
		int sum = 0;
		
		for (int i = 0; i < l.size(); i++) {
			
			for (int j = 0; j < l.size(); j++) {
			
				if (i == j) {
					
					continue;
					
				}
				
				int a[] = l.get(i);
				
				int b[] = l.get(j);
				
				
				for (int k = 1; k < n; k++) {

					if (a[k] == b[k]) {
						
						sum += 1;
						
						break;
						
					}
					
				}
				
				
				
			}	
			
		}
		
		
		
		return sum;
		
	}
	
	public static boolean judge(int a[][], int b[], int k) {
		
		// 行: 根据算法，一行只放一个，故不需要判断 
		
		// 可否放位置判断
		if (a[ k ][ b[k] ] == 0) {
			
			return false;
			
		}
		
		
		for (int i = 1; i < k; i++) {
			
			// 列:
			if (b[i] == b[k]) {
				
				return false;
				
			}
			
			// 对角线:
			if ((k - i) == Math.abs((b[k] - b[i]))) {
				
				return false;
				
			}
					
		}
		
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		int k = a.intValue() + 1;
		
		int x[] = new int[k];
		
		int b[][] = new int[k][k];
		
		List<int[]> list = new ArrayList<int[]>();
		
		
		for (int i = 1; i < k; i++) {
			
			for (int j = 1; j < k; j++) {
				
				// 1可以放 0不可以放
				b[i][j] = sc.nextInt();
				
			}
			
		}
		
		
		x[1] = 0;
		
		int kw = 1;
		
		int sum = 0;
		
		while (kw > 0) {
			
			x[kw] += 1; 
			
			//这个（<=）用于该行无解的情况下，让其越界...
			while ((x[kw] <= a.intValue()) && !judge(b, x, kw)) {
				
				x[kw] += 1;
				
			}
			
			if (x[kw] <= a.intValue()) {
				
				if (kw == a.intValue()) {
					
//					print(x);
					
//					sum = sum + 1;
					
//					System.out.println();
					
//					print(x);
//					
//					System.out.println();
					
					list.add(x.clone());
					
					x[kw] = 0;
					
					kw--;
					
					
				} else {

					kw++;
					
					x[kw] = 0;
					
				}
				
				 
			} else {
				
				kw --;
				
			}		
			
			
		}
		
		
//		System.out.println(sum);
		
		sum = judge2(list, k);
		
		int rs = list.size() * (list.size() - 1);
		
//		System.out.println(rs + " " + sum);
		
		System.out.println(rs - sum);
		
		
		
	}


}
