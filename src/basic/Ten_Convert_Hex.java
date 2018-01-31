package basic;

import java.util.Scanner;

/**
 * 
 * T 给定1个十进制正整数，输出它们对应的十六进制数。
 * 
 * @author tugeng
 *
 */

public class Ten_Convert_Hex {
	
	public static void Print_Up_Result(String str){
		
		System.out.println(str.toUpperCase());
		
	}
	
	public static void main(String[] args) {
		
		Long lg = new Scanner(System.in).nextLong();
		
		String rs = Long.toHexString(lg);
		
		Print_Up_Result(rs);
		
	}
}
