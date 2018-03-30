package Improve;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Date_Calculation {

	static int day1[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	static int day2[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	static boolean isyeap(int year) {
		
		if ((year % 4 == 0 && (year % 100) != 0) || (year % 400 == 0)) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	static int different(int y, int m, int d) {
		
		int sum = 0;
		
		for (int i = 1599; i < y; i++) {
			
			if (isyeap(i)) {
				
				sum += 366;
				
			} else {
				
				sum += 365;
				
			}
			
		}
		
		for (int i = 1; i < m; i++) {
			
			if (isyeap(y)) {
				
				sum += day1[i];
				
			} else {
				
				sum += day2[i];
				
			}
			
		}
		
		sum += d - 1;
		
		return sum;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int y = Integer.valueOf(str[0]);
		
		int m = Integer.valueOf(str[1]);
		
		int d = Integer.valueOf(str[2]);
		
		
		int diff = different(y, m, d) - different(2011, 11, 11);
		
//		System.out.println(different(2011, 11, 11));
		
		diff = diff % 7;	// w = 5
		
		if (diff > 0) {
						
			if (diff <= 2) 
				System.out.println(5 + diff);
			else 
				System.out.println(5 + diff - 7);
				
			
		} else {
			
			diff = Math.abs(diff);
			
			if (diff < 5) 
				System.out.println(5 - diff);
			else 
				System.out.println(5 - diff + 7);
			
		}
		
		
		
	}
	
}
