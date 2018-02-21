package algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 
 * T 编写函数CompactIntegers，删除数组中所有值为0的元素，
 * 其后元素向数组首端移动。注意，CompactIntegers函数需要接受数组及其元素个数作为参数，
 * 函数返回值应为删除操作执行后数组的新元素个数。
 * 输出删除后数组中元素的个数并依次输出数组元素。
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Delet_Array_Zero_Element {
	
	public static void CompactIntegers(List<Integer> l) {
		
		Iterator<Integer> it = l.iterator();
		
		while (it.hasNext()) {
			
			if (it.next().intValue() == 0) {
				
				it.remove();
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		List<Integer> l = new ArrayList<Integer>();
		
		while (a > 0) {
			
			l.add(sc.nextInt());
			
			a --;
			
		}
		
		CompactIntegers(l);
		
		System.out.println(l.size());
		
		Iterator<Integer> it = l.iterator();
		
		while (it.hasNext()) {
			
			System.out.print(it.next() + " ");
			
		}
		
		
	}

}
