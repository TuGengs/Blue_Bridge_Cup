package Seven_Zhenti;

public class A2{					
public static void f(int[] a, int k, int n, String s) // a 0 5 ""
{
    if(k==a.length){ 
        if(n == 0) System.out.println(s);
        return;
    }

    String s2 = s;
    
    for(int i = 0; i <= a[k]; i++){
    		f(a,k+1,5-s2.length(),s2); //填空位置s
        s2 += (char)(k+'A');
    }
}

	public static void main(String[] args)
	{
	    int[] a = {4,2,2,1,1,3};
	
	    f(a,0,5,"");
	    
	}
	
}
