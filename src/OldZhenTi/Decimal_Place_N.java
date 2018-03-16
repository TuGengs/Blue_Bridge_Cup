package OldZhenTi;

import java.util.Scanner;

/**
 * 
 * 我们知道，整数做除法时，有时得到有限小数，有时得到无限循环小数。
 * 如果我们把有限小数的末尾加上无限多个0，它们就有了统一的形式。
 * 
 * 
 * @author tugeng
 *
 */
public class Decimal_Place_N {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a, b, n;
		
		long sa, sn, count;
		
		a = sc.nextLong();
		
		b = sc.nextLong();
		
		n = sc.nextLong();
		
		sn = n;
		
		sa = a % b;
		
		count = 0;
		
		while (sn -- != 0) {
			
			if (sa == b)		// 取余之后会等于零
				break;
			
			if (sa < b) {
				
				sa = sa * 10;
				
			}
			else {
				
				sa = sa % b;
				
				sa = sa * 10;
			
				if (sa == 0) 
					break;	// 后面都是零则直接挑出循环
			
			}
			
			count ++;
			
			if (sa % b == a % b) {	// 减掉循环的数
				
				sn = n % count;
				
			}
			
			
		}
			
		if (sa == 0) {
			
			System.out.println("000");
			
		} else {
			
			int i = 3;
			
			while(i-- != 0) {
				
				System.out.print(sa / b);
				
				sa = sa % b;
				
				sa = sa * 10;
				
			}
				
		}
		
	}
	
}
