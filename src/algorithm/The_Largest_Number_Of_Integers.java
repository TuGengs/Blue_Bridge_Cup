package algorithm;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * 
 * T 编写一个程序，读入一组整数，这组整数是按照从小到大的顺序排列的，
 * 	 它们的个数N也是由用户输入的，最多不会超过20。然后程序将对这个数组进行统计，
 * 	 把出现次数最多的那个数组元素值打印出来。如果有两个元素值出现的次数相同，
 * 	 即并列第一，那么只打印比较小的那个值。
 * 
 * 
 * 输入格式：第一行是一个整数N，N £ 20；接下来有N行，
 * 每一行表示一个整数，并且按照从小到大的顺序排列。
 * 
 * 输出格式：输出只有一行，即出现次数最多的那个元素值。
 * 
 * 
 * 样例输入
 * 5
 * 100
 * 150
 * 150
 * 200
 * 250
 * 
 * 样例输出
 * 150
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class The_Largest_Number_Of_Integers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer N = sc.nextInt();
		
		if (N > 0 && N < 20) {
		
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < N; i++) {
			
			int b = sc.nextInt();
			
			int num = map.get(b) == null ? 1 : map.get(b) + 1;
			
			map.put(b, num);
			
		}
		
		Set<?> set = map.entrySet();
		
		Iterator<?> it = set.iterator();
		
		int min = 0;
		
		int max_num = 0;
		
		while(it.hasNext()) {
			
			@SuppressWarnings("unchecked")
			Entry<Integer, Integer> e = (Entry<Integer, Integer>)it.next();
			
//			System.out.println(e.getKey() + " : " + e.getValue());
			
			if (e.getValue() > max_num) {
				
				max_num = e.getValue();
				
				min = e.getKey();
				
			}
			
		}
		
		
		System.out.println(min);
		
		}
		
		
	}
	
	
}
