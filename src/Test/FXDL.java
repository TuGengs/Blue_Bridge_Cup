package Test;

import java.util.Scanner;

// 并查集
public class FXDL {
	
	static int pre[];
	
	static int route[][];
	
	static int sum = 0;
	
	static int find(int x) {
		
		int r = x;
		
		while (pre[r] != r) 
			r = pre[r];
		
		int i = x, j;
		
		while (i != r) {	// 压缩
			
			j = pre[i];
			
			pre[i] = r;
			
			i = j;
			
		}
		
		return r;
		
	}

	static void join(int x, int y) {
		
		int a = find(x);
		
		int b = find(y);
		
		if (a != b) {
			
			pre[a] = b; // -->
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		pre = new int[1005];
		
		route = new int[2005][2];
		
		int n, m;
		
		n = sc.nextInt();
		
		m = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			
			route[i][0] = sc.nextInt();
			
			route[i][1] = sc.nextInt();
			
			join(route[i][0], route[i][1]);
			
		}
		
		int q1, q2;	//待询问的两个点
		
		q1 = sc.nextInt();
		
		q2 = sc.nextInt();
		
		
		for (int ii = 0; ii < n; ii++) {
			
			pre[ii] = ii;
			
		}
		
		for (int j = 0; j < m; j++) {
			
			join(route[j][0], route[j][1]);
			
		}
		
		int a = find(q1);
		
		int b = find(q2);
		
		if (a != b) {
			
			System.out.println(-1);
			
		} else {
			
			for (int i = 1; i <= n; i++) {
				
				if (i == q1 || i == q2) {
					
					continue;
					
				}
				
				for (int j = 1; j <= n; j++) {
					
					pre[j] = j;
					
				}
				
				for (int j = 0; j < m; j++) {
					
					if (route[j][0] == i || route[j][1] == i) continue;
					
					 int a2 = find(route[j][0]);
					 int b2 = find(route[j][1]);
					 if (a2 > b2) { a2 ^= b2; b2 ^= a2; a2 ^= b2; };//交换
					 if (a2 != b2) pre[b2] = a2;
					
				}
				
					int a3 = find(q1);
		            int b3 = find(q2);
		            if (a3 != b3)sum++;
	            
	            }

				System.out.println(sum);
			
			}
					
		}
				
	}

