package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * 
 * T 有一棵 n 个节点的树，树上每个节点都有一个正整数权值。
 * 	 如果一个点被选择了，那么在树上和它相邻的点都不能被选择。求选出的点的权值和最大是多少？
 * 
 * 
 * 输入格式
 * 第一行包含一个整数 n。
 * 接下来的一行包含 n 个正整数，第 i 个正整数代表点 i 的权值。
 * 接下来一共 n-1 行，每行描述树上的一条边。
 * 
 * 输出格式
 * 输出一个整数，代表选出的点的权值和的最大值。
 * 样例输入
 * 5
 * 1 2 3 4 5
 * 1 2
 * 1 3
 * 2 4
 * 2 5
 * 样例输出
 * 12
 * 
 * 
 * 样例说明
 * 选择3、4、5号点，权值和为 3+4+5 = 12 。
 * 
 * 
 * 数据规模与约定
 * 对于20%的数据， n <= 20。
 * 对于50%的数据， n <= 1000。
 * 对于100%的数据， n <= 100000。
 * 权值均为不超过1000的正整数。
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Node_Selection {
	
	public static Map<Integer, List<Integer>> map;
	
	public static int b[][];
	
	public static void nodeSelection(int current, int before) {
			
		List<Integer> lt = map.get(current);
		
		for (int i = 0; i <lt.size(); i++) {
			
			if (lt.get(i) != before) {
				
				nodeSelection(lt.get(i), current);
				
				b[current][1] += b[lt.get(i)][0];
						
				b[current][0] += Math.max(b[lt.get(i)][0], b[lt.get(i)][1]);
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		map = new HashMap<Integer, List<Integer>>();
		
		Integer a = sc.nextInt();
		
		b = new int[a + 1][2];
		
		//1 2 3 4
		for (int i = 1; i <= a; i++) {
			
			Integer w = sc.nextInt();
			
			map.put(i, new ArrayList<Integer>());
			
			b[i][1] = w;
			
		}
		
		for (int i = 1; i < a; i++) {
			
			Integer h = sc.nextInt();   //h -> n
			
			Integer n = sc.nextInt();
			
			map.get(h).add(n);
			
			map.get(n).add(h);  //注意
			
			
		}
		
		
		nodeSelection(1, -1);
		
		System.out.println(Math.max(b[1][0], b[1][1]));
		

		
	}

	
}
