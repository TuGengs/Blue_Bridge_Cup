package Seven_Zhenti;


public class Square_Fill_Number_Six2 {
	
	public static int ans = 0;
	
	public static int flag[] = new int[10];
	
	public static int Check(int a[][], int x, int y) {
		
		int dx[] = {0, -1, -1, -1};
		
		int dy[] = {-1, -1, 0, 1};
		
		 for(int i = 0; i < 4; i ++)  
			 
	        if( (x + dx[i] >= 0 && x + dx[i] < 3) && (y + dy[i] >= 0 && y + dy[i] < 4) )  
	        {  
	            if( 1 == Math.abs(a[x][y] - a[ x + dx[i] ][ y + dy[i] ]))  
	                return 0;  
	        }  
		  
		 return 1;
		
	}  
	
	public static void dfs(int a[][], int x, int y)  
	{  
	    if(2 == x && 3 == y){
	        ans ++;  
	        return ;  
	    }  
	      
	    for(int num = 0; num <= 9; num ++)  
	    	
	        if(flag[num] == 0){ 
	        	
	            a[x][y] = num;
	            
	            flag[num] = 1;
	              
	            if(Check(a, x, y) == 1){
	            	
	                if(y + 1 < 4)
	                    dfs(a, x, y + 1); 
	                else 
	                    dfs(a, x + 1, 0);
	                
	            }  
	            
	            flag[num] = 0;
	            
	        }
	    
	}  
	
	public static void main(String[] args) {
		
		int a[][] = {{-20, -20, -20, -20}, 
							{-20, -20, -20, -20,},
								{-20, -20, -20, -20,}};  
		
		dfs(a, 0, 1); 
	    
		System.out.println(ans);
		
	}

}
