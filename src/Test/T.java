package Test;

import org.junit.Test;

public class T {

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
