package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * T 给定n个十六进制正整数，输出它们对应的八进制数。
 * 
 * A、十进制转换其他
 * 
 * 	十进制转成二进制 
 * 	Integer.toBinaryString(int i) 
 * 	十进制转成八进制 
 * 	Integer.toOctalString(int i) 
 * 
 * 	十进制转成十六进制
 * 	Integer.toHexString(int i)
 * 	
 * B、其他转换十进制
 *	 
 * 	二进制转十进制 
 * 	Integer.valueOf("1010",2).toString()
 *	 
 * 	八进制转成十进制 
 * 	Integer.valueOf("125",8).toString() 
 *	 
 * 	十六进制转成十进制 
 * 	Integer.valueOf("ABCDEF",16).toString() 
 * 
 * 
 * 	操作整型：BigInteger
 * 
 * 	操作小数：BigDecimal
 * 
 * e.g :
 * 	String s1 = "126656864e144ad88d7ff96badd2f68b";	 	// 16进制数  
 * 	BigInteger b = new BigInteger(s1,16);           	// 16进制转成大数类型     
 * 	String s2 = b.toString(16);                    	    // 大数类型转成16进制  
 * 
 * 
 * @author tugeng
 * 12 str
 * 00010010 sb
 * 000 010 010
 * 022
 */
public class Hex_Convert {
	
	public static void PrintSB(StringBuffer sb) {
		
		for (int i = 0; i < sb.length(); i++) {
			
			String str = sb.substring(i, i+1);
			
			if ("0".equals(str)) {
				
				sb.delete(i, i+1);
				
			} else {
				
				System.out.println(sb);
				
				break;
				
			}
			
		}
		
		
	}
	
	
	public static String Binary_To_Oct(String bi){
		if("000".equals(bi)){
			return "0";
		}
		if("001".equals(bi)){
			return "1";
		}
		if("010".equals(bi)){
			return "2";
		}
		if("011".equals(bi)){
			return "3";
		}
		if("100".equals(bi)){
			return "4";
		}
		if("101".equals(bi)){
			return "5";
		}
		if("110".equals(bi)){
			return "6";
		}
		if("111".equals(bi)){
			return "7";
		}
		
		return "ERROR";
		
	}
	
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

		Integer a;
		List<String> list = new ArrayList<String>();
		
		StringBuffer sb = new StringBuffer();
		
		StringBuffer rs = new StringBuffer();
		
		StringBuffer bef = new StringBuffer();
	
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		while (a > 0) {
			
			/**
			 * nextLine(): 
			 * 	一定要读取到有效字符后才可以结束输入，对输入有效字符之前遇到的
			 * 	空格键、Tab键或Enter键等结束符，next（）方法会自动将其去掉
			 * 
			 * next():
			 * 	返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
			 * 
			 */
			
			list.add(sc.next());	//nextLine() 只能输入2、39就结束了...
			
			a--;
			
		}
		

		for (int i = 0; i < list.size(); i++) {

			String str = list.get(i);
			
			// 16 -> 2
			for (int j = 0; j < str.length(); j++){
				
				String ch = str.substring(j, j+1); 
				
				sb.append(Hex_To_Binary(ch));
				
			}
			
			// 2 -> 8
			
			int sl = sb.length() % 3;
			if (sl == 1) {
				bef.append("00");
			}
			else if (sl == 2) {
				bef.append("0");
			}
			
			bef.append(sb);
			
			for (int k = 0; k < bef.length(); k+=3) {
				
				String ars = Binary_To_Oct(bef.substring(k, k+3));
				
				rs.append(Binary_To_Oct(bef.substring(k, k+3)));
				
			}
			
			PrintSB(rs);
			
			rs.delete(0, rs.length());
			bef.delete(0, bef.length());
			sb.delete(0, sb.length());
			
			
		}
		
		
//		Iterator<String> it = list.iterator();
//		
//		while (it.hasNext()) {
//			
//			
//			String str = it.next();
//			Long lg;
//			
//			// 16 -> 10
//			lg = Long.valueOf(str, 16);
//			
//			// 10 -> 8	Long 范围
//			str = Long.toOctalString(lg);
//			
//			System.out.println(str);
//			
//			
//			
//			String str = it.next();
//			
//			BigInteger bi = new BigInteger(str, 16);
//			
//			//运行超时
//			System.out.println(bi.toString(8));
//			
//			
//			
//			String str = it.next();
//			String str2 = "";
//			
//			// 16 -> 10	Integer 范围
//			str2 = Integer.valueOf(str, 16).toString();
//			
//			// 10 -> 8	Integer 范围
//			str2 = Integer.toOctalString(Integer.valueOf(str2));
//			
//			System.out.println(str2);
//			
//			
//		}
			
	}
	
}







