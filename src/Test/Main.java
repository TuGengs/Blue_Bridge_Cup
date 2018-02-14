package Test;
import java.util.Scanner;  

public class Main  
{  

    final static int MOD = 1000000007;  

    public static void main(String[] args)  
    {  
        Scanner input = new Scanner(System.in);  

        while (input.hasNext())  
        {  
            int k = input.nextInt();  
            int l = input.nextInt();  
            int num = 0;  
            int[][] nums = new int[l][k];  
            for (int i = 0; i < l; i++)  
                for (int j = 0; j < k; j++)  
                    nums[i][j] = 0;  
            for (int j = 0; j < k; j++)  
                nums[0][j] = 1;  
            for (int i = 1; i < l; i++)  
                for (int j = 0; j < k; j++)  
                    for (int x = 0; x < k; x++)  
                    {  
                        if (x != j - 1 && x != j + 1)  
                        {  
                            nums[i][j] += nums[i - 1][x];  
                            nums[i][j] %= MOD;  
                        }  
                    }  
            
            for (int i = 0; i < l; i++) {  
                
            	for (int j = 0; j < k; j++) {
              
            		System.out.print(nums[i][j] + " ");
                
                }
            	
            	System.out.println();
                
            }
                	
            
            
//            for (int j = 1; j < k; j++)  
//            {  
//                num += nums[l - 1][j];  
//                num %= MOD;  
//            	
////            	System.out.println(nums[l - 1][j]);
//            	
//            }  
//            System.out.println(num);  
        }  

    }  
}  