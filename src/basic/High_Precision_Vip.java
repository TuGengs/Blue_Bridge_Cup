package basic;

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
 * 核心代码:
 * 
 *******************************************
 *******************************************

 for (int i = 2; i <= n; i++) {  
        int jw = 0;  
        for (int j = 0; j < a.length; j++) {  
            int temp = a[j] * i + jw;  
            a[j] = temp % 10;  
            jw = temp / 10;  
        }  
	}
	
 ********************************************
 ********************************************
 *
 *
 * @author tugeng
 *
 */
public class High_Precision_Vip {
	
	// 1000 ^ 1000 = 1 * 10^30
	public static int Array_Const = 3000;
	
	public static int flag = 1; //记录当前大数数组的最大位数(进位产生，默认为1)
	
	public static int[] carry(int a[], int n) {
		
		int nn = n;
		
		int f = 0;
		
		for (int i = 0; i < nn + 1; i++) {
			
			while (a[i] >= 10) {
				
				a[i] -= 10;
				
				a[i + 1] += 1;
				
				
				if (i + 2 > flag) {
					
					flag = i + 2;
					
				} 
				
				
				//无限进位的情况...
				if (i == nn && f == 0) {
					
					++nn;
					
					f = 1;
					
				}
				
			}
			
			f  = 0;
			
		}
		
		if (nn > flag) {
			
			flag = nn;
			
		}
		
		return a;
		
	}
	
	public static int pre_digits(int y, int index) {
		
		for (int i = 0; i < index; i++) {
			
			y = y / 10;
			
		}
		
		return y % 10;
		
	}
	
	public static int[] number_to_array(int x, int n) {
		
		int a[] = new int[n];
		
		int y = x;
		
//		12345 [1 2 3 4 5]
		for (int i = 0; i < n; i++) {
			
			a[i] = pre_digits(y, i);
			
		}
		
		return a;
		
	}
	
	public static int number_of_digits(int n) {
		
		String sn = String.valueOf(n);
		
		return sn.length();
		
	}

	public static void main(String[] args) {
		
		// e.g. 10
		Integer a = new Scanner(System.in).nextInt();
		
		long startTime=System.currentTimeMillis();   //获取开始时间
		
		int b[] = new int[Array_Const];
		
		b[0] = 1;
		
		
		for (int i = 1; i <= a; i++) {
			
			for (int j  = 0; j < flag; j++) {
				
				b[j] = b[j] * i;
				
			}
			
			
			b = carry(b, flag);
			
		}
		
		long endTime=System.currentTimeMillis(); //获取结束时间

		
		int pd = 1;
		
		for (int k  = flag; k >= 0; k--) {
			
			if (b[k] == 0 && pd == 1) {
				
				continue;
				
			}
			
			pd = 0;
			
			System.out.print(b[k]);
			
		}
		
		System.out.println();
		
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
		
		
	}
	
}
