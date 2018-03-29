package Competition_Course;

import java.util.Scanner;

public class Verification_Of_Credit_Card_Number {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "X" + new StringBuffer(sc.next()).reverse().toString();
		
		int odd = 0;	// 奇数
		
		int even = 0;	// 偶数
		
		for (int i = 1; i < str.length(); i++) {
			
			if (i % 2 == 0) {	// even
				
				int num = 2 * (str.charAt(i) - '0');
				
				even += ((num >= 10) ? (num - 9) : num); 
				
//				System.out.println("even: " + ((num) >= 10 ? (num - 9) : num));
				
			}
			
			if (i % 2 != 0) {	// odd
				
				odd += (str.charAt(i) - '0');
				
//				System.out.println("odd: " + (str.charAt(i) - '0'));
				
			}
			
		}
		
		if ((odd + even) % 10 == 0)
			System.out.println("OK");
		else 
			System.out.println("ERROR");
		
		
	}

}
