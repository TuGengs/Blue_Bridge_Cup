package primer;

import java.util.Scanner;

/**
 *  1、short 
 *	最小值：Short.MIN_VALUE=-32768 （-2的15此方）
 *	最大值：Short.MAX_VALUE=32767 （2的15次方-1）
 *	2、int
 *	最小值：Integer.MIN_VALUE= -2147483648 （-2的31次方）
 *	最大值：Integer.MAX_VALUE= 2147483647(10)  （2的31次方-1）
 *	3、long
 *	最小值：Long.MIN_VALUE=-9223372036854775808 （-2的63次方）
 *	最大值：Long.MAX_VALUE=9223372036854775807(19) （2的63次方-1）
 *	4、float
 *	最小值：Float.MIN_VALUE=1.4E-45 （2的-149次方）
 *	最大值：Float.MAX_VALUE=3.4028235E38 （2的128次方-1）
 *	5、double 
 *	最小值：Double.MIN_VALUE=4.9E-324 （2的-1074次方）
 *	最大值：Double.MAX_VALUE=1.7976931348623157E308 （2的1024次方-1）
 * 
 * 
 * @author tugeng
 *
 */

public class Fibonacci {
	
	private static Integer b1;
	private static Integer b2;
	private static Integer b3;
	
	static {
		
		b1 = 1;
		b2 = 1;
		b3 = 1;
	}
	
	public static Integer fib(Integer a) {
		
		if (a.intValue() > 2) {
			
			for (int i = 3; i <= a.intValue(); i++) {
				
				/**
				 * 此处用递归，时间和空间都通不过...故采用迭代的方式
				 * 
				 */
				
				b3 = Integer.valueOf((b1.intValue() + b2.intValue()) % 10007);
				b1 = b2;
				b2 = b3;

			}
		}
		
		return b3;
	}

	public static void main(String[] args) {
		
		Integer a = new Scanner(System.in).nextInt();
		
		System.out.println(Fibonacci.fib(a).intValue());
	}
	
}
