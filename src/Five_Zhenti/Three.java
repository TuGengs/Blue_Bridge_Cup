package Five_Zhenti;

// q
public class Three {

	static String getString(String str) {
		
		StringBuffer bf = new StringBuffer();
		
		for (int i = 0; i < 106; i++) {
			
			bf.append(str);
			
		}
		
		return bf.toString();
		
	}
	
	static void delet(String str) {
		
//		System.out.println(str.length());
		
		if (str.length() == 1) {
			
			System.out.println(str);
			
			return ;
			
		}
		
		char a[] = str.toCharArray();
		
		for (int i = 0; i < a.length; i += 2) {
			
			a[i] = 'Z';
			
		}
		
		String str2 = "";
		
		for (int i = 0; i < a.length; i ++) {
			
			if (a[i] != 'Z')
				
				str2 = str2 + a[i];
			
		}
		
		delet(str2);
		
	}
	
	public static void main(String[] args) {
		
		String str = "abcdefghijklmnopqrs";
		
		str = getString(str);
		
		delet(str);
		
	}
	
}
