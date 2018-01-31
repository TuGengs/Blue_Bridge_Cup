package basic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * 由于该题数据量要求不大，所以有第二种简便方法。
 * 
 * T 给定1个十六进制正整数，输出它们对应的十进制数。
 * 
 * @author tugeng
 *
 */
public class Hex_Convert_Ten2 {

	
	public static void main(String[] args) {
		
		String str = new Scanner(System.in).next();
		
		Long ls = Long.valueOf(str, 16);
		
		System.out.println(ls);
		
	}
		
}
