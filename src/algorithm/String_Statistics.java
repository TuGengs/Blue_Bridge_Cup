package algorithm;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * 
 * T 给定一个长度为n的字符串S，还有一个数字L，
 * 	 统计长度大于等于L的出现次数最多的子串（不同的出现可以相交），
 * 	 如果有多个，输出最长的，如果仍然有多个，输出第一次出现最早的。
 * 
 * 输入格式
 * 第一行一个数字L。
 * 第二行是字符串S。
 * L大于0，且不超过S的长度。
 * 输出格式
 * 一行，题目要求的字符串。
 * 
 * 输入样例1：
 * 4
 * bbaabbaaaaa
 * 输出样例1：
 * bbaa
 * 
 * 输入样例2：
 * 2
 * bbaabbaaaaa
 * 输出样例2：
 * aa
 * 
 * 数据规模和约定
 * n<=60
 * S中所有字符都是小写英文字母。
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class String_Statistics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String str = sc.next();
		
		int max_n = str.length();	// 最大长度
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(); 
		
		for (int i = n; i <= max_n; i++) {
			
			for (int j = 0; j + i <= max_n; j++) {
				
				
				int v = map.get(str.substring(j, j + i)) 
						== null ? 1 : map.get(str.substring(j, j + i)) + 1;
				
				map.put(str.substring(j, j + i), v);
				
				
			}
			
		}
		
		Set<?> set = map.entrySet();
	     
	    Iterator<?> it = set.iterator();
	    
	    int max = 0;
	    
	    String max_str = "";
	     
	    while(it.hasNext()) {
	    	
	    	@SuppressWarnings("unchecked")
			Map.Entry<String, Integer> me = (Map.Entry<String, Integer>)it.next();
	    	
//	    	System.out.println(me.getKey() + " : " + me.getValue());
	    	
	    	if (me.getValue() > max) {
	    		
	    		max = me.getValue();
	    	
	    		max_str = me.getKey();
	    		
	    	}
	    	
	    	if (me.getValue() == max 
	    			&& max_str.length() < me.getKey().length()) {
	    		
	    		max_str = me.getKey();
	    		
	    	}
	    	
	    	
	    }
	    
	    System.out.println(max_str);
		
		
	}
	
}
