package Competition_Course;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * 从n个人中选m个人参加活动，一共有多少种选法？
 * 
 * C(m/n)=C((m-1)/(n-1))+C(m/(n-1))数学算法
 * 
 * 
 * @author tugeng
 *
 */
public class Three_Day_Combination {

	//组合计数
	static int fun(int n, int m) { 
		
        if(m>n)return 0;    
        
        if(m==0)return 1;
        
        return fun(n-1,m-1) + fun(n-1,m);
        
    }
	
	//从字符数组中第begin个字符开始挑选number个字符加入list中  
	static void combine(char []cs, int begin, int number, List<Character> list){  
        
		if(number == 0){  
            System.out.println(list.toString());  
            return ;  
        }
		
        if(begin == cs.length){
            return ;  
        } 
        
        list.add(cs[begin]);  
        
        combine(cs, begin+1, number-1, list);
        
        list.remove((Character)cs[begin]);
        
        combine(cs, begin+1, number, list);
        
    }  
	
	static void combiantion(char chs[]){  
		
        if(chs == null || chs.length == 0){
        	
            return ;  
        }  
        
        List<Character> list = new ArrayList<Character>();  
        
        for(int i=1;i<=chs.length;i++){
        	
            combine(chs,0,i,list);  // Aii
            
        }  
        
        
    }  
	
	public static void main(String[] args) {
		
		System.out.println(fun(10, 5));
		
		char chs[]={'a', 'b', 'c', 'd', 'e', 'f'};  
		 
	    combiantion(chs);
		
	}
	
}
