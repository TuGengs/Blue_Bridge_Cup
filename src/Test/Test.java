package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static int a = 0;
	
	@org.junit.Test
	public void test() throws Exception {
		
		
		File f = new File("/Users/tugeng/Downloads/蓝桥/蓝桥杯题目和测试数据/基础训练/时间转换");
		
		File[] fs = f.listFiles();
		
		List<File> l1 = new ArrayList<File>();
		
		List<File> l2 = new ArrayList<File>();
		
		for (File file : fs) {
			
			if (file.getName().contains("input")) {
				
				l1.add(file);
				
			} 
			
			else if (file.getName().contains("output")) {
				
				l2.add(file);
				
			}
			
		}
		
		
		System.out.println("input:");
		
		for (int i = 0; i < l1.size(); i++) {
			
			InputStreamReader isr = new InputStreamReader(new FileInputStream(l1.get(i).getPath()));
			
			BufferedReader br = new BufferedReader(isr);
			 
//			System.out.println(l1.get(i).getName());
			
			String line = "";
			 
//	         line = br.readLine();
	         
//	         System.out.println(line);
	         
	        while (line != null) {  
	        	
				line = br.readLine(); // 一次读入一行数据
			 
				if (line != null) {
					
					System.out.println(line);
					
				}
	             
	        }  
			
		}
	}
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
//		
//		int i = 1;
//		
//		String si = "123" + i;
//		
//		System.out.println(si);
//		
//		System.out.println(i + 1 + " " + 1);
		
//		for (int i = 0; i < 3; i++) {
//			
//			if (i < 100) {
//				
//				continue;
//				
//			}
//			
//			System.out.println(123);
//			
//		}
//		
		
		
		
//		String str = "1234";
//		
//		char[] a = {'1','2'};
		
//		System.out.println(Integer.valueOf('1' + ""));
		
//		System.out.println(str.substring(0, 1));
		
//		System.out.println(a.toString());
		
//		XXX:
//		for (int i = 0; i < 2; i++) {
//			
//			int x = 0;
//			
//			for (int j = 0; j < 2; j++) {
//				
//				if (i == 0) {
//					break;
//				}
//				
//				if (j == 1) {
//					continue XXX;
//				}
//			}
//			
//			
//			System.out.println(111);
//			
//		}
//		
//		System.out.println(222);
		
//		DecimalFormat df = new DecimalFormat("0.00");
//		
//		DecimalFormat df2 = new DecimalFormat("#.##");
//		
//		System.out.println(df.format(1123.0));
		
		
//		int aa[] = {32392, 14605, 3903, 154, 293, 12383, 17422, 18717, 19719, 19896, 5448, 21727, 14772, 11539, 1870, 19913, 25668};
		
//		int aaa[] = Arrays.copyOfRange(aa, 0, 3);
		
//		Arrays.sort(aa);
		
//		for (int i = 0; i < aa.length; i++) {
//			
//			System.out.print(aa[i] + " ");
//			
//		}
		
		System.out.println(Integer.MAX_VALUE);
		
//		System.out.println(df2.format(1.0));
	
	}
	
}
