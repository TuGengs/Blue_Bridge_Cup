package algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 
 * T 给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。
 * 
 * 
 * 样例输入
 * 5
 * 1 2 3 4 5
 * 2
 * 1 5 2
 * 2 3 2
 * 
 * 样例输出
 * 4  (3)
 * 2  (1)
 * 
 * 
 * @author tugeng
 *
 */
public class Interval_K_Large_Number_Query {
	
	// [0, size-1]
	public static int Quick_Sort(int a[], int low, int high) {
		
		int temp = a[low];
		
		int i = low;
		
		int j = high;
		
		
		while (i < j) {
//			>= 很重要用于判断是否相等的情况。比如1 2 2 3返回第二大其实就是第三大，
//			因此结果不会有误差也不会进入死循环。
			while (i < j && a[j] >= temp) {   
				
				j --;
				
			}
			
			int appos = a[i];
			
			a[i] = a[j];
				
			a[j] = appos;
			
			
			 while(i < j && a[i] <= temp) {
				 
				 i ++;
				 
			 }  

			 
				int appos2 = a[i];
				
				a[i] = a[j];
					
				a[j] = appos2;
			 
			 
		}
		
		
	    return i;
	    
		
}
	
	public static int Findkth(int a[], int n, int k) {

	    int low = 0;
	    
	    int high = n - 1;
	    
	    int pos = Quick_Sort(a, low, high);
	    
	    while(true) {
	    	
	        if(n - k < pos) {
	        	
	        	pos = Quick_Sort(a, 0, pos - 1);
	        	
	        } else {
	        	
	        	if (n - k > pos) {
	        		
	        		pos = Quick_Sort(a, pos + 1, high);
	        		
	        	}
	        	
	        	if (n - k == pos) {
	        		
	        		return a[pos];
	        		
	        	}
	        	
	        	
	        }
	            
	        
	    }  
	    
	    
	}  
	
	public static int[] CopyArrays(int a[], int left, int right) {
		
		int b[] = Arrays.copyOfRange(a, left, right + 1);
		
		return b;
		
	}
 	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		int b[] = new int[a.intValue()];
		
		for (int i = 0; i < a.intValue(); i++) {
			
			b[i] = sc.nextInt();
			
		}
		
		Integer n = sc.nextInt();
		
		int c[][] = new int[n][3];
		
		for (int i = 0; i < n.intValue(); i++) {
			
			for (int j = 0; j < 3; j++) {
				
				c[i][j] = sc.nextInt();
				
			}
			
			//32392 14605 3903 154 293 12383 17422 18717 19719 19896 5448 21727 14772 11539 1870 19913 25668
		}
		
		long state_time = System.nanoTime(); 
		
//		1 5 2
//		2 3 2
		for (int i = 0; i < n.intValue(); i++) {
			
			int p[] = CopyArrays(b, c[i][0] - 1, c[i][1] - 1);
			
			System.out.println(Findkth(p, p.length, c[i][2]));

//			int temp[] = CopyArrays(b, c[i][0] - 1, c[i][1] - 1);
//			
//			Arrays.sort(temp);
////			1328000 ns 1875000ns 3809000ns
//			System.out.println(temp[temp.length - c[i][2]]);
			
			
		}
		
		long end_time = System.nanoTime();
		//1185000 ns  1704000ns 2498000ns
		System.out.println(end_time - state_time);
		
		
	}
	
}
