package basic;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * T 高精度加法
 * 
 * 输入两个整数a和b，输出这两个整数的和。a和b都不超过100位。
 * 
 * 由于a和b都比较大，所以不能直接使用语言中的标准数据类型来存储。
 * 对于这种问题，一般使用数组来处理。
 * 
 * 定义一个数组A，A[0]用于存储a的个位，A[1]用于存储a的十位，
 * 依此类推。同样可以用一个数组B来存储b。
 * 计算c = a + b的时候，首先将A[0]与B[0]相加，
 * 如果有进位产生，则把进位（即和的十位数）存入r，把和的个位数存入C[0]，
 * 即C[0]等于(A[0]+B[0])%10。然后计算A[1]与B[1]相加，
 * 
 * 这时还应将低位进上来的值r也加起来，即C[1]应该是A[1]、B[1]和r三个数的和．
 * 如果又有进位产生，则仍可将新的进位存入到r中，和的个位存到C[1]中。
 * 依此类推，即可求出C的所有位。
 * 
 * 最后将C输出即可。
 *
 *
 * @author tugeng
 *
 */
public class High_Precision_Add_Vip2 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String sg = sc.nextLine();
		
		String sgg = sc.nextLine();
		
		long startTime=System.currentTimeMillis();   //获取开始时间
		
		
		BigInteger bsg = new BigInteger(sg);
		
		BigInteger bsgg = new BigInteger(sgg);
		
		long endTime=System.currentTimeMillis(); //获取结束时间
		
		
		System.out.println(bsg.add(bsgg));
		
		
		//最大测试数据 1 ms
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
		
		
		
	}
	
}


























