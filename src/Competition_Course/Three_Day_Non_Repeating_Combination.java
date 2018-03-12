package Competition_Course;

/**
 * 
 * 不重复的全排序，即把重复的元素如AAABBCCCC写到数组中，{3, 2, 4}
 * 
 * 再第i个索引取多少个...就可以保证不重复！
 * 
 * 
 * @author tugeng
 *
 */
public class Three_Day_Non_Repeating_Combination {
	
	public static char r[] = {'A', 'B', 'C'}; 
	
	static void work(int []x) {
		
		String rs = "";
		
		for (int i = 0; i < x.length; i++) {
			
			for (int j = 0; j < x[i]; j++) {
				
				rs = rs + r[i];
				
			}
			
		}
		
		System.out.println(rs);
		
	}
	
	static void fun(int[] data, int[] x, int k, int goal) {
		
		if (k == x.length) {
			
			if (goal == 0) work(x);
			
			return ;
			
		}
		
		for (int i = 0; i <= Math.min(data[k], goal); i++) {
			
			x[k] = i;
			
			fun(data, x, k + 1, goal - i);
			
		}
		
		x[k] = 0; // 回溯
		
	}

	public static void main(String[] args) {
		
		int [] data = {2, 3, 1};
		
		int [] x = new int[data.length];
		
		fun(data, x, 0, 3);
		
	}
	
}
