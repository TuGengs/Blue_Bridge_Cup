package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class T {
	
	@Test
	public void fun3() {
		
		System.out.println((int)(55.32134 * 100));
		
		System.out.println(((int)(55.32134 * 100)) / 100.0);
		
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
	
}
