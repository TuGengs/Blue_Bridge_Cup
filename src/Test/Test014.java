package Test;

import java.util.Scanner;

public class Test014 {  
      
    private static int v1;  
    private static int v2;  
    private static int t;  
    private static int s;  
    private static int l;  
      
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        v1 = sc.nextInt();  
        v2 = sc.nextInt();  
        t = sc.nextInt();  
        s = sc.nextInt();  
        l = sc.nextInt();  
        sc.close();  
          
        run(0, 0, 0, 0);  
    }  
      
    /** 
     *  
     * @param times 经过的秒数 
     * @param rl 兔子经过的距离 
     * @param tl 乌龟经过的距离 
     * @param sLeft 兔子休息剩余时间 
     */  
    public static void run(int times, int rl, int tl, int sLeft){  
        if(sLeft == 0){  
            if(rl - tl >= t){  
                sLeft = s-1; //这一秒直接用掉，告诉下一次还剩多少秒  
            }else{  
                rl += v1;  
            }  
        }else{  
            //兔子这一秒需要休息  
            sLeft--;  
        }  
          
        tl += v2;  
        times++; //这一秒用掉  
          
        if(rl == l && tl == l){  
            System.out.println("D");  
            System.out.println(times);  
            return;  
        }  
          
        if(rl == l && tl != l){  
            System.out.println("R");  
            System.out.println(times);  
            return;  
        }  
          
        if(tl == l&& rl != l){  
            System.out.println("T");  
            System.out.println(times);  
            return;  
        }  
          
        run(times, rl, tl, sLeft);  
    }
    
}
  