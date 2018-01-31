package Test;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		
		String str = "123Asc";
		
		int i = 789;
		
		int w = i / 100;
		int q = (i % 100) / 10;
		int b = i % 10;
		
		System.out.println(w + " " + q + " " + b);
		
		System.out.println(str.toUpperCase());
		
	}

}
