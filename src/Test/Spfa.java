package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Spfa {
	
	static class Edge {
		
		int a;
		int b;
		int v;

		public Edge(int a, int b, int v) {
			this.a = a;
			this.b = b;
			this.v = v;
		}
		
	}
	
	static int vis[];
	
	static int dis[];
	
	static List<Edge> lists[];
	
	static void spfa(int s) {
		
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		Arrays.fill(vis, 0);
		
		dis[s] = 0;
		
		vis[s] = 1;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(s);
		
		while (!q.isEmpty()) {
			
			int v = q.poll();
			
			vis[v] = 0;
			
			List<Edge> l = lists[v];
			
			for (int i = 0; i < l.size(); i++) {
				
				if (dis[l.get(i).b] > dis[v] + l.get(i).v) {
					
					dis[l.get(i).b] = dis[v] + l.get(i).v;
				
					if (vis[l.get(i).b] == 0) {
						
						q.offer(l.get(i).b);
						
						vis[l.get(i).b] = 1;
						
					}
				
				
				}
				
			}
			
		}
			
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n; // 顶点
		
		int m; // 边
		
		String one[] = bf.readLine().split(" ");
		
		n = Integer.valueOf(one[0]);
		
		m = Integer.valueOf(one[1]);
		
		vis = new int[n + 1];
		
		dis = new int[n + 1];
		
		lists = new ArrayList[n + 1];
		
		for (int i = 1; i <= n; i++) {
			
			lists[i] = new ArrayList<Edge>();
			
		}
		
		for (int i = 0; i < m; i++) {
			
			String[] strs = bf.readLine().split(" ");
			
			lists[Integer.valueOf(strs[0])]
					.add(new Edge(Integer.valueOf(strs[0])
							, Integer.valueOf(strs[1])
							, Integer.valueOf(strs[2])));
			
		}
		
		spfa(1);
		
		for (int i = 2; i <= n; i ++)
		
			System.out.println(dis[i]);
		
		
	}

}














