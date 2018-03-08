package algorithm;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * T 例如 beast和astonish，如果接成一条龙则变为beastonish，
 * 	 另外相邻的两部分不能存在包含关系，例如at 和 atide 间不能相连。
 * 
 * 
 * @author tugeng
 *
 */
public class Word_Chain_Vip {
	
	public static int n;
	
	public static int lengths[][];
	
	public static int coincides[][];
	
	public static List<Integer> lz;
	
	public static int max = 0;
	
	public static Map<Integer, Integer> map;
	
	public static List<String> l = new ArrayList<String>();
	
	public static int judge3(int current) {
		
		for(int i = 1; i < lengths[current].length; i++) {
			
			if (lengths[current][i] == 1) {
				
				if (judge2(i) == 1) {
					
					return 0;
					
				}
			
				
			}
			
			
		}
		
		return 1;
		
		
	}
	
	public static int judge2(int current) {
		
		Integer mmp = map.get(current) == null ? 0 : map.get(current);
		
		if (mmp >= 2) {
			
			return 0;
			
		}
		
		return 1;
		
	}
	
	public static int judge(int bstr, int current) {
		
		if (l.get(current).indexOf(bstr) != -1 
				&& l.get(current).length() > l.get(bstr).length()) {
			
			return 0;
			
		}
		
		if (l.get(current).indexOf(l.get(bstr)
				.substring(l.get(bstr).length() - 1, l.get(bstr).length())) == -1) {
			
			return 0;
			
		}
		
		int xyz = l.get(current).indexOf(l.get(bstr)
				.substring(l.get(bstr).length() - 1, l.get(bstr).length()));
		
		String str1 = l.get(current).substring(0, xyz + 1);

		if (l.get(bstr).length() - xyz - 1 < 0) {
			
			return 0;
			
		}
		
		String str2 = l.get(bstr).substring(l.get(bstr).length() - xyz - 1, l.get(bstr).length());
		
		
		if (!str1.equals(str2)) {
			
			return 0;
			
		}
		
		return 1;
		
	}
	
	public static int calculate() {
		
		int sum = 0;
		
		for (int i = 0; i < lz.size() - 1; i++) {
			
			sum += coincides[lz.get(i)][lz.get(i + 1)];
			
		}
		
		return sum;
		
	}
	
	public static void dfs(String start, int current) { // 行
		
//		System.out.println(start + " " + current);
		
		if (judge3(current) == 1) {
			
			if (start.length() - calculate() > max) {
			
				max = start.length() - calculate();
				
//				System.out.println(start);
				
			}
			
			return;
			
		}
		
		for(int i = 1; i < lengths[current].length; i++) {
			
			if (lengths[current][i] == 1) {
			
				if (judge2(i) == 1) {
					
					start += l.get(i);
					
					lz.add(i);
					
					map.put(i, map.get(i) == null ? 1 : map.get(i) + 1);
					
					dfs(start, i);
					
					lz.remove(lz.size() - 1);
					
					start = start.substring(0, start.length() - l.get(i).length());
					
					map.put(i, map.get(i) - 1);
				
				}
				
			
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		map = new HashMap<Integer, Integer>();
		
		lz = new ArrayList<Integer>();
		
		l.add("TG");
		
		for (int i = 0; i < n; i++) {
			
			l.add(sc.next());
			
		}
		
		lengths = new int[n + 1][n + 1];
		
		coincides = new int[n + 1][n + 1];

		String start = sc.next();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				
				if (judge(i, j) == 1) {
					
					lengths[i][j] = 1;
					
					coincides[i][j] = l.get(j).indexOf(
							l.get(i).substring(
									l.get(i).length() - 1, l.get(i).length())) + 1;
					
				}
				
			}
			
		}
		
		for (int i = 1; i < l.size(); i++) {
			
			if (l.get(i).substring(0, 1).equals(start)) {
				
				map.put(i, 1);
				
				lz.add(i);
				
				dfs(l.get(i), lengths[i][1]);
				
			}
			
		}

		
		System.out.println(max);
			
		
	}
	

}
