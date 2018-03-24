package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class T {
	
	public String fun33(String str) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("123", 123);
		
		return String.valueOf(map.get(str));
		
	}
	
	public static boolean is_prime(long a) {
		
		if(a ==2 || a==3) {
			
			return true;
			
		}  
		
		//bug所在，不加的话，会判断1为true
		if (a == 1) {
			
			return false;
			
		}
		
        //不在6的倍数两侧的一定不是质数  
        if(a % 6!= 1 && a % 6!= 5) {
        	
        	return false;
        	
        }  

        //在6的倍数两侧的也可能不是质数  
        double tmp = Math.sqrt(a);  
        
        for(double i = 5; i <= tmp; i+=6 ) {
        	
        	if(a % i== 0 || a % (i+ 2) == 0) {
        		
        		 return false;  
        		
        	}

        	
        }
        
        return true;
        
		
	}
	
	@Test
	public void fun3() {
		
//		System.out.println(is_prime(987654321));
		
		Object o = null;
		
		System.out.println(String.valueOf(o));
		
//		System.out.println(fun33("121"));
		
		int a[] = {1,2};
		
		int b[] = {1,2,3};
		
		int c[] = {1,2};
		
		Map<int[], Integer> map = new HashMap<int[], Integer>();
		
		map.put(a, 1);
		
		map.put(b, 2);
		
//		System.out.println(map.get(c));
		
	}

	@Test
	public void fun2() throws Exception {
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String strs[] = bf.readLine().split(" ");
		
		for (int i = 0; i < strs.length; i++)
			System.out.println(strs[i]);
		
	      
	}
	
	@Test
	public void fun() {
		
		int c[] = {-1,5,11,7,2,3,17};
		
		
		for(int i=(c.length - 1)/2;i>=1;i--) {
		
			CreateHeap(c, i, c.length - 1);
		
		}
		
	}
	
	void CreateHeap(int a[], int i, int size) {
	    
			int lchild=2*i;       //i的左孩子节点序号 
		    int rchild=2*i+1;     //i的右孩子节点序号 
		    int max=i;            //临时变量 
		    if(i<=size/2)          //如果i不是叶节点就不用进行调整 
		    {
		        if(lchild<=size&&a[lchild]>a[max])
		        {
		            max=lchild;
		        }    
		        if(rchild<=size&&a[rchild]>a[max])
		        {
		            max=rchild;
		        }
		        if(max!=i)
		        { 
	        	    int tmp = a[i];   
	        	    a[i] = a[max];
	        	    a[max] = tmp; 

//		            CreateHeap(a,max,size);    //避免调整之后以max为父节点的子树不是堆 
		        }
		    }        
		    
		    
		    for (int p = 1; p <= size; p++) {
		    	
		    	System.out.print(a[p] + " ");
		    	
		    }
		    
		    System.out.println(i);
	    
	}
	
	@Test
	public void funx() {
		
		
		
	}
	
}
