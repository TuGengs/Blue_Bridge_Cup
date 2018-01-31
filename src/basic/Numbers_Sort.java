package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 数组排序:
 * 		Arrays.sort()
 * 
 * 集合排序:
 * 		Collections.sort()
 * 
 * Iterable:
 * 		一个集合对象要表明自己支持迭代，能有使用foreach语句的特权，
 * 		就必须实现Iterable接口，表明我是可迭代的！然而实现Iterable接口，就必需为foreach语句提供一个迭代器。
 * 		这个迭代器是用接口定义的 iterator方法提供的。也就是iterator方法需要返回一个Iterator对象。		
 * 
 * Iterator:
 * 		 包含3个方法: hasNext ,  next , remove。remove按需求实现，一般它很少用到，
 * 		 以至于Eclipse接口方法自动补全时，都忽略了remove放方法。
 * 
 * 	1、每次在迭代前,先调用hasNext()探测是否迭代到终点（本次还能再迭代吗？）。
 * 	2、next方法不仅要返回当前元素，还要后移游标cursor
 * 	3、remove()方法用来删除最近一次已经迭代出的元素
 * 	4、 迭代出的元素是原集合中元素的拷贝（重要）
 * 	5、配合foreach使用
 * 
 * @author tugeng
 *
 */

public class Numbers_Sort {

	public static void main(String[] args) {
		
		List<Integer> list;
		Scanner sc;
		int a;
		
		list = new ArrayList<Integer>();
		sc = new Scanner(System.in);
		a = sc.nextInt();
		
		while (a > 0) {
			
			list.add(sc.nextInt());
			a--;
		}
		
		Collections.sort(list);
		
		Iterator<Integer> it = list.iterator();
		
		while (it.hasNext()) {
			
			System.out.print(it.next() + " ");
			
		}
		
	}
	
}
