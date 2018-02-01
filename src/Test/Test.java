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

		int a[] = {0,1,1,1};
		
		
		int b[] = is_Zero_One_String(a);
		
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.print(b[i] + " ");
			
		}
		
		System.out.println();
		
		

	}

	public static int[] is_Zero_One_String(int a[]) {
		
		int index = a.length - 1;
		
		a[index] += 1;
		
		
		for (int i = index; i >= 0; i--) {
			
			
			if (a[i] >= 2) {
				
				a[i] = 0;
				
				a[i - 1] += 1;
				
			}
			
		}
		
		return a;
	}

}
