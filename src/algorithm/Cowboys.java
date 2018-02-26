package algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 
 * T 例如，牛仔环“ABBBABBBA”在一秒后会变成“BABBBABBA”；
 * 	 而牛仔环“BABBA”会变成“ABABB”。 
 * 	 这幅图说明了“BABBA”怎么变成“ABABB” 一秒过去了，
 * 	 现在用字符串s来表示牛仔们的排列。你的任务是求出一秒前有多少种可能的排列。
 * 	 如果某个排列中一个牛仔指向顺时针，
 * 	 而在另一个排列中他指向逆时针，那么这两个排列就是不同的。
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Cowboys {
	
	public static int N = 105;
	
	public static int dp[][];
	
	public static String str;
	
	public static void main(String[] args) {
		
		 dp = new int[N][2];
		 
		 str = new Scanner(System.in).next();
		 
		 char[] s = str.toCharArray(); 
		 
		 int flag = 0;
		 
		 int len = s.length;
		 
		 for(int i = 1; i < len; i++){
			 
		      if(s[i]!=s[0]){  
		    	  
		         flag = 1;  
		         
		         break;  
		         
		      }  
		      
		   }  
		 
		 if(flag == 0){               //如果都为 ‘A’或 ‘B’  
		      
			 System.out.println(1);
			 
			 return;
		 
		 }  
		 
		 int cot = -1;  
		 
		 for(int i = 0; i < len; i++){      //找到 ‘BA’
			 
			 if(s[ (i+1) % len] == s[i] - 1){  
				 
				 cot = i; 
				 break;  
				 
			 }  
			 
		 }  
		 
		 
		 int st = (cot + 2) % len;  
		 
		 int ed = (cot - 1 + len) % len;  
		 
		 dp[st][0] = 1;  
		 
		 dp[st][1] = 0;
		 
		 while(st != ed) {
			 
			 st = (st + 1) % len;  
			 
		     if(s[st] == s[(st-1 + len) % len]) {  
		         dp[st][0] = dp[ (st-1+len) %len][0] + dp[(st-1+len) %len][1];  
		         dp[st][1] = 0;
		      }else if(s[st] == s[(st-1+len) %len] + 1){  
		    	  	 dp[st][0] = dp[(st-1+len) %len][1];  
		    	  	 dp[st][1] = 0;  
		      }else{  
		    	  	 dp[st][0] = dp[(st-1+len) %len][0] + dp[(st-1+len) %len][1];  
		    	  	 dp[st][1] = dp[(st-2+len) %len][0] + dp[(st-2+len) %len][1];  
		       if(dp[st][1] == 0) 
		    	   	 dp[st][1] = 1;  
		      }  
		     
		 }  
		 
		 int sum = dp[st][0] + dp[st][1];  
		 
		 if(s[(cot + 2) % len]=='B' && s[(cot + 3) % len]=='B') { 
			 
			 System.out.println(sum); //如果是 BABB 
			 return;                  
		     
		 }  
		 if(s[(cot - 1 + len) % len]=='A' && s[(cot -2 + len) % len]=='A') {  
			 
			 System.out.println(sum);                 // 如果是 AABA  
			 return;
			 
		 }  
		 
		 
		 int length = 2;  
		 st = (cot + 2) % len;  
		 ed = (cot - 1 + len) % len;  
		 
		 if(s[(cot + 2) % len]=='B' && s[(cot + 3) % len]=='A') {  
		      st = (st + 2) % len;  
		      length += 2;  
		 } 
		 
		 if(s[(cot - 1 + len) % len]=='A' && s[(cot -2 + len) % len]=='B'){  
		      ed =(ed - 2 + len) % len;  
		      length += 2;  
		 }
		 
		 if(length>=len){              //如果 是 BABA 或者 BABABA   
		      System.out.println(sum + 1);
		      return;
		 }  
		 
		 for (int f = 0; f < dp.length; f++) {
			 Arrays.fill(dp[f], 0);
		 }
		 
		 dp[st][0] = 1;  
		 dp[st][1] = 0;  
		 while(st != ed){  
			 st = (st+1) % len;
			 if(s[st] == s[(st-1+len) %len]) {  
				 dp[st][0] = dp[ (st-1 + len) %len][0] + dp[(st-1+len) %len][1];  
				 dp[st][1] = 0;
	      }else if(s[st] == s[(st-1+len) %len] + 1) {  
	    	  		 dp[st][0] = dp[(st-1 + len) %len][1];  
	    	  		 dp[st][1] = 0;
	      }else{  
	    	    		 dp[st][0] = dp[(st-1+len) %len][0] + dp[(st-1+len) %len][1];  
	    	    		 dp[st][1] = dp[(st-2+len) %len][0] + dp[(st-2+len) %len][1];  
	    	    		 if(dp[st][1] == 0) 
	    	    			 dp[st][1] = 1;
	      }

	   }
		   sum += dp[st][0] + dp[st][1];
		  
		   System.out.println(sum);
		 
		
	}

}











