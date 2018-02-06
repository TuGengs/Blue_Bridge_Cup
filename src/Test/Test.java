package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static int a = 0;
	
	@org.junit.Test
	public void test() throws Exception {

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
		String str = "ABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAHABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABA";
		
		String stp = "ABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAHABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABA";
		
		System.out.println(str.equals(stp));
		
	}
		
		
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
		
		
//		File f = new File("/Users/tugeng/Downloads/蓝桥/蓝桥杯题目和测试数据/基础训练/龟兔赛跑预测");
//		
//		File[] fs = f.listFiles();
//		
//		List<File> l1 = new ArrayList<File>();
//		
//		List<File> l2 = new ArrayList<File>();
//		
//		for (File file : fs) {
//			
//			if (file.getName().contains("input")) {
//				
//				l1.add(file);
//				
//			} 
//			
//			else if (file.getName().contains("output")) {
//				
//				l2.add(file);
//				
//			}
//			
//		}
//		
//		
//		System.out.println("input:");
//		
//		for (int i = 0; i < l1.size(); i++) {
//			
//			InputStreamReader isr = new InputStreamReader(new FileInputStream(l1.get(i).getPath()));
//			
//			BufferedReader br = new BufferedReader(isr);
//			 
//			String line = "";
//			 
////	         line = br.readLine();
//	         
////	         System.out.println(line);
//	         
//	        while (line != null) {  
//	        	
//				line = br.readLine(); // 一次读入一行数据
//			 
//				if (line != null) {
//					
//					System.out.println(line);
//					
//				}
//	             
//	        }  
//			
//		}
//		
//		
//		System.out.println("output:");
//		
//		for (int i = 0; i < l2.size(); i++) {
//			
//			InputStreamReader isr = new InputStreamReader(new FileInputStream(l2.get(i).getPath()));
//			
//			BufferedReader br = new BufferedReader(isr);
//			 
//			String line = "";
//			 
////	         line = br.readLine();
//	         
////	         System.out.println(line);
//	         
//	        while (line != null) {  
//	        	
//				line = br.readLine(); // 一次读入一行数据  
//			 
//				if (line != null) {
//					
//					System.out.println(line);
//					 
//				}
//	             
//	        }  
//			
//	        
//		}
//		
//
//		
//		
//}
	
	
	
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
		
		int a[][] = new int[3][3];
		ddd(a);
		System.out.println(a[0][0]);
		
//		char a[] = {'a'};
//		
//		int b = (a[0] + 1);
//		
//		System.out.println(a[0] + 1);
		
//		BigDecimal aBigDecimal ;
//        BigDecimal bigDecimal;
//        BigDecimal cBigDecimal;
//        Scanner scanner = new Scanner(System.in);
//        aBigDecimal = scanner.nextBigDecimal();
//        bigDecimal = scanner.nextBigDecimal();
//        cBigDecimal = aBigDecimal.add(bigDecimal);
//        System.out.println(cBigDecimal);
		
//		List<Integer> l = new ArrayList<Integer>();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		
//		for (Integer integer : l) {
//			System.out.println(integer);
//		}
		
		
	}
	
//	public void fff(List<Integer> l) {
//		l.add(1);
//	}

	public void ddd(int a[][]) {
		
		a[0][0] = 3;
		
	}
	
	@org.junit.Test
	public void test3() {
		
//		String str1 = "hello";
//				
//		String str2 = "h" + "ello";
//	
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str1 == str2);
		
		int i = 1;
		
		String si = i + "";
		
		System.out.println(si);
		
		System.out.println(i + 1 + " " + 1);
		
	
	}
	
}
