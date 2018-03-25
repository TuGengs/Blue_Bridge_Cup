package Blue_Bridge_Cup_Fifth_Tournament_Title_Simulation;

public class Two {

	public static boolean is_Prime(int i) {
		
		if (i <= 1) return false;
		
		if (i == 2 || i == 3)	return true;
		
		if (i % 6 != 1 && i % 6 != 5) return false;
		
		double tmp = Math.sqrt(i);
		
		for (double k = 5; k <= tmp; k += 6) {
			
			if (i % k == 0 || i % (k + 2) == 0) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static boolean judge(String str) {
		
		int a[] = new int[8];

		for (int i = 0; i < str.length(); i++) {
			
			int index = str.charAt(i) - '0';
			
			if (index > 7) return false; 
			
			a[index] += 1;
			
			if (a[index] > 1) return false;
			
		}
		
//		if (str.indexOf("0") != str.lastIndexOf("0")) return false;
//		if (str.indexOf("1") != str.lastIndexOf("1")) return false;
//		if (str.indexOf("2") != str.lastIndexOf("2")) return false;
//		if (str.indexOf("3") != str.lastIndexOf("3")) return false;
//		if (str.indexOf("4") != str.lastIndexOf("4")) return false;
//		if (str.indexOf("5") != str.lastIndexOf("5")) return false;
//		if (str.indexOf("6") != str.lastIndexOf("6")) return false;
//		if (str.indexOf("7") != str.lastIndexOf("7")) return false;
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
//		76543210 (8)	16434824 (10)
		
		double start = System.currentTimeMillis();
		
		int sum = 0;
		
		for (int i = 2177399; i <= 16434824; i++) {
			
			String str = Integer.toString(i, 8);
			
			if (judge(str) && is_Prime(Integer.valueOf(str))) {
				
				sum = sum + 1;
				
			}
			
			
		}
		
		double end = System.currentTimeMillis();
		
		System.out.println(sum);	// 6799		2668
		
		System.out.println(end - start);	// 2416.0	1546.0
		
		
	}
	
	
}
