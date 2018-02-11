package algorithm.training;

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
		
		int pos = low;
		
		int i = low;
		
		int j = high;
		
		
		while (i < j) {
			
			while (i < j && a[j] > temp) {
				
				j --;
				
			}
			
			if (i < j) {
				
				a[pos] = a[j];
				
				pos = j;
				
			}
			
			 while(i < j && a[i] < temp) {
				 
				 i ++;
				 
			 }  

			 
			 if(i < j) {  
				 
				 a[pos] = a[i];
				 
				 pos = i;
				 
			 }  
			 
			 
		}
		
		a[pos] = temp;
		
	    return pos;
		
}
	
	public static int Findkth(int a[], int n, int k) {

	    int low = 0;
	    int high = n - 1;
	    
	    while(true) {
	    	
	        int pos = Quick_Sort(a, low, high);
	        
	        if(pos == n - k) {
	        	
	        	return a[pos];
	        	
	        }  
	            
	        else if(pos < n - k) {
	        	
	            low = pos + 1;
	            
	            high = n - 1;
	            
	        }  
	        else if(pos > n - k) {
	        	
	            high = pos - 1;
	            
	            low = 0;  
	            
	        }  
	        
	    }  
	    
	}  
	
	public static int[] CopyArrays(int a[], int left, int right) {
		
		int b[] = new int[right - left + 1];
		
		int j = 0;
		
		for (int i = left; i <= right; i++) {
			
			b[j] = a[i];
			
			j++;
			
		}
		
		
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
			
			
		}
		
		
		
//		1 5 2
//		2 3 2
		for (int i = 0; i < n.intValue(); i++) {
			
//			System.out.println(Findkth(
//					CopyArrays(b, c[i][0] - 1, c[i][1] - 1), (c[i][1] - c[i][0]) + 1, c[i][2]));
			
			int temp[] = CopyArrays(b, c[i][0] - 1, c[i][1] - 1);
			
			Arrays.sort(temp);
			
			System.out.println(temp[temp.length - c[i][2]]);
			
			
		}
		
		
		
	}
	
}
