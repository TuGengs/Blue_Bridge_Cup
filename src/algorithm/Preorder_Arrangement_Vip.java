package algorithm;

import java.util.Scanner;

/**
 * 
 * T 给出一棵二叉树的中序与后序排列。求出它的先序排列。
 *  （约定树结点用不同的大写字母表示，长度<=8）。
 * 
 * @author tugeng
 *
 */
public class Preorder_Arrangement_Vip {
	
	public static String middle;
	
	public static String last;
	
	static class Trees {
		
		public String sr;
		
		public Trees leftTree;
		
		public Trees rightTree;
		
		public Trees(String sr) {

			this.sr = sr;
			
		}
		
		
	}
	
	// md 为后序 And ts.sr 为中序 
	public static void recursion(Trees ts, String md) {
		
		int ix = md.length() - 1;
		
		String str = "";
		
		int index = -1;
		
		while (ix >= 0) {
			
			str = md.substring(ix, ix + 1);
			
			index = ts.sr.indexOf(str);
			
			ix --;
			
			if (index != -1) {
				
				break ;
				
			}
			
		}
		
		if (index == -1) {
			
			return ;
			
		}

		ts.leftTree = new Trees(ts.sr.substring(0, index));
			
		ts.rightTree = new Trees(ts.sr.substring(index + 1, ts.sr.length()));

		ts.sr = str;
		
		recursion(ts.leftTree, md);
	
		recursion(ts.rightTree, md);
		
		
	}
	
	public static void PrintTree(Trees ts) {
		
		if (ts == null) {
			
			return ;
			
		}
		
		System.out.print(ts.sr);
		
		PrintTree(ts.leftTree);
		
		PrintTree(ts.rightTree);
		
		
	}

	public static void TestPrint(Trees ts) {
		
			
		System.out.println(ts.sr);
			
		System.out.println(ts.leftTree.sr + " " + ts.rightTree.sr);
			
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		middle = sc.next();
		
		last = sc.next();
		
		Trees ts = new Trees(middle);
		
		recursion(ts, last);
		
		PrintTree(ts);
		
//		TestPrint(ts);
		
	}

}
