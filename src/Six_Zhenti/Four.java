package Six_Zhenti;

import java.util.ArrayList;
import java.util.List;

// return l.size();

public class Four {
	
	static List<Integer> l = new ArrayList<Integer>();
	
	static int f(int n, int m) {	// 11 13
		
		n = n % m;
		
		while(true) {
			
			l.add(n);
			
			n *= 10;
			
			n = n % m;
			
			if (n == 0) 
				return 0;
			
			if (l.indexOf(n) >= 0) 
//				return l.size();
				return l.size() - l.indexOf(n);
			
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(f(11, 13));
		
	}


}
