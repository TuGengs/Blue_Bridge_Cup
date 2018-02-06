package basic;

import java.util.Scanner;

/**
 *  
 * 
 * T 他发现，兔子虽然跑比乌龟快，但它们有众所周知的毛病——骄傲且懒惰 于是在与乌龟的比赛中，一旦任一秒结束后兔子发现自己领先t米或以上
 * 它们就会停下来休息s秒。对于不同的兔子，t，s的数值是不同的， 但是所有的乌龟却是一致——它们不到终点决不停止。
 * 
 * 
 * 兔子的速度v1（表示每秒兔子能跑v1 米），乌龟的速度v2，以及兔子对应的t，s值，以及赛道的长度l
 * 请你写一个程序，对于输入的一场比赛的数据v1，v2，t，s，l，预测该场比赛的结果。
 * 
 * 
 * 输入格式 输入只有一行，包含用空格隔开的五个正整数v1，v2，t，s，l，
 * 其中(v1,v2<=100;t<=300;s<=10;l<=10000且为v1,v2的公倍数) 输出格式
 * 输出包含两行，第一行输出比赛结果——一个大写字母“T”或“R”或“D”，分别表示乌龟获胜，兔子获胜，或者两者同时到达终点。
 * 第二行输出一个正整数，表示获胜者（或者双方同时）到达终点所耗费的时间（秒数）。
 * 
 * 
 * 样例输入 10 5 5 2 20 样例输出 D 4 样例输入 10 5 5 1 20 样例输出 R 3 样例输入 10 5 5 3 20 样例输出 T 4
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Tortoise_Rabbit_Race_Predict_Vip2 {

	private static int v1;

	private static int v2;

	private static int t;

	private static int s;

	private static int l;

	/**
	 * 
	 * @param times
	 *            经过的秒数
	 * @param rl
	 *            兔子经过的距离
	 * @param tl
	 *            乌龟经过的距离
	 * @param sLeft
	 *            兔子休息剩余时间
	 */
	public static void run(int times, int rl, int tl, int sLeft) {
		
		if (sLeft == 0) {
			
			if (rl - tl >= t) {
				
				sLeft = s - 1; // 这一秒直接用掉，告诉下一次还剩多少秒
			
			} else {
				
				rl += v1;
			
			}
		} else {
			// 兔子这一秒需要休息
			sLeft--;
		
		}

		tl += v2;
		
		times++; // 这一秒用掉

		if (rl == l && tl == l) {
			
			System.out.println("D");
			
			System.out.println(times);
			
			return;
		}

		if (rl == l && tl != l) {
			
			System.out.println("R");
			
			System.out.println(times);
			
			return;
		}

		if (tl == l && rl != l) {
			
			System.out.println("T");
			
			System.out.println(times);
			
			return;
		}

		run(times, rl, tl, sLeft);
		
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		v1 = sc.nextInt();

		v2 = sc.nextInt();

		t = sc.nextInt();

		s = sc.nextInt();

		l = sc.nextInt();

		sc.close();

		run(0, 0, 0, 0);

	}

}
