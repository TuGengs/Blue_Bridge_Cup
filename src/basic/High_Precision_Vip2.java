package basic;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 
 * T 输入一个正整数n，输出n!的值。 其中n!=1*2*3*…*n。
 * 
 * 	n!可能很大，而计算机能表示的整数范围有限，需要使用高精度计算的方法。
 * 	使用一个数组A来表示一个大整数a，
 * 	A[0]表示a的个位，A[1]表示a的十位，依次类推。
 * 	将a乘以一个整数k变为将数组A的每一个元素都乘以k，请注意处理相应的进位。
 * 	首先将a设为1，然后乘2，乘3，当乘到n时，即得到了n!的值。
 * 
 * 
 * @author tugeng
 *
 */
public class High_Precision_Vip2 { 
	
	public static void main(String[] args) {
		
		Integer a = new Scanner(System.in).nextInt();
		
		long startTime=System.currentTimeMillis();   //获取开始时间
		
		BigDecimal big = new BigDecimal(1.0);
		
		for (double i = 2.0; i <= a.intValue(); i++) {
			
			big = big.multiply(new BigDecimal(i));
			
		}
		
		long endTime=System.currentTimeMillis(); //获取结束时间
		
		System.out.println(big);
		
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

	}
	
}
