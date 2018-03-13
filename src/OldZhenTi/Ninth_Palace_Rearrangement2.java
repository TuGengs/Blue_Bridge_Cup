package OldZhenTi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;  

/**
 * 
 * T http://lx.lanqiao.cn/problem.page?gpid=T42
 * 
 * @author tugeng
 *
 */ 
public class Ninth_Palace_Rearrangement2 {

	public static char a[][];
	
	public static char b[][];
	
	static class Palace {
		
		public char tu[][]=new char[4][4];
		
		public int step;
		
		public int x;
		
		public int y;

		public Palace(char[][] tu, int step, int x, int y) {
			
			this.tu = tu;
			
			this.step = step;
			
			this.x = x;
			
			this.y = y;
			
		}
		
		public char[][] getTuCopy() {
			
			char a[][]=new char[4][4]; 
			
			 for(int i=1;i<=3;i++)  
		            for(int j=1;j<=3;j++)  
		                a[i][j]=tu[i][j];
			 return a;  
			
		}

		public String getTuString() {  
			 StringBuffer sb=new StringBuffer("");  
			 for(int i=1;i<=3;i++)  
				 for(int j=1;j<=3;j++)  
					 sb.append(tu[i][j]);  
			 return sb.toString();
			 
		 }  
		
	}

	public static Map<String,Integer> mp1 = new HashMap<String,Integer>();
	
	public static Map<String,Integer> mp2 = new HashMap<String,Integer>();
	
	public static int bfs(Queue<Palace> q1, Queue<Palace> q2) {
		
		while(!q1.isEmpty() || !q2.isEmpty()) {
			
			if (!q1.isEmpty()) {
				
				Palace pc1 = q1.poll();
				
//				System.out.println(pc1.getTuString());
				
				if (mp2.containsKey(pc1.getTuString())) { 
					
                    return pc1.step + mp2.get(pc1.getTuString()); 
                    
                }
				
				int x = pc1.x;
				
				int y = pc1.y;
				
//				System.out.println(x + " " + y);
				
				if (x > 1) {
					
					char tmp[][] = pc1.getTuCopy();
					
					tmp[x][y] = tmp[x-1][y];  
					
					tmp[x-1][y]='.';
					
					Palace n = new Palace(tmp, pc1.step + 1, x-1, y);  
					
                    String s = n.getTuString();
					
					if (mp2.containsKey(s)) {
						
						return n.step + mp2.get(s);
						
					}
					
					if (!mp1.containsKey(s)) {
						
//						System.out.println(s);
						
						mp1.put(s, n.step);
						
						q1.add(n);
						
					}
					
				}
				
				if (x < 3) {
					
					char tmp[][] = pc1.getTuCopy();
					
					tmp[x][y] = tmp[x+1][y];  
					
					tmp[x+1][y]='.';
					
					Palace n = new Palace(tmp, pc1.step + 1, x+1, y);  
					
                    String s = n.getTuString();
					
					if (mp2.containsKey(s)) {
						
						return n.step + mp2.get(s);
						
					}
					
					if (!mp1.containsKey(s)) {
						
//						System.out.println(s);
						
						mp1.put(s, n.step);
						
						q1.add(n);
						
					}
					
				}
				
				
				if (y > 1) {
					
					char tmp[][] = pc1.getTuCopy();
					
					tmp[x][y] = tmp[x][y-1];  
					
					tmp[x][y-1]='.';
					
					Palace n = new Palace(tmp, pc1.step + 1, x, y-1);  
					
                    String s = n.getTuString();
					
					if (mp2.containsKey(s)) {
						
						return n.step + mp2.get(s);
						
					}
					
					if (!mp1.containsKey(s)) {
						
//						System.out.println(s);
						
						mp1.put(s, n.step);
						
						q1.add(n);
						
					}
					
				}
				
				if (y < 3) {
					
					char tmp[][] = pc1.getTuCopy();
					
					tmp[x][y] = tmp[x][y + 1];  
					
					tmp[x][y + 1]='.';
					
					Palace n = new Palace(tmp, pc1.step + 1, x, y + 1);  
					
                    String s = n.getTuString();
					
					if (mp2.containsKey(s)) {
						
						return n.step + mp2.get(s);
						
					}
					
					if (!mp1.containsKey(s)) {
						
//						System.out.println(s);
						
						mp1.put(s, n.step);
						
						q1.add(n);
						
					}
					
				}
				
			}
			
			
			if (!q2.isEmpty()) {
				
				Palace pc2 = q2.poll();
				
//				System.out.println(pc2.getTuString());
				
				if (mp1.containsKey(pc2.getTuString())) { 
					
                    return pc2.step + mp1.get(pc2.getTuString()); 
                    
                }
				
				int x = pc2.x;
				
				int y = pc2.y;
				
				if (x > 1) {
					
					char tmp[][] = pc2.getTuCopy();
					
					tmp[x][y] = tmp[x-1][y];  
					
					tmp[x-1][y]='.';
					
					Palace n = new Palace(tmp, pc2.step + 1, x-1, y);  
					
                    String s = n.getTuString();
					
					if (mp1.containsKey(s)) {
						
						return n.step + mp1.get(s);
						
					}
					
					if (!mp2.containsKey(s)) {
						
						mp2.put(s, n.step);
						
						q2.add(n);
						
					}
					
				}
				
				if (x < 3) {
					
					char tmp[][] = pc2.getTuCopy();
					
					tmp[x][y] = tmp[x+1][y];  
					
					tmp[x+1][y]='.';
					
					Palace n = new Palace(tmp, pc2.step + 1, x+1, y);  
					
                    String s = n.getTuString();
					
					if (mp1.containsKey(s)) {
						
						return n.step + mp1.get(s);
						
					}
					
					if (!mp2.containsKey(s)) {
						
						mp2.put(s, n.step);
						
						q2.add(n);
						
					}
					
				}
				
				
				if (y > 1) {
					
					char tmp[][] = pc2.getTuCopy();
					
					tmp[x][y] = tmp[x][y-1];  
					
					tmp[x][y-1]='.';
					
					Palace n = new Palace(tmp, pc2.step + 1, x, y-1);  
					
                    String s = n.getTuString();
					
					if (mp1.containsKey(s)) {
						
						return n.step + mp1.get(s);
						
					}
					
					if (!mp2.containsKey(s)) {
						
						mp2.put(s, n.step);
						
						q2.add(n);
						
					}
					
				}
				
				if (y < 3) {
					
					char tmp[][] = pc2.getTuCopy();
					
					tmp[x][y] = tmp[x][y + 1];  
					
					tmp[x][y + 1]='.';
					
					Palace n = new Palace(tmp, pc2.step + 1, x, y + 1);  
					
                    String s = n.getTuString();
					
					if (mp1.containsKey(s)) {
						
						return n.step + mp1.get(s);
						
					}
					
					if (!mp2.containsKey(s)) {
						
						mp2.put(s, n.step);
						
						q2.add(n);
						
					}
					
				}
				
				
			}
			
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String start = sc.next();
		
		String end = sc.next();
		
		a = new char[4][4];
		
		b = new char[4][4];
		
		int c = 0;
		
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		
		for(int i=1;i<4;i++) {
             
			for(int j=1;j<4;j++) {  
				
				a[i][j] = start.charAt(c);
				
				b[i][j] = end.charAt(c);
				
				if(a[i][j] == '.'){  
                     x1 = i; 
                     y1 = j; 
				}  
				
				if(b[i][j] == '.'){  
                     x2 = i;
                     y2 = j; 
				}  
				
				c++;
				
			}
			
		}
		
		Palace palace1 = new Palace(a, 0, x1, y1);
		
		Palace palace2 = new Palace(b, 0, x2, y2);
		
		Queue<Palace> q1 = new LinkedList<Palace>();
		
		Queue<Palace> q2 = new LinkedList<Palace>();
		
		mp1.put(start, 0);
		
		mp2.put(end, 0);
		
		q1.add(palace1);
		
		q2.add(palace2);
		
		System.out.println(bfs(q1, q2));
		
	}
	
}
