package Eighth_Zhenti;

import java.util.ArrayList;
import java.util.List;

public class The_Arithmetic_Of_Prime_Numbers_CPlusPlus_Two {
	
	public static List<Integer> list = new ArrayList<Integer>();
	
	public static boolean is_prime(Integer a) {
		
		if(a.intValue() ==2 || a.intValue()==3) {
			
			return true;
			
		}  
		
		//bug所在，不加的话，会判断1为true
		if (a.intValue() == 1) {
			
			return false;
			
		}
		
        //不在6的倍数两侧的一定不是质数
        if(a.intValue() % 6 != 1 && a.intValue() % 6 != 5) {
        	
        		return false;
        	
        }  

        //在6的倍数两侧的也可能不是质数
        double tmp = Math.sqrt(a.intValue());
        
        for(double i = 5; i <= tmp; i += 6 ) {
        	
	        	if(a.intValue() % i== 0 || a.intValue() % (i + 2) == 0) {
	        		
	        		 return false;  
	        		
	        	}

        	
        }
        
        return true;
        
		
	}
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 100000; i++) {
			
			if (is_prime(i)) {
				
//				System.out.println(i);
				
				list.add(i);
				
			}
			
		}
		
		boolean flag = true;
		
		int d = 1;
		
		while (flag) {
		
		for (int i = 0; i < list.size() - 9; i++) {
			
			if (list.contains(list.get(i) + d) 
					&& list.contains(list.get(i) + d + d)
					&& list.contains(list.get(i) + d + d + d)
					&& list.contains(list.get(i) + d + d + d + d)
					&& list.contains(list.get(i) + d + d + d + d + d)
					&& list.contains(list.get(i) + d + d + d + d + d + d)
					&& list.contains(list.get(i) + d + d + d + d + d + d + d)
					&& list.contains(list.get(i) + d + d + d + d + d + d + d + d)
					&& list.contains(list.get(i) + d + d + d + d + d + d + d + d + d)) {
				
					System.out.println(d);
					
					flag = false;
				
				}
			
			}
		
			d++;
		
		}
		
	}

}
