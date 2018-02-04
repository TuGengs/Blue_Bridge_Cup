package basic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * 
 * T 给定1个十六进制正整数，输出它们对应的十进制数。
 * 
 * @author tugeng
 *
 */
public class Hex_Convert_Ten {

	public static String Hex_To_Binary(String hex){

		if ("a".equals(hex) || "A".equals(hex)) {
			return "1010";
		}
		if ("b".equals(hex) || "B".equals(hex)) {
			return "1011";
		}
		if ("c".equals(hex) || "C".equals(hex)) {
			return "1100";
		}
		if ("d".equals(hex) || "D".equals(hex)) {
			return "1101";
		}
		if ("e".equals(hex) || "E".equals(hex)) {
			return "1110";
		}
		if ("f".equals(hex) || "F".equals(hex)) {
			return "1111";
		}
		if ("1".equals(hex)) {
			return "0001";
		}
		if ("2".equals(hex)) {
			return "0010";
		}
		if ("3".equals(hex)) {
			return "0011";
		}
		if ("4".equals(hex)) {
			return "0100";
		}
		if ("5".equals(hex)) {
			return "0101";
		}
		if ("6".equals(hex)) {
			return "0110";
		}
		if ("7".equals(hex)) {
			return "0111";
		}
		if ("8".equals(hex)) {
			return "1000";
		}
		if ("9".equals(hex)) {
			return "1001";
		}
		if ("0".equals(hex)) {
			return "0000";
		}
		
		return "ERROR";
		
	}
	
	public static void main(String[] args) {
		
		String str = new Scanner(System.in).next();
		
		StringBuffer sb = new StringBuffer();
		
		long sum = 0;
		
		for (int i = 0; i < str.length(); i++){
			
			String ch = str.substring(i, i+1); 
			
			sb.append(Hex_To_Binary(ch));
			
		}
		
		
		int k = 0;
		
		for (int j = sb.length(); j > 0; j--) {
			
			String sg = sb.substring(j-1, j);
			
			sum += Long.valueOf(sg) * Math.pow(2, k);
			
			k++;
			
		}
		
//		DecimalFormat df = new DecimalFormat("#");
		
		System.out.println(sum);
		
	}
}
