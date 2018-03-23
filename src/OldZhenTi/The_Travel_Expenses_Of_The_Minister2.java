package OldZhenTi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class The_Travel_Expenses_Of_The_Minister2 {
	
	public static int max = 0;	// 最大的费用
	
	public static Map<Integer, List<Integer>> map1 = new HashMap<Integer, List<Integer>>();
	
	public static Map<Integer, List<Integer>> map2 = new HashMap<Integer, List<Integer>>();

	public static List<Integer> list = new ArrayList<Integer>();

	public static int caculate(int n) {
		
		return n * 10 + (1 + n) * n / 2;
		
	}
	
	public static void dfs(int p, int cost) {
		
		for (int j = 0; j < map1.get(p).size(); j++) {
			
			if (map1.get(p).get(j) > 0 && !list.contains(map1.get(p).get(j))) {
				
				list.add(map1.get(p).get(j));
				
				dfs(map1.get(p).get(j), cost + map2.get(p).get(j));
				
				list.remove(list.indexOf(map1.get(p).get(j)));
				
			}
			
		}
		
		if (cost > max) 
			max = cost;
		
		return ;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			map1.put(i, new ArrayList<Integer>());
			
			map2.put(i, new ArrayList<Integer>());
			
		}
		
		for (int i = 0; i < n - 1; i++) {
			
			int x1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			
			int cost = sc.nextInt();
			
			map1.get(x1).add(x2);
			
			map1.get(x2).add(x1);
			
			map2.get(x1).add(cost);
			
			map2.get(x2).add(cost);
			
		}
		
		for (int i = 1; i <= n; i++) {
		
			list.add(i);
			
			dfs(i, 0);
			
			list.remove(list.indexOf(i));

		}

		System.out.println(caculate(max));

	}

}
