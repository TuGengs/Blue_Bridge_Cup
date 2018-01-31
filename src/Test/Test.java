package Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	@org.junit.Test
	public void test() {
		
//		String str = "123Asc";
//		
//		int i = 789;
//		
//		int w = i / 100;
//		int q = (i % 100) / 10;
//		int b = i % 10;
//		
//		System.out.println(w + " " + q + " " + b);
		
//		int b[][] = new int[1][2];
//		
//		System.out.println(b[0][1]);
		
//		System.out.println(str.toUpperCase());
		
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();

		
		int l[] = new int[a.intValue()];
		
		for(int i = 0; i < a.intValue(); i++) {
			
			l[i] = sc.nextInt();
			
		}
		
		System.out.println(Arrays.binarySearch(l, 8));
		
		
	}

}
