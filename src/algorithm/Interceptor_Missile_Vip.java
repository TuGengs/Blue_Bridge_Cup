package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * T 某国为了防御敌国的导弹袭击，发展出一种导弹拦截系统。
 * 	 但是这种导弹拦截系统有一个缺陷：
 * 	 虽然它的第一发炮弹能够到达任意的高度，
 * 	 但是以后每一发炮弹都不能高于前一发的高度。
 * 	 某天，雷达捕捉到敌国的导弹来袭。
 * 	 由于该系统还在试用阶段，所以只有一套系统，因此有可能不能拦截所有的导弹。
 * 
 * 
 * 输入格式
 * 一行，为导弹依次飞来的高度
 * 
 * 输出格式
 * 两行，分别是最多能拦截的导弹数与要拦截所有导弹最少要配备的系统数
 * 
 * 样例输入
 * 389 207 155 300 299 170 158 65
 * 样例输出
 * 6
 * 2
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Interceptor_Missile_Vip {
	
	public static List<Integer> l = new ArrayList<Integer>();
	
	public static int dp[][];
	
	public static int max = 0;
	
	public static int find_K(int i) {
		
		int max = l.get(i);
		
		int times = 0;
		
		int index = i;
		
		for (int j = i + 1; j < l.size(); j++) {
			
			if (l.get(j) < max) {
				
				if (dp[j][1] > times) {
				
					times = dp[j][1];
				
					index = j;
					
				}
				
				
			}
			
		}
		
		return index;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		
		for (int i = 0; i < str.length; i++)
			l.add(Integer.valueOf(str[i]));
		
		int time = 0;
		
		while (!l.isEmpty()) {

			dp = new int[l.size()][2];
			
			dp[l.size() - 1][0] = 0;
			
			dp[l.size() - 1][1] = 1;
			
			for (int i = l.size() - 2; i >= 0; i--) {
				
				dp[i][0] = Math.max(dp[i + 1][0], dp[i + 1][1]);
				
//				System.out.println("dp[" + i + "][" + 0 + "]" + "=" + dp[i][0]);
				
				int index = find_K(i);
				
//				System.out.println(index);
				
				dp[i][1] = 1 + dp[index][1];
				
//				System.out.println("dp[" + i + "][" + 1 + "]" + "=" + dp[i][1]);
				
			}
			
			int mp = 0;
			
			time ++;
			
			if (time == 1) {
				
				System.out.println(Math.max(dp[0][0], dp[0][1]));
				
			}
			
			List<Integer> l2 = new ArrayList<Integer>();
			
			int mx = Integer.MAX_VALUE;
			
			for (int i = 0; i < l.size(); i++) {
				
				if (dp[i][1] >= dp[i][0] && l.get(i) < mx) {
					
					mx = l.get(i);
					
				} 
				// 236 865 858 565 545 445 455 656 844 735 638 652 659 714 845
				if (dp[i][1] < dp[i][0] || l.get(i) > mx) {
					
					if (l.get(i) < mx && dp[i][1] < dp[i][0])
						if (i - 1 >= 0 && dp[i][0] == Math.max(dp[i - 1][1], dp[i - 1][0]))
							if (dp[i][1] != Math.min(dp[i - 1][1], dp[i - 1][0]))
								continue;
					
					l2.add(l.get(i));
					
				}

				
			}
			
			l = l2;

			
		}
		
		System.out.println(time);
		
	}

}
