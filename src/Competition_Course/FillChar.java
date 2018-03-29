package Competition_Course;

public class FillChar {
	
	static int f(char [] c) {
		
//		System.out.println(String.valueOf(c));
		
		if(String.valueOf(c).contains("LOL"))
			return -1;
		if(!String.valueOf(c).contains("*"))
			return 0;//出口勿漏
		
		boolean ping=false;//假设无法逼平
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '*') {
				try {
					c[i] = 'L';//进行试探
					if(f(c) == -1)
						return 1;
					else if(f(c) == 0)
						ping=true;
//						return 0;
					
					c[i]='O';
					
					if(f(c) == -1)
						return 1;
					else if(f(c) == 0)
						ping=true;
//						return 0;
				}
				
			finally {
				c[i] = '*';//回溯
			}		
		}
	}
		if(ping) return 0;
		return -1;
   }
	public static void main(String[] args) {
		
		System.out.println(f("***".toCharArray()));
		System.out.println(f("L**L".toCharArray()));		
		System.out.println(f("L**L***L".toCharArray()));	
		System.out.println(f("L*****L".toCharArray()));
	}
	
}







