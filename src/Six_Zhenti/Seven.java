package Six_Zhenti;

import java.util.ArrayList;
import java.util.List;

// 66
public class Seven {
	
	static int a[] = {0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
	
	static int n = 0;
	
	static List<Integer> list = new ArrayList<Integer>();
	
	static void recurrsion(int sum, int step) {
		
		if (step == 12) {
			
			if (sum == 0) {
				n ++;
				System.out.println(list);
			}
			
			return ;
			
		}
		
		for (int i = 1; i < a[step]; i++) {
			
			list.add(i);
			
			recurrsion(sum - i, step + 1);
			
			list.remove(list.size() - 1);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		recurrsion(13, 1);
		
		System.out.println(n);
		
	}

}
