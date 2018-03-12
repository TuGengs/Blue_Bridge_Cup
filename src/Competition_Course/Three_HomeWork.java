package Competition_Course;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * T A A 2 2 3 3 4 4， 一共4对扑克牌。请你把它们排成一行。
 * 	 要求：两个A中间有1张牌，两个2之间有2张牌，两个3之间有3张牌，两个4之间有4张牌。
 * 
 * 
 * @author tugeng
 *
 */
public class Three_HomeWork {
	
	public static Set<String> set = new HashSet<String>();
	
	public static void fun(char[] aa, int k) {
		
		if (k == aa.length - 1) {
			
			String str = String.valueOf(aa);
			
			if (str.lastIndexOf('A') - str.indexOf('A') == 2 
					&& str.lastIndexOf('2') - str.indexOf('2') == 3
					&& str.lastIndexOf('3') - str.indexOf('3') == 4
					&& str.lastIndexOf('4') - str.indexOf('4') == 5) {
				
				set.add(str);
				
			}
			
			return ;
			
		}
		
		for (int i = k; i < aa.length; i++) {
			
			{char t = aa[k];
			
			aa[k] = aa[i];
			
			aa[i] = t;}
			
			
			fun(aa, k + 1);
			
			
			{char t = aa[k];
			
			aa[k] = aa[i];
			
			aa[i] = t;}
			
			
		}
		
	} 
	
	public static void main(String[] args) {
		
		fun("AA223344".toCharArray(), 0);
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
	}

}
