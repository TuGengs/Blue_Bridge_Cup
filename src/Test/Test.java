package Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	@org.junit.Test
	public void test() {

		// String str = "123Asc";
		//
		// int i = 789;
		//
		// int w = i / 100;
		// int q = (i % 100) / 10;
		// int b = i % 10;
		//
		// System.out.println(w + " " + q + " " + b);

		// int b[][] = new int[1][2];
		//
		// System.out.println(b[0][1]);

		// System.out.println(str.toUpperCase());

		// Scanner sc = new Scanner(System.in);
		//
		// Integer a = sc.nextInt();

		// int l[] = new int[a.intValue()];
		//
		// for(int i = 0; i < a.intValue(); i++) {
		//
		// l[i] = sc.nextInt();
		//
		// }
		//
		// System.out.println(Arrays.binarySearch(l, 8));

		String a[] = { "123", "321", "xxx"};

		String b[];
		
		
		
		for (int j = 0; j < 3; j++) {
		
			b = right_move(a);
			
			
			System.out.println();
			
		
		}
		
		
		

	}

public static String[] right_move(String[] strs) {
		
		String str = strs[strs.length - 1];
		
//		[1 2 3 4 5]
//		[5 1 2 3 4]    [1 2 3 4 5]
		
		String[] strs2 = strs.clone();
		
		
		for(int i = 0; i < strs.length - 1; i++) {
			
			strs2[i + 1] = strs[i]; 
			
		}
		
		
		for(int i = 0; i < strs2.length; i++) {
			
			System.out.print(strs2[i] + " "); 
			
		}
		
		
		System.out.println("str: " + str);
		
		strs2[0] = str;
		
		System.out.println("strs2[0]: " + strs2[0]);
		
		return strs2;
		
	}

}
