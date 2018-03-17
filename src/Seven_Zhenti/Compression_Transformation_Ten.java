package Seven_Zhenti;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Compression_Transformation_Ten {
	
	public static Set<Integer> set = new HashSet<Integer>();
	
	public static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		String str = "";
		
		for (int i = 0; i < n; i++) {
			
			if (!map.containsKey(a[i])) {
				
				map.put(a[i], i);
				
				str = str + a[i] * (-1);
				
			} else {
				
				for (int j = map.get(a[i]) + 1; j < i; j++) {
					
					set.add(a[j]);
					
				}
				
				for (int j = i - 1; j > map.get(a[i]); j--) {
					
					set.add(a[j]);
					
				}
				
				str = str + set.size();
				
				map.put(a[i], i);
				
				set.clear();
				
			}
			
			
			
		}
		
		
		System.out.println(str);
		
		
	}
	
}
