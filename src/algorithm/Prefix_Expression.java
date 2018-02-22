package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 
 * 
 * T 前缀表达式
 * 
 * 
 * 样例输入
 * + 5 2
 * 
 * 样例输出
 * 7
 * 
 * 
 * 
 * @author tugeng
 *
 */
public class Prefix_Expression {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String strs[] = bf.readLine().split(" ");
		
		Stack<Integer> sk = new Stack<Integer>();
		
		for (int i = strs.length - 1; i >= 0; i--) {
			
			try {
				
				if (Integer.valueOf(strs[i]) >= 0 && Integer.valueOf(strs[i]) <= 10) {
					
					sk.push(Integer.valueOf(String.valueOf(strs[i])));
					
				} else {
					
					return;
					
				}
				
			} catch (Exception e) {
				
				if (!("+".equals(strs[i]) 
						|| "-".equals(strs[i]) 
						|| "*".equals(strs[i]) 
						|| "/".equals(strs[i]))) {
					
					return;
					
				}
				
				int l = sk.pop();
				
				int r = sk.pop();
				
				int rs = 0;
				
				if ("+".equals(strs[i])) {
					
					rs = l + r;
					
				} 
				
				else if ("-".equals(strs[i])) {
					
					rs = l - r;
					
				} 
				
				else if ("*".equals(strs[i])) {
					
					rs = l * r;
					
				}
				
				else if ("/".equals(strs[i])) {
					
					rs = l / r;
					
				} 
				
				sk.push(rs);
				
			}
			

			
		}
			
		
			System.out.println(sk.pop());
			
		
	}

}
