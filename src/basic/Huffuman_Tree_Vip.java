package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 
 * T 哈夫曼树->对于给定的一个数列，现在请你求出用该数列构造Huffman树的总费用。
 * 
 * 
 * 例如，对于数列{pi}={5, 3, 8, 2, 9}，Huffman树的构造过程如下：
 * 找到{5, 3, 8, 2, 9}中最小的两个数，分别是2和3，
 * 		从{pi}中删除它们并将和5加入，得到{5, 8, 9, 5}，费用为5。
 * 
 * 找到{5, 8, 9, 5}中最小的两个数，分别是5和5，
 * 		从{pi}中删除它们并将和10加入，得到{8, 9, 10}，费用为10。
 * 
 * 找到{8, 9, 10}中最小的两个数，分别是8和9，
 * 		从{pi}中删除它们并将和17加入，得到{10, 17}，费用为17。
 * 
 * 找到{10, 17}中最小的两个数，分别是10和17，
 * 		从{pi}中删除它们并将和27加入，得到{27}，费用为27。
 * 
 * 现在，数列中只剩下一个数27，构造过程结束，总费用为5+10+17+27=59。
 * 
 * 输入格式
 * 输入的第一行包含一个正整数n（n<=100）。
 * 接下来是n个正整数，表示p0, p1, …, pn-1，每个数不超过1000。
 * 输出格式
 * 输出用这些数构造Huffman树的总费用。
 * 
 * 样例输入
 * 5
 * 5 3 8 2 9
 * 样例输出
 * 59
 *
 * @author tugeng
 *
 */
public class Huffuman_Tree_Vip {
	
	public static int endStatus = 0; 
	
	public static int mfind(List<Integer> list, int values) {
		
		
		for (int i = 0; i < list.size(); i++) {
			
			if (values == list.get(i).intValue()) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	public static int price(List<Integer> list) {
		
		int sum = 0;
		
//		System.out.println(list.size());
//		
//		System.out.println(list);
		
		if (list.size() == 2) {
			
			sum = list.get(0) + list.get(1);
			
			endStatus = 1;
			
			return sum;
			
		}
		
		int min = Collections.min(list);
		
		int index = mfind(list, min); 

		
		list.remove(index);
		
		int mind = Collections.min(list);
		
		int dndex = mfind(list, mind); 
		
		list.remove(dndex);
		
		
		sum = min + mind;
		
//		System.out.println("sum: " + sum);
		
		list.add(sum);
		
		return sum;
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		List<Integer> l = new ArrayList<Integer>();
		
		for (int i = 0; i < a.intValue(); i++) {
			
			l.add(sc.nextInt());
			
		}
		
		int rs = 0;
		
		int ar;
		
		while (endStatus == 0) {
			
			ar = price(l);
			
//			System.out.println(endStatus + " " + ar);
			
			rs += ar;
			
		}
		
		
		System.out.println(rs);
		
		
	}
	
}
























