package Improve;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * T 两条直线
 * 
 * https://zhidao.baidu.com/question/1307033655084738379.html
 * 
 * @author tugeng
 *
 */
public class Two_Straight_Lines {
	
	static List<Double> list = new ArrayList<Double>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		for (double i = 0; i < n; i++) {
		
			double x = sc.nextDouble();
			
			double y = sc.nextDouble();
			
			double lx1 = (x + y) / 2; 
					
			double ly1 = (x + y) / 2; 
			
			double lx2 = (x - y) / 2; 
			
			double ly2 = (y - x) / 2;

			double m1 = Math.abs((x + y) / Math.sqrt(2));
			
			double m2 = Math.abs((-1 * x + y) / Math.sqrt(2));
			
			double v = Math.sqrt((m1 * m1 + m2 * m2) * 0.5);
			
			System.out.println(m1 + " " + m2 + " " + v);
			
			list.add(2 * v);
			
		}
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println(df.format(Collections.min(list)));
		
	}
	
}












