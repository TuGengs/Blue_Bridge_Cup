package Test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {

	public static int a = 0;
	
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

		//output
		String str = "5399078704881151299835410380560556041120756365346315261399954724376855527321903795111280526041015730";
		
		String stp = "5399078704881151299835410380560556041120756365346315261399954724376855527321903795111280526041015730";
		
		System.out.println(str.equals(stp));
		
		
//			int[] a = new int[100000];  
//	        Scanner sc = new Scanner(System.in);  
//
//	        int n = sc.nextInt();  
//
//	        long startTime=System.currentTimeMillis();   //获取开始时间
//	        
//	        sc.close();  
//	        a[0] = 1;  
//	  
//	        for (int i = 2; i <= n; i++) {  
//	            int jw = 0;  
//	            for (int j = 0; j < a.length; j++) {  
//	                int temp = a[j] * i + jw;  
//	                a[j] = temp % 10;  
//	                jw = temp / 10;  
//	            }  
//	  
//	        }  
//	  
//	        boolean begin = false;  
//	        
//	        long endTime=System.currentTimeMillis(); //获取结束时间
//	        
////	        for (int i = a.length - 1; i >= 0; i--) {  
////
////	                System.out.print(a[i]);  
////
////	        }  
//	        
//	        System.out.println();
//	  
//	        for (int i = a.length - 1; i >= 0; i--) {  
//	            if (begin) {  
//	                System.out.print(a[i]);  
//	                continue;  
//	            }  
//	  
//	            if (a[i - 1] != 0) {  
//	                begin = true;  
//	            }  
//	        }  
//	        
//	        System.out.println();
//	        
//	        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
//		
//		
}
	
	
	
//		int a[] = {0,1,1,1};
//		
//		
//		int b[] = is_Zero_One_String(a);
//		
//		
//		for (int i = 0; i < b.length; i++) {
//			
//			System.out.print(b[i] + " ");
//			
//		}
//		
//		System.out.println();
//		
//		
//
//	}
//
//	public static int[] is_Zero_One_String(int a[]) {
//		
//		int index = a.length - 1;
//		
//		a[index] += 1;
//		
//		
//		for (int i = index; i >= 0; i--) {
//			
//			
//			if (a[i] >= 2) {
//				
//				a[i] = 0;
//				
//				a[i - 1] += 1;
//				
//			}
//			
//		}
//		
//		return a;
//	}
	
	@org.junit.Test
	public void test2() {
		
//		char a[] = {'a'};
//		
//		int b = (a[0] + 1);
//		
//		System.out.println(a[0] + 1);
		
		BigDecimal aBigDecimal ;
        BigDecimal bigDecimal;
        BigDecimal cBigDecimal;
        Scanner scanner = new Scanner(System.in);
        aBigDecimal = scanner.nextBigDecimal();
        bigDecimal = scanner.nextBigDecimal();
        cBigDecimal = aBigDecimal.add(bigDecimal);
        System.out.println(cBigDecimal);
		
	}

}
