package basic;

import java.util.Scanner;

/**
 * 
 * 
 * T 有n（2≤n≤20）块芯片，有好有坏，已知好芯片比坏芯片多。
 *	 每个芯片都能用来测试其他芯片。用好芯片测试其他芯片时，能正确给出被测试芯片是好还是坏。
 *	 而用坏芯片测试其他芯片时，会随机给出好或是坏的测试结果（即此结果与被测试芯片实际的好坏无关）。
 * 	 给出所有芯片的测试结果，问哪些芯片是好芯片。
 * 
 * 输入格式
 * 输入数据第一行为一个整数n，表示芯片个数。
 * 第二行到第n+1行为n*n的一张表，每行n个数据。
 * 表中的每个数据为0或1，在这n行中的第i行第j列（1≤i, j≤n）的数据
 * 表示用第i块芯片测试第j块芯片时得到的测试结果，
 * 1表示好，0表示坏，i=j时一律为1（并不表示该芯片对本身的测试结果。芯片不能对本 身进行测试）
 * 
 * 输出格式
 * 按从小到大的顺序输出所有好芯片的编号
 * 
 * 
 * 
 * 样例输入
 * 3
 * 1 0 1
 * 0 1 0
 * 1 0 1
 * 
 * 样例输出
 * 1 3
 * 
 * 
 * 抽屉原理：如果把n+1个物体放入n个抽屉里，则必有一个抽屉里至少放了两个物体。 
 * 假如有一半以上的芯片同意了本芯片为好芯片的话
 * 
 * 
 * 任意拿两片芯片互相测试，则有
 * 1）结果都为真，则说明两片都为真，或者都为假。
 * 2）其他结果，则最少有一为假。
 * 
 * 在任意偶数多的芯片里，如果好芯片多于坏芯片，将所有芯片两两分组，根据抽屉原理，则有
 * 1）必有两个好芯片分在一组。
 * 2）同为好芯片的组数一定多于同为坏芯片的组数。
 * 
 * 
 * @author tugeng
 *
 */
public class Chip_Test_Vip {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		int b[][] = new int[a.intValue()][a.intValue()];
		
		for (int i = 0; i < a.intValue(); i++) {
			
			for (int j = 0; j < a.intValue(); j++) {
				
				b[i][j] = sc.nextInt();
				
				if (i == j) {
					
					b[i][j] = 0;
					
				}
				
				
			}
			
		}
		
		
		int sum = 0;
		
		for (int j = 0; j < a.intValue(); j++) {
			
			for (int i = 0; i < a.intValue(); i++) {
				
				if (b[i][j] == 1) {
					
					sum += 1;
					
				}
				
			}
			
			if (sum >= a.intValue() / 2) {
				
				System.out.print((j + 1) + " ");
				
			}
			
			sum = 0;
			
			
		}
		
		
		
		
		
	}

}
