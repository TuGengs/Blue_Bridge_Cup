package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 测试时主程序会输入四个整数a, b, c, d，
 * 	 表示两个分数a/b和c/d。
 * 	 要求输出最简分数以及两个分数相等和大小的比较结果。
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class CH08_01 {
	
	public static int gcd(int a, int b) {
		
		int m = a % b;
		
		while (m != 0) {
			
			a = b;
			
			b = m;
			
			m = a % b;
			
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		Integer b = sc.nextInt();
		
		int g = gcd(a, b);
		
		while(g != 1) {
			
			a = a / g;
			
			b = b / g;
			
			g = gcd(a, b);
			
		}
		
		Integer c = sc.nextInt();
		
		Integer d = sc.nextInt();
		
		g = gcd(c, d);
		
		while(g != 1) {
			
			c = c / g;
			
			d = d / g;
			
			g = gcd(c, d);
			
		}
		
		System.out.println("zrf is:" + a + "/" + b + "; ssh is:" + c + "/" + d);
		
		double zrf = a / b;
		
		double ssh = c / d;
		
		System.out.println("(zrf==ssh) is:" + ((zrf == ssh) ? 1 : 0)  
				+ "; (zrf<ssh) is:" + ((zrf < ssh) ? 1 : 0)  );
		
		
	}

}
