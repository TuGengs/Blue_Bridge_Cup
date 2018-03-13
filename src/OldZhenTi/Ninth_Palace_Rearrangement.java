package OldZhenTi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;  

/**
 * 
 * T http://lx.lanqiao.cn/problem.page?gpid=T42
 * 
 * @author tugeng
 *
 */

class Palace{
	
    String start;//初始字符串  
    String end;//目标字符串  
    int result=-1;//最终结果  
    
    public Palace(){  
    	
        Scanner sca = new Scanner(System.in);  
        
        start = sca.next();
        
        end = sca.next();
        
//      HashSet<String> query = new HashSet<>(1000000);//hashSet用于快速查找  
        HashMap<String, Integer> memery = new HashMap<String, Integer>(100000);//用于保存之前状态，key代表状态字符串，value代表到key状态所用的最小步数  
        Queue<String> process = new LinkedList<String>();//bfs用到的队列 
        
        memery.put(start,0);//放入初始字符串  
        process.offer(start);//放入初始字符串  
        
        while(result==-1){//当没有搜索到结果是继续搜索
        	
            String cur = process.poll();  
              
            int tmp = 0;  
            while(cur.charAt(tmp)!='.'){  
                tmp++;  
            }  
            int[] d = {-3,3,-1,1};//方向数组，分别表示上下左右  
            for(int i=0;i<4;i++){  
                int p = tmp+d[i];  
                int chengji = tmp*p;  
                if(p > -1 && p < 9 
                		&& chengji != 6 && chengji != 30){//2-->3,3-->2,5-->6,6-->5跨行了，要去掉  
                    String change = cur;  
                    char c = cur.charAt(p);
                    
                    change = cur.replace('.', '*');//交换String中的两个字符，借助中间字符‘*’  
                    change = change.replace(c,'.');  
                    change = change.replace('*',c);  
                    
                    if(change.equals(end)){//找到了目标状态  
                        
                    		result = memery.get(cur)+1;
                        
                    }  
                    
                    if(!memery.containsKey(change)){//如果之前没有这种状态 
                    	
                        memery.put(change,memery.get(cur)+1);  
                        process.add(change);//存入队列  
                        
                    }
                    
                }  
                
            }  
            
        }  
        
        System.out.println(result);  
    }  
    
}
    
public class Ninth_Palace_Rearrangement {
	
	public static void main(String[] args) {
		
		new Palace();
		
	}

}
