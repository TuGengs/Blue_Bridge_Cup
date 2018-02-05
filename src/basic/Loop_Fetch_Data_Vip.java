package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 
 * T 回形取数就是沿矩阵的边取数，若当前方向上无数可取或已经取过，则左转90度。
 *	 一开始位于矩阵左上角，方向向下。
 * 
 * 
 * 
 * 输入格式
 * 输入第一行是两个不超过200的正整数m, n，表示矩阵的行和列。接下来m行每行n个整数，表示这个矩阵。
 * 输出格式
 * 输出只有一行，共mn个数，为输入矩阵回形取数得到的结果。数之间用一个空格分隔，行末不要有多余的空格。
 * 
 * 
 * 样例输入
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 样例输出
 * 1 4 7 8 9 6 3 2 5
 * 
 * 样例输入
 * 3 2
 * 1 2
 * 3 4
 * 5 6
 * 样例输出
 * 1 3 5 6 4 2
 * 
 * 
 * @author tugeng
 *
 */
public class Loop_Fetch_Data_Vip {

	public static int DOWN = 1;
	
	public static int RIGHT = 2;
	
	public static int UP = 3;
	
	public static int LEFT = 4;
	
	public static int FULL = 5;
	
	public static List<Integer> list = new ArrayList<Integer>();
	
	public static int compass[] = {DOWN, RIGHT, UP, LEFT};
	
	
	public static void recursion(int m[][], int mi, int mj, int acompass) {
		
		
		if (list.size() == m.length * m[0].length) {
			
//			System.out.println(list.size());
			
			return;
			
		}
		
		if (compass[acompass] == DOWN) {
			
			//改用while 不然深度太深 java.lang.StackOverflowError
			while (m[mi][mj] != -1) {
				
				list.add(m[mi][mj]);
				
				m[mi][mj] = -1;
				
				//递归调用
				if (mi + 1 == m.length || m[mi + 1][mj] == -1) {
					
					recursion(m, mi, mj + 1, (acompass + 1) % 4);
					
					
				} else {
					
					//不用else，递归后还是会调用，导致数组溢出...
					mi += 1;
					
					
				}
				
//				else {
//					
//					recursion(m, mi + 1, mj, acompass);
//					
//				}
				
				
				
			}
			
			
		}
		
		
		
		
		if (compass[acompass] == RIGHT) {
			
			while (m[mi][mj] != -1) {
				
				list.add(m[mi][mj]);
				
				m[mi][mj] = -1;
				
				//递归调用
				if (mj + 1 == m[0].length || m[mi][mj + 1] == -1) {
					
					recursion(m, mi - 1, mj, (acompass + 1) % 4);
					
					
				} else {
					
					mj += 1;
					
					
				}
				
//				else {
//					
//					recursion(m, mi, mj + 1, acompass);
//					
//				}
				
				
				
			}
			
			
		}
		
		
		
		
		if (compass[acompass] == UP) {
			
			while (m[mi][mj] != -1) {
				
				list.add(m[mi][mj]);
				
				m[mi][mj] = -1;
				
				//递归调用
				if (mi - 1 == -1 || m[mi - 1][mj] == -1) {
					
					recursion(m, mi, mj - 1, (acompass + 1) % 4);
					
					
				} else {
					
					mi -= 1;
					
					
				}
				
//				else {
//					
//					recursion(m, mi - 1, mj, acompass);
//					
//				}
				
				
				
			}
			
			
		}
		
		
		
		
		if (compass[acompass] == LEFT) {
			
			while (m[mi][mj] != -1) {
				
				list.add(m[mi][mj]);
				
				m[mi][mj] = -1;
				
				//递归调用
				if (mj - 1 == -1 || m[mi][mj - 1] == -1) {
					
					recursion(m, mi + 1, mj, (acompass + 1) % 4);
					
					
				} else {
					
					mj -= 1;
					
					
				}
				
//				else {
//					
//					recursion(m, mi, mj - 1, acompass);
//					
//				}
				
				
				
			}
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {

		// 下 右 上 左
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		Integer b = sc.nextInt();
		
		
		int matrix[][] = new int[a.intValue()][b.intValue()];
		
		for (int i = 0; i < a.intValue(); i++) {
			
			for (int j = 0; j < b.intValue(); j++) {
				
				matrix[i][j] = sc.nextInt();
				
			}
			
		}
		
		
		recursion(matrix, 0, 0, 0);
		
		
//		System.out.println(list);
		
		for (Integer l : list) {
			
			System.out.print(l + " ");
			
		}
		
//		System.out.println(list.size());
		
		
	}
	
}
