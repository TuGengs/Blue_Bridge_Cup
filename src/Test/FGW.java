package Test;

public class FGW {
	
	 public static String remain(int[] a)  
	    {
	        String s = "";  
	        for(int i=0; i<a.length; i++){  
	            if(a[i] == 0) s += (char)(i+'A');  
	        }     
	        return s;
	    }

	    public static void f(String s, int[] a)  
	    {	
	        for(int i=0; i<a.length; i++){  
	            if(a[i]==1) continue;  
	            	a[i] = 1;
	            for(int j=i+1; j<a.length; j++){
	                if(a[j]==1) continue;  
	                	a[j]=1;
	                for(int k=j+1; k<a.length; k++) {
	                    if(a[k]==1) continue;
	                    a[k]=1;
	                    System.out.println(s + " " + (char)('D' + i - 3) + (char)('D' + j - 3) + (char)('D' + k - 3) + " " + remain(a));  //填空位置
	                    a[k]=0;
	                }
	                a[j]=0;
	            }
	            a[i] = 0;
	        }  
	    }  

	    public static void main(String[] args)  
	    {
	        int[] a = new int[9];         
	        a[0] = 1;
	        for(int b=1; b<a.length; b++) {
	            a[b] = 1;  
	            for(int c=b+1; c<a.length; c++) {
	                a[c] = 1;  
	                String s = "A" + (char)(b+'A') + (char)(c+'A');
	                f(s,a);
	                a[c] = 0; 
	            }
	            a[b] = 0;  
	        }
	    }

}
