package OldZhenTi;

import java.util.Scanner;

/**
 * 
 * T 100 可以表示为带分数的形式：100 = 3 + 69258 / 714
 * 	 还可以表示为：100 = 82 + 3546 / 197。
 * 	 注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。
 * 	 类似这样的带分数，100 有 11 种表示法。
 * 
 * 
 * @author tugeng
 *
 */
public class Band_Fraction2 {
	
	public static int num = 0;
	
	public static int nums = 0;
	
	public static boolean judge(int left, int up, int down) {	//123421
		
		int times[] = new int[10];
		
		if (String.valueOf(left).indexOf("0") != -1 
				|| String.valueOf(up).indexOf("0") != -1
				|| String.valueOf(down).indexOf("0") != -1)
			return false;
		
		char[] sleft = String.valueOf(left).toCharArray();
		
		char[] sup = String.valueOf(up).toCharArray();
		
		char[] sdown = String.valueOf(down).toCharArray();
		
		int max = Math.max(Math.max(sleft.length, sup.length), sdown.length);
		
		for (int i = 0; i < max; i++) {
			
			if (i < sleft.length) {	
				
				times[sleft[i] - '0'] ++;
				
			}
			
			
			if (i < sup.length) {
				
				times[sup[i] - '0'] ++;
			}
			
			if (i < sdown.length) {
				
				times[sdown[i] - '0'] ++;
			}
			
		}
		
		for (int t = 1; t < times.length; t++) {
			
			if (times[t] < 1 || times[t] > 1) {
				
				return false;
				
			} 
			
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		flag = new int[10];
		
		num = sc.nextInt();
		
		if (num >= 100 && num <= 1000) {
		
		for (int i = 1; i < num; i++) {
				
				for (int j = 1; j < 1000; j++) {
					
					int up = (num - i) * j;	// i : left 		j : down 
					
					if (up % j != 0) continue;
					
					if(judge(up, i, j)) {
						
	//					System.out.println(i + " " + up + " " + j);
						
						nums ++;
						
					}
					
				}
				
			}
		
		}
			
			if (num > 1000) {
				
				for (int i = 1; i < num - 10; i++) {
					
					for (int j = 1; j < 100; j++) {
						
						int up = (num - i) * j;	// i : left 		j : down 
						
						if (up % j != 0) continue;
						
						if(judge(up, i, j)) {
							
//							System.out.println(i + " " + up + " " + j);
							
							nums ++;
							
						}
						
					}
				
			}
			
			if (num > 10 && num <= 100) {
				
				for (int i = 1; i < num; i++) {
					
					for (int j = 1; j < 1000; j++) {
						
						int up = (num - i) * j;	// i : left 		j : down 
						
						if (up % j != 0) continue;
						
						if(judge(up, i, j)) {
							
							nums ++;
							
						}
						
					}
				
				}
				
			}
			
			}
			
			if (num <= 10) {
				
				for (int i = 1; i < num; i++) {
					
					for (int j = 1; j < 10000; j++) {
						
						int up = (num - i) * j;	// i : left 		j : down 
						
						if (up % j != 0) continue;
						
						if(judge(up, i, j)) {
							
		//					System.out.println(i + " " + up + " " + j);
							
							nums ++;
							
						}
						
					}
				
				}
			
			}
		
		
		System.out.println(nums);
		
		
	}
	
}
