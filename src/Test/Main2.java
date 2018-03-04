package Test;

import java.util.Scanner;
public class Main2 {
	
    static int n;
    static int result=0;
    static void getresult(int len){
        if(len==n)
            {result++;
            return ;}
        if(len>n)
            return;
        if(len+1<=n)
             getresult(len+1);
        if(len+2<=n)
             getresult(len+2);
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int len=0;
        getresult(len);
        System.out.println(result);
        
        
    }

}