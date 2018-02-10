package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 
 * T 求出区间[a,b]中所有整数的质因数分解。
 * 
 * 输入格式
 * 输入两个整数a，b。
 * 
 * 输出格式
 * 每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
 * 
 * 样例输入
 * 3 10
 * 
 * 样例输出
 * 3=3
 * 4=2*2
 * 5=5
 * 6=2*3
 * 7=7
 * 8=2*2*2
 * 9=3*3
 * 10=2*5
 * 
 * 提示
 * 先筛出所有素数，然后再分解。
 * 数据规模和约定
 * 2<=a<=b<=10000
 * 
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Resolve_Prime_Numbers_Vip {
	
	public static boolean is_prime(Integer a) {
		
		if(a.intValue() ==2 || a.intValue()==3) {
			
			return true;
			
		}  
		
		//bug所在，不加的话，会判断1为true
		if (a.intValue() == 1) {
			
			return false;
			
		}
		
        //不在6的倍数两侧的一定不是质数  
        if(a.intValue() % 6!= 1 && a.intValue() % 6!= 5) {
        	
        	return false;
        	
        }  

        //在6的倍数两侧的也可能不是质数  
        double tmp = Math.sqrt(a.intValue());  
        
        for(double i = 5; i <= tmp; i+=6 ) {
        	
        	if(a.intValue() % i== 0 || a.intValue() % (i+ 2) == 0) {
        		
        		 return false;  
        		
        	}

        	
        }
        
        return true;
        
		
	}
	
	public static List<Integer> abprime(Integer a, Integer b) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		for (int i = 2; i <= b; i++) {
			
			if (is_prime(i)) {
				
				l.add(i);
				
			}
			
		}
		
		return l;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		
		Integer b = sc.nextInt();
		
		sc.close();
		
		List<Integer> prime = abprime(a, b);
		
		for (int i = a; i <= b; i++) {
			
			String rs = i + "=";
			
			int ii = i;
			
			for (int j = 0; j < prime.size(); j++) {
				
				while (ii % prime.get(j) == 0) {
					
					rs = rs + prime.get(j) + "*";
					
					ii = ii / prime.get(j);
					
				}
				
				if (is_prime(ii)) {
					
					rs = rs + ii;
					
					break;
					
				}
				
				
			}
			
			if ("*".equals(rs.substring(rs.length()-1, rs.length()))) {
				
				rs = rs.substring(0, rs.length()-1);
				
			}
			
			System.out.println(rs);
			
			
		}
		
		
		
	}
	
	
}





















