package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * 
 * T 给定一个n个顶点，m条边的有向图（其中某些边权可能为负，但保证没有负环）。
 * 	 请你计算从1号点到其他点的最短路（顶点从1到n编号）。
 * 
 * 输入格式
 * 第一行两个整数n, m。
 * 接下来的m行，每行有三个整数u, v, l，表示u到v有一条长度为l的边。
 * 
 * 输出格式
 * 共n-1行，第i行表示1号点到i+1号点的最短路。
 * 
 * 
 * 样例输入
 * 3 3
 * 1 2 -1
 * 2 3 -1
 * 3 1 2
 * 样例输出
 * -1
 * -2
 * 
 * 
 * 样例输入
 * 3 3
 * 1 2 -1
 * 2 3 -1
 * 3 1 2
 * 
 * 样例输出
 * -1
 * -2
 * 
 * 
 * 数据规模与约定
 * 对于10%的数据，n = 2，m = 2。
 * 对于30%的数据，n <= 5，m <= 10。
 * 对于100%的数据，1 <= n <= 20000，1 <= m <= 200000，-10000 <= l <= 10000，保证从任意顶点都能到达其他所有顶点。
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Shortest_Path2 {

	static class edge {
		
        public int a;  //边的起点
        
        public int b;  //边的终点
        
        public int value;  //边的权值
        
        edge(int a, int b, int value) {
        	
            this.a = a;
            
            this.b = b;
            
            this.value = value;
            
        }
    }
	
	public static int INF = Integer.MAX_VALUE;
	
	
	public static ArrayList<edge>[] lists; 
	
	public static int dis[];
	
	public static int vis[];
	
	
	public static void spfa(int s, int n) { //求单源点s到其它各顶点的最短距离
		
		
//		int q[] = new int[n + 1];
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			
			dis[i] = INF;
			
			vis[i] = 0;
			
		}
		
		
		dis[s] = 0;
		
		vis[s] = 1;
		
		q.offer(s);
		
		while (!q.isEmpty()) {
			
//			在队列为空时， element() 抛出一个异常，而 peek() 返回 null。
			
			int v = q.poll(); // 队首结点
			
			vis[v] = 0;
			
			//v -> i 所有
			
			List<edge> l = lists[v];
			
			for (int j = 0; j < l.size(); j++) {
				
				if (dis[l.get(j).b] > dis[v] + l.get(j).value) {
					
					dis[l.get(j).b] = dis[v] + l.get(j).value;
					
					if (vis[l.get(j).b] == 0) {
						
						q.offer(l.get(j).b);
						
						vis[l.get(j).b] = 1;
						
					}
					
				}
				
			}
			
			
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		Integer b = sc.nextInt();

		
		dis = new int[a + 1];
		
		vis = new int[a + 1];
		
		lists = new ArrayList[b + 1];
		
		for (int i = 1; i <= b; i++) {
			
			lists[i] = new ArrayList<edge>();
			
		}
		
		for (int i = 0; i < b; i++) {
			
			Integer u = sc.nextInt();
			
			Integer v = sc.nextInt();
			
			Integer w = sc.nextInt();
			
			lists[u].add(new edge(u, v, w));

		}
		
		spfa(1, a);
		
		
		for (int i = 2; i <= a; i++) {
			
			System.out.println(dis[i]);
			
		}
		

		
	}
	
	
}
