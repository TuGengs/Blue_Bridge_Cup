package algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * T 每年冬天，北大未名湖上都是滑冰的好地方。北大体育组准备了许多冰鞋，
 * 	 可是人太多了，每天下午收工后，常常一双冰鞋都不剩。
 * 	 每天早上，租鞋窗口都会排起长龙，假设有还鞋的m个，有需要租鞋的n个。
 *   现在的问题是，这些人有多少种排法，可以避免出现体育组没有冰鞋可租的尴尬场面。
 *  （两个同样需求的人（比如都是租鞋或都是还鞋）交换位置是同一种排法）
 *  
 * 输入格式
 * 两个整数，表示m和n
 * 
 * 输出格式
 * 一个整数，表示队伍的排法的方案数。
 * 
 * 样例输入
 * 3 2
 * 样例输出
 * 5
 * 
 * 数据规模和约定
 * m,n∈［0,18］
 * 问题分析
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class WeiMingHu2 {
	
	public static int dp[][];
	
	public static int maxn = 20;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		Integer b = sc.nextInt();
		
		dp = new int[maxn][maxn];
		
		for(int i=1;i<maxn;++i) {
			
			dp[i][0]=1;  
			
			for(int j=1;j<=i;++j) {
				
				dp[i][j]=dp[i-1][j]+dp[i][j-1];  
			
			}  
		
		}  
		
		
		System.out.println(dp[a][b]);
		
		
	}

}


















