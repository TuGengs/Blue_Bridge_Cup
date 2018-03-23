package OldZhenTi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * T 高僧斗法 nim问题
 * 
 * 
 * @author tugeng
 *
 */
public class Monks_Of_Wits {
	
	public static boolean nim(int[] a) {
		
//		for (int i = 0; i < a.length; i++){ 
//			System.out.print(a[i] + " "); 
//		}
//		System.out.println();
		
		int sum = 0;
		
		for (int i = 0; i < a.length - 1; i += 2) {
			
//			System.out.println(a[i + 1] - a[i] - 1);
			
			sum ^= (a[i + 1] - a[i] - 1);
			
		}
		
		return sum == 0;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strs[] = br.readLine().split(" ");
		
		int[] a = new int[strs.length];
		
		for (int i = 0; i < strs.length; i++) {
			
			a[i] = Integer.valueOf(strs[i]);
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if (i + 1 >= a.length) break;
			
			for (int j = a[i] + 1; j < a[i + 1]; j++) {
				
				int old = a[i];
				
				a[i] = j;
				
				if (nim(a)) {
					
					System.out.println(old + " " + j);
					
					return ;
					
				}
				
				a[i] = old;
				
			}
			
		}
		
		
		
		
	}

}










