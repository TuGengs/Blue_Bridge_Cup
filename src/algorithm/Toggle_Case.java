package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 编写一个程序，输入一个字符串（长度不超过20），
 *   然后把这个字符串内的每一个字符进行大小写变换，
 *   即将大写字母变成小写，小写字母变成大写，
 *   然后把这个新的字符串输出。
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Toggle_Case {
	
	public static void main(String[] args) {
		
		String str = new Scanner(System.in).nextLine();
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if (Integer.valueOf(ch[i]) < 91) {
				
				ch[i] = (char) (ch[i] + 32);
				
				continue;
				
			}
			
			if (Integer.valueOf(ch[i]) > 96) {
				
				ch[i] = (char) (ch[i] - 32);
				
				continue;
				
			}
			
		}
		
		System.out.println(String.valueOf(ch));
 		
	}

}
