package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.print.attribute.standard.OutputDeviceAssigned;

/**
 * 
 * 
 * T 请你计算最少的交换次数使得该串变成一个完美的回文串。
 * 
 * 
 * 
 * 交换的定义是：交换两个相邻的字符
 * 例如mamad
 * 第一次交换 ad : mamda
 * 第二次交换 md : madma
 * 第三次交换 ma : madam (回文！完美！)
 * 
 * 
 * 输入格式
 * 第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
 * 第二行是一个字符串，长度为N.只包含小写字母
 * 
 * 输出格式
 * 如果可能，输出最少的交换次数。
 * 否则输出Impossible
 * 
 * 样例输入
 * 5
 * mamad
 * 
 * 样例输出
 * 3
 * 
 * 
 * @author tugeng
 *
 */
public class Perfect_Price_Vip {

	public static String is_palindrome(String str, Integer a) {
		
		String rs = new String("");
		
		char[] chr = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < chr.length; i++) {
			
			Integer num = map.get(chr[i]);
			
			map.put(chr[i], num == null ? 1 : num.intValue() + 1);
			
		}
		
		Set<Character> set = map.keySet();
		
		Iterator<Character> it = set.iterator();
		
		
		//奇数串
		if (a.intValue() % 2 != 0) {
			
			int num = 0;
		
			while (it.hasNext()) {
				
				Character cr = it.next();
				
				if (map.get(cr) % 2 != 0) {
					
					num ++;
					
				}
				
			}
			
			if (num > 1) {
				
				rs = "Impossible";
				
			} else {
				
				rs = "Possible";
				
			}
			
		
		} else if (a.intValue() % 2 == 0) {
			
			//偶数串
			
			int num = 0;
			
			while (it.hasNext()) {
				
				Character cr = it.next();
				
				if (map.get(cr) % 2 != 0) {
					
					num ++;
					
				}
				
			}
			
			if (num > 0) {
				
				rs = "Impossible";
				
			} else {
				
				rs = "Possible";
				
			}
			
			
		}
		
		
		return rs;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		String str = sc.next();
		
//		System.out.println(str);
		
		String rs = is_palindrome(str, a);
		
		int min;
		
		char[] cr = str.toCharArray();
		
		
		if ("Impossible".equals(rs)) {
			
			System.out.println(rs);
			
			return;
			
		} else {
			
			min = 0;
			
			int middle = str.length() - 1;
			
			int odd = 0;
			
			int oddside = -1;
			
//			outside:
			for (int i = 0; i <= middle; i++) {
				
				char c = cr[i];
				
				int k = -1;
				
				for (int j = middle; j > i; j--) {
					
//					System.out.println(j);
					
//					if (i == 17) {
						
//						System.out.println(i);
						
//						System.out.println(String.valueOf(cr));
						
//					}
					
					
					if (c == cr[j]) {
						
						k = j;
						
						break;
						
					} 
					
					if (j == i + 1) {
						
//						break outside;
						
						if (str.length() % 2 != 0) {
						
							oddside = i;
							
							odd = odd + 1;
							
						}
						
//						continue outside;
						
//						k = i;
						
						
					}
					
					
				} // for 2
				
				if (odd == 1) {
					
					odd = odd + 1;
					
					continue;
					
				}
				
				if (i == middle) {
					
					k = i;
					
					if (oddside == -1) {
						
						oddside = i;
						
					}
					
					
				}
				
				
				int km = 0;
				
				if (odd == 0) {
				
					km = str.length() - 1 - i;
				
				} else {
					
					if (odd == 2) {
						
						km = str.length() - i;
						
					}
					
				}
				
				if (k <= km) {
				
					//k -> km
					
					char ck = cr[k];
					
					for (int p = k; p < km; p++) {
						
						cr[p] = cr[p + 1];
						
						min = min + 1;
						
					}
					
					cr[km] = ck;
					
					middle = km - 1;
				
				}
					
				
				
			}  // for 1
			
			if (str.length() % 2 != 0) {
				
					char c = cr[oddside];
					
					int l = 0;
					
					for (int p = oddside; p < str.length() / 2; p++) {
						
						cr[p] = cr[p + 1];
						
						min = min + 1;
						
						l = p;
						
					}
					
					cr[l + 1] = c;
					
					System.out.println(min);
	
					System.out.println(String.valueOf(cr));
					
					return;
					
				
			} else {
				
				System.out.println(min);
	
				System.out.println(String.valueOf(cr));
				
				return;
			
			}
			
		} //else
		
		
		
	}
	
	
}
