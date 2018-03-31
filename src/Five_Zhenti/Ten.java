package Five_Zhenti;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Ten {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
           Scanner cin = new Scanner(System.in); 
           String s1 = cin.next();
           String s2 = cin.next();
           BigInteger ans1 = BigSqrt(s1);
           BigInteger ans2 = BigSqrt(s2);
           //System.out.println(ans1+" "+ans2);
           BigInteger ans = ans1.multiply(ans2);
           System.out.println(ans);
    }

    private static BigInteger BigSqrt(String s) {        
        int mlen = s.length();    //被开方数的长度
        int len;    //开方后的长度
        BigInteger beSqrtNum = new BigInteger(s);//被开方数
        BigInteger sqrtOfNum;    //存储开方后的数
        BigInteger sqrtOfNumMul;    //开方数的平方
        String sString;//存储sArray转化后的字符串
        if(mlen%2 == 0)    len = mlen/2;
        else    len = mlen/2+1;
        char[] sArray = new char[len];
        Arrays.fill(sArray, '0');//开方数初始化为0
        for(int pos=0; pos<len; pos++){
            //从最高开始遍历数组，每一位都转化为开方数平方后刚好不大于被开方数的程度
            for(char num='1'; num<='9'; num++){
                sArray[pos] = num;
                sString = String.valueOf(sArray);
                sqrtOfNum = new BigInteger(sString);
                sqrtOfNumMul = sqrtOfNum.multiply(sqrtOfNum);
                
                if(sqrtOfNumMul.compareTo(beSqrtNum) == 1){
                    sArray[pos]-=1;
                    break;
                }    
            }
        }
        return new BigInteger(String.valueOf(sArray));
    }
}