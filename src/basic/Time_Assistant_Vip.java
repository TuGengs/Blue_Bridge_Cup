package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * 
 * T:
 * 如果m为0，则将时读出来，然后加上“o'clock”，如3:00 读作“three o'clock”
 * 如果m不为0，则将时读出来，然后将分读出来，如5:30 读作“five thirty”
 * 
 * 0:zero, 1: one, 2:two, 3:three, 4:four, 5:five, 
 * 6:six, 7:seven, 8:eight, 9:nine, 10:ten, 
 * 11:eleven, 12:twelve, 13:thirteen, 14:fourteen, 15:fifteen, 
 * 16:sixteen, 17:seventeen, 18:eighteen, 19:nineteen, 20:twenty
 * 30 读作thirty，40 读作forty，50 读作fifty。
 * 
 * Z: 
 * 对于大于20小于60的数字，首先读整十的数，然后再加上个位数。如31首先读30再加1的读法，读作“thirty one”
 * 按上面的规则21:54读作“twenty one fifty four”，9:07读作“nine seven”，0:15 读作“zero fifteen”
 * 
 * 
 * 输入格式
 * 输入包含两个非负整数h和m，表示时间的时和分。非零的数字前没有前导0。h小于24，m小于60。
 * 输出格式
 * 输出时间时刻的英文。
 * 
 * 样例输入
 * 0 15
 * 样例输出
 * zero fifteen
 * 
 * 
 * 
 * X (Map's 4Ergodic):
 * 
 * 1、for (Integer in : map.keySet()) {}
 * 
 * 2、Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
 * 
 * 3、for (Map.Entry<Integer, String> entry : map.entrySet()) {}
 * 
 * 4、for (String v : map.values()) {
 * 
 * 
 * 
 * @author tugengs
 *
 */
public class Time_Assistant_Vip {
	
	public static void init(Map<Integer, String> map) {
		
		map.put(0, "zero");
		
		map.put(1, "one");
		
		map.put(2, "two");
		
		map.put(3, "three");
		
		map.put(4, "four");
		
		map.put(5, "five");
		
		map.put(6, "six");
		
		map.put(7, "seven");
		
		map.put(8, "eight");
		
		map.put(9, "nine");
		
		map.put(10, "ten");
		
		map.put(11, "eleven");
		
		map.put(12, "twelve");
		
		map.put(13, "thirteen");
		
		map.put(14, "fourteen");
		
		map.put(15, "fifteen");
		
		map.put(16, "sixteen");
		
		map.put(17, "seventeen");
		
		map.put(18, "eighteen");
		
		map.put(19, "nineteen");
		
		map.put(20, "twenty");
		
		map.put(30, "thirty");
		
		map.put(40, "forty");
		
		map.put(50, "fifty");
		
		
	}

	public static String solve(Map<Integer, String> map, Integer a) {
		
		if ((a.intValue() < 20) || (a.intValue() % 10 == 0)) {
			
			return map.get(a.intValue());
			
		} else {
			
			int g = a.intValue() % 10;
			
			int s = a.intValue() - g;
			
			String str = map.get(s) + " " + map.get(g);
			
			return str;
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer h = sc.nextInt();
		
		Integer m = sc.nextInt();
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		init(map);
		
		String rs;
		
		
		if (m.intValue() == 0) {
			
			System.out.println(map.get(h.intValue()) + " o'clock");
			
		} else {
			
			String hstr = solve(map, h);
			
			String mstr = solve(map, m);
			
			rs = hstr + " " + mstr;
			
			System.out.println(rs);
			
			
		}
		
		
		
	}
	
}
