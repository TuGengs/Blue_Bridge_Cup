package algorithm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * T 一个旅行家想驾驶汽车以最少的费用从一个城市到另一个城市（假设出发时油箱是空的）。
 *   给定两个城市之间的距离D1、
 *   汽车油箱的容量C（以升为单位）、
 *   每升汽油能行驶的距离D2、出发点每升汽油价格P和沿途油站数N（N可以为零），
 *   油站i离出发点的距离Di、每升汽油价格Pi（i=1，2，……N）。
 *   计算结果四舍五入至小数点后两位。
 *   如果无法到达目的地，则输出“No Solution”。
 * 
 * 
 * 输入格式
 * 第一行为4个实数D1、C、D2、P与一个非负整数N；
 * 接下来N行，每行两个实数Di、Pi。
 * 
 * 输出格式
 * 如果可以到达目的地，输出一个实数（四舍五入至小数点后两位），
 * 表示最小费用；否则输出“No Solution”（不含引号）。
 * 
 * 样例输入
 *  km    l   km/l  y/l N
 * 275.6 11.9 27.4 2.8 2
 * 
 *  距km y/l 
 * 102.0 2.9
 * 220.0 2.2
 * 
 * 样例输出
 * 26.95
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class A_Travelers_Budget_Vip {
	
	static class Node {
		
		public double distance;
		
		public double price;
		
		public Node(double distance, double price) {
			
			this.distance = distance;
			
			this.price = price;
			
		}
		
	}
	
	public static List<Node> list = new ArrayList<Node>();
	
	public static double cost = 0.0;

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		Scanner sc = new Scanner(System.in);
		
		// D1、C、D2、P、N
		Double D1 = sc.nextDouble();	//km
		
		Double C = sc.nextDouble();	//l
		
		Double D2 = sc.nextDouble();	//km/l
		
		Double P = sc.nextDouble();	//y/l
		
		Double N = sc.nextDouble();	//N
		
		list.add(new Node(0, P));
		
		for (int i = 0; i < N; i++) {
			
			list.add(new Node(sc.nextDouble(), sc.nextDouble()));
			
		}
		
		list.add(new Node(D1, 0));
		
		for (int i = 1; i <= N + 1; i++) {
			
			if (D2 * C < list.get(i).distance - list.get(i - 1).distance) {
				
				System.out.println("No Solution");
				
				return ;
				
			}
			
		}
		
		
		for (int i = 0; i <= N; i++) {
			
			int j = i + 1;
			
			double min = list.get(j).price;
			
			int index = -1;
			
			while (j <= N + 1 && list.get(j).distance - list.get(i).distance <= D2 * C) {
				
				if (list.get(j).price < list.get(i).price) {
					
					cost += ((list.get(j).distance - list.get(i).distance) / D2) 
							* list.get(i).price;
					
//					cost = ((int)(cost * 100)) / 100.0;
					
					i = j - 1;
					
					break;
					
				}
				
				if (list.get(j).price < min) {
					
					min = list.get(j).price;
					
					index = j;
					
				}
				
				j++;
				
			}
			
			if (j <= N + 1 && list.get(j).distance - list.get(i).distance > D2 * C) {
				
				cost += ((list.get(index).distance - list.get(i).distance) / D2) 
						* list.get(i).price;
				
//				cost = ((int)(cost * 100)) / 100.0;
				
				i = index - 1;
				
			}
			
			
		}
		
		System.out.println(df.format(cost));
		
	}
	
}





