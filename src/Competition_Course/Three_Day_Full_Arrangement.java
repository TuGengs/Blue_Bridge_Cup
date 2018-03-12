package Competition_Course;

/**
 * 
 * A22 全排列
 * C22 组合问题
 * 
 * 
 * @author tugeng
 *
 */
public class Three_Day_Full_Arrangement {
	
	public static int times = 0;
	
	public static void fun(char[] aa, int k) {
		
		if (k == aa.length - 1) {
			
			System.out.println(String.valueOf(aa));
			
			times ++;
			
			return ;
			
		}
		
		for (int i = k; i < aa.length; i++) {
			
			{char t = aa[k];
			
			aa[k] = aa[i];
			
			aa[i] = t;}
			
			
			fun(aa, k + 1);
			
			
			{char t = aa[k];
			
			aa[k] = aa[i];
			
			aa[i] = t;}
			
			
		}
		
	} 
	
	public static void main(String[] args) {
		
		fun("ABC".toCharArray(), 0);
		
		System.out.println(times);
		
	}

}
