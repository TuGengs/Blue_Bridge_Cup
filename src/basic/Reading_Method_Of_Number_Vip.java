package basic;

import java.util.Scanner;

import org.hamcrest.core.SubstringMatcher;

/**
 * 
 * 
 * T 当他输入12 3456 7009时，会给出相应的念法：
 * 十二亿三千四百五十六万七千零九
 * 用汉语拼音表示为
 * shi er yi san qian si bai wu shi liu wan qi qian ling jiu
 * 
 * 注意必须严格按照规范，比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”，
 * “100000”读作“shi wan”而不是“yi shi wan”，“2000”读作“er qian”而不是“liang qian”。
 * 
 * 
 * 输入格式
 * 有一个数字串，数值大小不超过2,000,000,000。
 * 输出格式
 * 是一个由小写英文字母，逗号和空格组成的字符串，表示该数的英文读法。
 * 样例输入1234567009
 * 样例输出
 * shi er yi san qian si bai wu shi liu wan qi qian ling jiu
 * 
 * 
 * @author tugeng
 *
 */
public class Reading_Method_Of_Number_Vip {
	
	public static String[] num = {"ling", "yi", "er", "san", "si", "wu", 
											"liu", "qi", "ba", "jiu"};
	
	public static String[] digit = {"", "shi", "bai", "qian", "wan", "shi wan", 
											"bai wan", "qian wan", "yi"};
	
	
	public static String trimling(String n) {
		
		n = n.trim();
		
		if ("ling".equals(n.substring(n.length() - 4, n.length()))) {
			
			n = n.substring(0, n.length() - 5);
			
		} 
		
		
		if ("ling".equals(n.substring(0, 4))) {
			
			n = n.substring(5, n.length());
			
		}
		
		return n;
		
		
	}
	
	
	public static String thousand(String n, int k) {
		
		char[] cn = n.toCharArray();
		
		int cnlh = cn.length;
		
		String rs = "";
		
		int j = 0;
		
		for (int i = cnlh - 1; i >= 0; i--) {
			
			if (cn[j] == '0') {
				
				
				if (j + 1 < cnlh && cn[j + 1] != '0') {
					
					rs = rs + num[0] + " ";
					
					j++;
					
					continue;
					
					
				} else {
					
					j++;
					
					continue;
					
				}
				
			}
			
			
			if (k > 1) {
			
				if ('1' == cn[j] && "shi".equals(digit[i])) {
					
					rs = rs + digit[i] + " ";
					
				} else {
					
					rs = rs + num[Integer.valueOf(cn[j] + "")] + " " + digit[i] + " ";
					
				}
				
			} else {
				
				rs = rs + num[Integer.valueOf(cn[j] + "")] + " " + digit[i] + " ";
				
			}
			
			j++;
			
		}
		
		
		if (k == 1) {
		
			return rs;
			
		} 
		
		if (k == 2) {
			
			rs = rs.trim();
			
			rs = rs + " wan ";
			
			return rs;
			
		}
		
		if (k == 3) {
			
			rs = rs.trim();
			
			rs = rs + " yi ";
			
			return rs;
			
		}
		
		return "";
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		String rs = n;
		
		
		int ws = n.length();
		
		if (ws <= 4) {
			
			for (int i = 0; i < 4 - ws; i++) {
				
				rs = "0" + rs;
				
			}
			
			rs = thousand(n, 1);
			
			rs = trimling(rs);
			
			System.out.println(rs);
			
			
		} else {
		
		if (ws <= 8) {
			
			for (int i = 0; i < 8 - ws; i++) {
				
				rs = "0" + rs;
				
			}
			
			
			String np = rs.substring(0, 4);
			
			String npp = rs.substring(4, 8);
			
			
			if ("0".equals(np.substring(np.length() - 1)) && !"0".equals(npp.substring(0, 1))) {
				
				rs = thousand(np, 2) + "ling " + thousand(npp, 1);
				
			} else {
				
				rs = thousand(np, 2) + thousand(npp, 1);
				
			}
			
			
			rs = trimling(rs);
			
			System.out.println(rs);
			
			
		} else {
			
			if (ws <= 12) {
				
				for (int i = 0; i < 12 - ws; i++) {
					
					rs = "0" + rs;
					
				}
				
				
				String np = rs.substring(0, 4);  //0012
				
				String npp = rs.substring(4, 8);  //3456
				
				String nppp = rs.substring(8, 12);  //7009
				
				
				
				
				if ("0".equals(np.substring(nppp.length() - 1)) && !"0".equals(npp.substring(0, 1))) {
					
					rs = thousand(np, 3) + "ling " + thousand(npp, 2);
					
				} else {
					
					rs = thousand(np, 3) + thousand(npp, 2);
					
				}
				
				
				if ("0".equals(npp.substring(npp.length() - 1)) && !"0".equals(nppp.substring(0, 1))) {
					
					rs = rs + "ling " + thousand(nppp, 1);
					
				} else {
					
					rs = rs + thousand(nppp, 1);
					
				}
				
				
				rs = trimling(rs);
				
				System.out.println(rs);
				
				
			} 
			
			
		}
		
		
		
		}
		
		
	}
	

}


































