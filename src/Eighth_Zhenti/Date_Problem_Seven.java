package Eighth_Zhenti;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * T 年/月/日的，有采用月/日/年的，还有采用日/月/年的
 * 
 * 1960年1月1日至2059年12月31日。
 * 
 * 比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。
 * 
 * 
 * @author tugeng
 *
 */
public class Date_Problem_Seven {
	
	public static int noyeap[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 12};
	
	public static int yeap[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 12};
	
	public static boolean isYear(String str) {
		
		if (str.substring(0, 1).equals("0")) {
			
			return true;
			
		}
		
		if (Integer.valueOf(str) < 100) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static String ToYear(String str) {
		
		if (str.substring(0, 1).equals("0")) {
			
			return "20" + str;
			
		}
		
		if (Integer.valueOf(str) < 60) {
			
			return "20" + str;
			
		}
		
		
		return "19" + str;
		
	}
	
	public static boolean isMonth(String str) {
		
		if (str.substring(0, 1).equals("0") 
				&& !str.substring(1).equals("0")) {
			
			return true;
			
		}
		
		if (str.substring(0, 1).equals("0") 
				&& str.substring(1, 2).equals("0")) {
			
			return false;
			
		}
		
		if (Integer.valueOf(str) <= 12) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static boolean isDay(String str, String month, String year) {
		
		boolean isyeap = false;
		
		if (isYear(year)) {
			
			year = ToYear(year);
			
		}
		
		if (Integer.valueOf(year) % 4 == 0 && Integer.valueOf(year) % 100 != 0
				|| Integer.valueOf(year) % 400 == 0) {
			
			isyeap = true;
			
		}
		
		int d[];
		
		if (isyeap) {
			
			d = yeap;
			
		} else {
			
			d = noyeap;
			
		}
		
		
		if (isMonth(month)) {
			
			if (month.substring(0, 1).equals("0"))
				month = month.substring(1);
			
		} else {
			
			return false;
			
		}
		
		
		if (str.substring(0, 1).equals("0") 
				&& !str.substring(1, 2).equals("0")) {
			
			return true;
			
		}
		
		if (str.substring(0, 1).equals("0") 
				&& str.substring(1, 2).equals("0")) {
			
			return false;
			
		}
		
		if (Integer.valueOf(str) <= d[Integer.valueOf(month)]) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static String ToMonth(String str) {
		
		return str;
		
	}
	
	public static String ToDay(String str) {
		
		return str;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ss[] = br.readLine().split("/");
		
		if (isYear(ss[0]) && isMonth(ss[1]) && isDay(ss[2], ss[1], ss[0])) {
			
			System.out.println(ToYear(ss[0]) + "-" 
			+ ToMonth(ss[1]) + "-" + ToDay(ss[2]));
			
		}
		
		if (isYear(ss[2]) && isMonth(ss[0]) && isDay(ss[1], ss[0], ss[2])) {
			
			System.out.println(ToYear(ss[2]) + "-" 
					+ ToMonth(ss[0]) + "-" + ToDay(ss[1]));
			
		}
		
		if (isYear(ss[2]) && isMonth(ss[1]) && isDay(ss[0], ss[1], ss[2])) {
			
			System.out.println(ToYear(ss[2]) + "-" 
					+ ToMonth(ss[1]) + "-" + ToDay(ss[0]));
			
		}
		
		
	}
	

}



















