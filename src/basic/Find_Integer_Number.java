package basic;

import java.util.Scanner;

/**
 * 
 * 
 * T 给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
 * 
 * java自带的二分查找查找的顺序并不一定是最后一个，倒数第二个...(因为二分查找)
 * 
 * @author tugeng
 *
 */
public class Find_Integer_Number {
	
	public static void main(String[] args) {
		
		//如果只用的时候就new, 空格就不会为输入的断点...
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();

		int l[] = new int[a.intValue()];
		
		for(int i = 0; i < a.intValue(); i++) {
			
			l[i] = sc.nextInt();
			
		}
		
		Integer f = sc.nextInt();
		
		int first = -2;
		
		for(int i = 0; i < a.intValue(); i++) {
			
			if(l[i] == f.intValue()) {
				
				first = i;
				
				break;
				
			}
			
		}
		
		System.out.println(first + 1);
		
		
	}

}





















