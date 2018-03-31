package Five_Zhenti;

import java.text.DecimalFormat;

public class Two {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0");
		
		System.out.println(df.format(Math.pow(2, 10) + 1));	// 1025
		
	}
	
}
