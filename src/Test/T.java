package Test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class T {

	@Test
	public void fun2() {
		
//		int b;
//		
//		int c;
//		
//		b = c = 3;
//		
//		System.out.println(b + " " + c);
		
//		int a = 8;
//		
//		System.out.println(Math.ceil(Math.log(a) / Math.log(2.0)) + 1);
//		
//		int x = (int) Math.pow(
//				2.0, (Math.ceil(Math.log(a) / Math.log(2.0)) + 1));
//		
//		System.out.println(x);
		
		 LinkedHashMap lhm = new LinkedHashMap();
		 
		 lhm.put("Zara", new Double(3434.34));
	     lhm.put("Mahnaz", new Double(123.22));
	     lhm.put("ZaraX", new Double(3435.34));
	     
	     Set set = lhm.entrySet();
	     
	     Iterator i = set.iterator();
	     
	     while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	     
	      System.out.println();
	     
	      
	      
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
	
}
