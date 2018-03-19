package Seven_Zhenti;

import java.util.Scanner;

public class Ball_Game_Nine {
	
	public static void main(String[] args) {  
	    Scanner sc = new Scanner(System.in);  
	    int[] a = new int[5];//堆数
	    int[] b = new int[3];//能取球数
	    for (int i = 0; i < 3; i++) {  
	        b[i] = sc.nextInt();  
	    }  
	    for (int i = 0; i < 5; i++) {
	        a[i] = sc.nextInt();  
	    }  
	    for (int i = 0; i < 3; i++) {//给能取球数从大到小排列  
	        for (int j = 0; j < 3-i-1; j++) {  
	            if(b[j]>b[j+1]){  
	                int t = b[j];  
	                b[j] = b[j+1];  
	                b[j+1] = b[j];  
	            }  
	        }  
	    }  
	    for (int i = 0; i < 5; i++) {
	        int x = 0, y = 0;//x第一个人的总球数，y第二个人的总球数  
	        while(a[i]!=0){
	            if(b[0]>a[i]) break;//剩余的球比可取的最小数还小，则结束  
	            boolean x1 = false,y1 = false;//标记能不能取到奇数，true代表能  
	            for (int j = 2; j >= 0; j--) {  
	                if((x%2==0&&b[j]%2==0)||(x%2!=0&&b[j]%2!=0)){//取得球数和已有球数不能都为奇数，也不能都为偶数  
	                    continue;  
	                }  
	                if(b[j]>a[i]) continue;  
	                x+=b[j];  
	                a[i]-=b[j];  
	                x1 = true;  
	                break;  
	            }  
	            if(!x1){//如果不能保证为奇数   取出一个最大的数  
	                for (int j = 2; j >= 0; j--) {  
	                    if(b[j]>a[i]) continue;  
	                    x+=b[j];  
	                    a[i]-=b[j];  
	                }  
	            }  
	            for (int j = 2; j >= 0; j--) {//第二个人与第一个人取法上，原则相同  
	                if((y%2==0&&b[j]%2==0)||(y%2!=0&&b[j]%2!=0)){  
	                    continue;  
	                }  
	                if(b[j]>a[i]) continue;  
	                y+=b[j];  
	                a[i]-=b[j];  
	                y1 = true;  
	                break;  
	            }  
	            if(!y1){  
	                for (int j = 2; j >= 0; j--) {  
	                    if(b[j]>a[i]) continue;  
	                    y+=b[j];  
	                    a[i]-=b[j];  
	                }  
	            }  
	            
	            
	        }
	        
	        if(y==0){  
	            if(x==0)  
	                System.out.print(0+" ");  
	            else  
	                System.out.print("+"+" ");  
	        }else if(y%2==0&&x%2!=0){  
	            System.out.print("+"+" ");  
	        }else if(y%2!=0&&x%2==0){  
	            System.out.print("-"+" ");  
	        }else if(y%2==0&&x%2==0){  
	            System.out.print(0+" ");  
	        }else{  
	            System.out.print(0+" ");
	        }
	    }
	}  

}
