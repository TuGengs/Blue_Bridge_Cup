package algorithm;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * 
 * T 给出两个整数集合A、B，求出他们的交集、并集以及B在A中的余集。
 * 
 * 样例输入
 * 5
 * 1 2 3 4 5
 * 5
 * 2 4 6 8 10
 * 
 * 样例输出
 * 2 4 (交集)
 * 1 2 3 4 5 6 8 10 (并集)
 * 1 3 5  (A中有，但是B没有的)  A - 交集
 * 
 * retainAll 交集
 * remove 查集
 * addAll addAll 并集
 * 
 * 
 * @author tugeng
 *
 */
public class Set_Operation_Vip {
	
	public static void Print(TreeSet<Integer> sTreeSet) {
		
		Iterator<Integer> it = sTreeSet.iterator();  
		
		while (it.hasNext()) {
			
			Integer in = it.next();  
		  
			System.out.print(in + " ");
			
		} 
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> TreeSetA = new TreeSet<Integer>();
		
		TreeSet<Integer> TreeSetB = new TreeSet<Integer>();
		
		TreeSet<Integer> rs = new TreeSet<Integer>();
		
		Integer a = sc.nextInt();
		
		while (a > 0) {
			
			TreeSetA.add(sc.nextInt());
			
			a--;
			
		}
		
		Integer b = sc.nextInt();
		
		while (b > 0) {
			
			TreeSetB.add(sc.nextInt());
			
			b--;
			
		}
		
		rs.clear();
		
		rs.addAll(TreeSetA);
		
		rs.retainAll(TreeSetB);

		Print(rs);
		
		if (!rs.isEmpty())
			System.out.println();
		
		rs.clear();
		
		rs.addAll(TreeSetA);
		
		rs.addAll(TreeSetB);
		
		Print(rs);
		
		if (!rs.isEmpty())
			System.out.println();
		
		rs.clear();
		
		rs.addAll(TreeSetA);
		
		rs.retainAll(TreeSetB);
		
		TreeSetA.removeAll(rs);
		
		Print(TreeSetA);
		
		if (!rs.isEmpty())
			System.out.println();
		
		
	}

}
