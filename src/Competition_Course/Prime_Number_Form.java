package Competition_Course;

import java.util.ArrayList;
import java.util.List;

// 1000 以内素数筛选法
public class Prime_Number_Form {

	static boolean[] is_Primes; 
	
	static List<Integer> list = new ArrayList<Integer>();
	
	static void get_all_prime(int n) {
		
		is_Primes = new boolean[n + 1];
		
		for (int i = 2; i <= n; i++) {
			
			if (!is_Primes[i]) {
				
				list.add(i);
				
			}
			
			int size = list.size();
			
			for (int j = 0; j < size && list.get(j) * i <= n; j++) {
				
				is_Primes[list.get(j) * i] = true;
				
				if(i % list.get(j) == 0)
					break;
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		get_all_prime(10000000);
		
		System.out.println(list.size());	// 664579	664579
	
	}
	
}
