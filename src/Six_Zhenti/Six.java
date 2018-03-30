package Six_Zhenti;

import java.util.ArrayList;
import java.util.List;

// 2 ... 16
public class Six {

	static List<Integer> list = new ArrayList<Integer>();
	
	static void recursion(int x, int a, int index) {
		
		if (index <= 0) return ;
		
		if (x - a > 790) return ;
		
		if (x - a == 790) System.out.println(list);
		
		
		list.add(index);
		
		recursion(x + index * (index - 1), (a + 2 * index - 1), index - 2);
		
		list.remove(list.size() - 1);
		
		recursion(x, a, index - 1);
		
	}
	
	public static void main(String[] args) {
		
		recursion(0, 0, 49);
		
	}
	
}
