package primer;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * 四舍五入
 * 1、DecimalFormat df = new DecimalFormat("#.##");
 * 2、(double)(Math.round(result_value*100)/100.0);
 * 3、Double.ParseDouble(String.format("%.2f",result_value));
 * 4、BigDecimal bd = new BigDecimalresult_value();
 * 		BigDecimal  bd2 = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
 * 		get_double = Double.ParseDouble(bd2.ToString());
 * 
 * 不四舍五入
 * 1、double d = 13.4324;
 * 		d=((int)(d*100))/100.0;
 * 2、(只要输出结果) System.out.println(String.format("%.2f", x1));
 * 
 * @author tugeng
 *
 */
public class Circle_Area {
	
	public static void main(String[] args) {
		
		Integer a;
		Double area;
		DecimalFormat df;
		
		a = new Scanner(System.in).nextInt();
		area = Math.PI * Math.pow(a, 2.0);
		df = new DecimalFormat("#.0000000");
		
		System.out.println(df.format(area));
		
	}
}
