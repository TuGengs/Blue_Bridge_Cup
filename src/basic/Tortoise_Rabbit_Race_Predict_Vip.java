package basic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * 
 * T 他发现，兔子虽然跑比乌龟快，但它们有众所周知的毛病——骄傲且懒惰
 * 	 于是在与乌龟的比赛中，一旦任一秒结束后兔子发现自己领先t米或以上
 * 	 它们就会停下来休息s秒。对于不同的兔子，t，s的数值是不同的，
 * 	 但是所有的乌龟却是一致——它们不到终点决不停止。
 * 
 * 
 * 	 兔子的速度v1（表示每秒兔子能跑v1 米），乌龟的速度v2，以及兔子对应的t，s值，以及赛道的长度l
 * 	 请你写一个程序，对于输入的一场比赛的数据v1，v2，t，s，l，预测该场比赛的结果。
 * 
 * 
 * 输入格式
 * 输入只有一行，包含用空格隔开的五个正整数v1，v2，t，s，l，
 * 其中(v1,v2<=100;t<=300;s<=10;l<=10000且为v1,v2的公倍数)
 * 输出格式
 * 输出包含两行，第一行输出比赛结果——一个大写字母“T”或“R”或“D”，分别表示乌龟获胜，兔子获胜，或者两者同时到达终点。
 * 第二行输出一个正整数，表示获胜者（或者双方同时）到达终点所耗费的时间（秒数）。
 * 
 * 
 * 样例输入
 * 10 5 5 2 20
 * 样例输出
 * D
 * 4
 * 样例输入
 * 10 5 5 1 20
 * 样例输出
 * R
 * 3
 * 样例输入
 * 10 5 5 3 20
 * 样例输出
 * T
 * 4
 * 
 * 
 * @author tugeng
 *
 */
public class Tortoise_Rabbit_Race_Predict_Vip {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#");
		
		Scanner sc = new Scanner(System.in);
		
//		while (true) {
		
		Double v1 = sc.nextDouble(); //兔子
		
		Double v2 = sc.nextDouble(); //乌龟
		
		Double t = sc.nextDouble(); //差t米后休息
		
		Double s = sc.nextDouble(); //休息s秒
		
		Double l = sc.nextDouble(); //总距离
		
		double time_to_t = t / (v1 - v2); //第一次差t米的时间
		
		double one_time = time_to_t; //第一名的时间
		
		double xcxc = s * v2 - t;
		
		//1 兔子没休息就到了
		if (l <= v1 * time_to_t) {
			
			System.out.println("R");
			
			System.out.println(df.format(l / v1));
			
		} else {
			
			//2 乌龟在s秒内无法跑相差 (米)
			if (v2 * s <= t) {
				
				System.out.println("R");
				
				double sp = (s * v2) / (v1 - v2); // sp秒后再次停下
				
				double tp = v1 * sp; //再次停下要走多少路程
				
				double lz = l - time_to_t * v1; //第一次停下后的剩余距离
				
				while (lz > 0) {
					
					if ((lz - tp) > 0) {
						
						lz -= tp;
						
						one_time += sp + s;
						
					} else {
						
						if ((lz - tp) == 0) {
							
							System.out.println(df.format(one_time + lz / v1 + s));
							
							break;
							
						} else {
						
							System.out.println(df.format(one_time + (l - lz) / v1 + s));
						
							break;
						
						}
						
					}
					
					
				}
				
				
			}
			
			
			
			//2 乌龟在s秒内跑大于t米
			if (v2 * s > t) {
				
				double sp = (s * v2) / (v1 - v2); // sp秒后再次停下
				
				double tp = v1 * sp; //再次停下要走多少路程
				
				double lz = l - time_to_t * v1; //第一次停下后的剩余距离
				
				while (lz > 0) {
					
					if ((lz - tp) >= 0) {
						
						lz -= tp;
						
						one_time += sp + s;
						
					} else {
						
						double c = xcxc; // 乌龟比兔子多的那一段长度
						
						double x = v2 * s; //相差 + 超过的那段长度
						
						double rts = c / (v1 - v2); //兔子追上乌龟的时间
						
						if (lz - c <= 0) {
							
							System.out.println("T");
							
							System.out.println(df.format(one_time +  (t + lz) / v2));
							
							break;
							
							
						} else {
							
							if (lz - c < rts * v2) {
								
								double cc = lz - c;
								
								System.out.println("T");
								
								System.out.println(df.format(one_time + s + cc / v2));
								
								break;
								
							}
							
							if (lz - c == rts * v2) {
								
								double cc = lz - c;
								
								System.out.println("D");
								
								System.out.println(df.format(one_time + s + cc / v2));
								
								break;
								
							}
							
							if (lz - c > rts * v2) {
								
								System.out.println("R");
								
								System.out.println(df.format(one_time + s + lz / v1));
								
								break;
								
							}
							
							
						}
						
						
						
					}
					
					
				}

				
			}
			
			
		}
		
		
//		}
		
		
		

	}

}
