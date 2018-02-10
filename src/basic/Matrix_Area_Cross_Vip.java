package basic;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 
 * T 平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。
 * 对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
 * 
 * 
 * 输入格式
 * 输入仅包含两行，每行描述一个矩形。
 * 在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。
 * 
 * 输出格式
 * 输出仅包含一个实数，为交的面积，保留到小数后两位。
 * 
 * 
 * 样例输入
 * 1 1 3 3
 * 2 2 4 4
 * 
 * 样例输出
 * 1.00
 * 
 * 
 * @author tugeng
 *
 */
public class Matrix_Area_Cross_Vip {
	
	//把所有顶点转化为左下角和右上角的形式
	public static double[] translate(double b[]) {
		
		double a[] = b.clone();
				
		if (a[0] > a[2]) {
			
			double a0 = a[0];
			
			double a1 = a[1];
			
			a[0] = a[2];
			
			a[1] = a[3];
			
			a[2] = a0;
			
			a[3] = a1;
			
		}
		
		
		if (a[1] > a[3]) {
			
			double h = a[1] - a[3];
			
			a[1] = a[1] - h;
			
			a[3] = a[3] + h;
			
		} 
		
		
		return a;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double[] a = new double[4];
		
		double[] b = new double[4];
		
		for (int i = 0; i < 4; i++) {
			
			a[i] = sc.nextDouble();
			
		}
		
		for (int j = 0; j < 4; j++) {
			
			b[j] = sc.nextDouble();
			
		}
		
		sc.close();
		
		a = translate(a);
		
		b = translate(b);
		
		//x，y轴排序
		double[] x = {a[0], a[2], b[0], b[2]};
		
		double[] y = {a[1], a[3], b[1], b[3]};	
		
		
//		double aminx = a[0] > a[2] ? a[2] : a[0];   double aminy = a[1] > a[3] ? a[3] : a[1];
//		
//		double amaxx = a[0] > a[2] ? a[0] : a[1];   double amaxy = a[1] > a[3] ? a[1] : a[3];
//		
//		double bminx = b[0] > b[2] ? b[2] : b[0];   double bminy = b[1] > b[3] ? b[3] : b[1];
//		
//		double bmaxx = b[0] > b[2] ? b[0] : b[1];   double bmaxy = b[1] > b[3] ? b[1] : b[3];
		
		
		if (a[0] >= b[2] || a[1] >= b[3] || b[0] >= a[2] || b[1] >= a[3]) {
			
			System.out.println("0.00");
			
			return;
			
		}
		
		if (a[0] <= b[0] && b[2] <= a[2] && a[1] <= b[1] && b[3] <= a[3]) {
			
			double rs = (b[2] - b[0]) * (b[3] - b[1]);
 			
			System.out.println(df.format(rs));
			
			return;
			
		}
		
		
		if (b[0] <= a[0] && a[2] <= b[2] && b[1] <= a[1] && a[3] <= b[3]) {
			
			double rs = (a[2] - a[0]) * (a[3] - a[1]);
 			
			System.out.println(df.format(rs));
			
			return;
			
		}
		
		
		Arrays.sort(x);
		
		Arrays.sort(y);
		
		double rs = (x[2] - x[1]) * (y[2] - y[1]);
		
		System.out.println(df.format(rs));
		
		
	}
	

}























