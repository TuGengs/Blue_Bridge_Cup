package Five_Zhenti;

import java.util.HashSet;
import java.util.Set;

// 2342A3A4
public class Seven {
	
	static Set<String> set = new HashSet<String>();
	
	static void combination(char a[], int k) {
		
		if (k == a.length) {
			
			String str = String.valueOf(a);
			
			if ((str.lastIndexOf("A") - str.indexOf("A") - 1) == 1
					&& (str.lastIndexOf("2") - str.indexOf("2") - 1) == 2
					&& (str.lastIndexOf("3") - str.indexOf("3") - 1) == 3
					&& (str.lastIndexOf("4") - str.indexOf("4") - 1) == 4) {
				
				set.add(str);
				
			}
			
			return ;
			
		}
		
		for (int i = k; i < a.length; i++) {
			
			{char tmp = a[i]; a[i] = a[k]; a[k] = tmp;}
			
			combination(a, k + 1);
			
			{char tmp = a[i]; a[i] = a[k]; a[k] = tmp;}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		combination("AA223344".toCharArray(), 0);
		
		System.out.println(set);
		
	}

}
