package OldZhenTi;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 	m
 * Cn
 * 
 * @author tugeng
 *
 */
public class Formula_Evaluation_Vip {

	public static BigInteger lucas(BigInteger n, BigInteger m, BigInteger p){
		if(m.equals(BigInteger.ZERO)) 
			return BigInteger.ONE;
		
		return BigInteger.valueOf(
				f(n.mod(p).longValue(),m.mod(p).longValue()))
				.multiply(lucas(n.divide(p),m.divide(p),p))
				.mod(p);
		
	}

	public static long f(long n,long m){
		
		if(m>n) return 1;
		
		if(n==m|| m==0) return 1;
		
		if(m>n-m) m=n-m;
		
		long tmpi=1,tmpn=1,s1=1,s2=1,ans=1;
		
		for (int i = 1; i<=m; i++) {
			tmpi=i;
			tmpn=n-i+1;
			s1=s1*tmpi%999101;
			s2=s2*tmpn%999101;
			
		}
		
		ans = s2*pow1(s1,999099)%999101;
	
		return ans%999101;
	
	}
	public static long pow1(long x,long n) {
		
		if(x==1) return 1;
		
		if (n==0)
			return 1;
		
		else {
			while ((n & 1)==0) {
				n>>=1;
				x=(x *x)%999101;
			}
		
		}
		
		long result = x%999101;
		n>>=1;
		while (n!=0) {
			x=(x *x)%999101;;
			if ((n & 1)!=0)
				result =result*x%999101;
			n>>=1;
		}
		return  result;
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger(sc.nextLine());
		BigInteger m = new BigInteger(sc.nextLine());
		int k = Integer.parseInt(sc.nextLine());
//		long start = System.currentTimeMillis();
		BigInteger md = new BigInteger("999101");
		long Cnm=lucas(n, m,md).longValue()%999101;
		long sum = 0;
		if(Cnm!=0){
			int[][] a = new int[k][k];
			int h = 1;
			for (int i = 0; i < k; i++) {
				for (int j = 0; j < k; j++) {
					if (j >= h)
						a[i][j] =0;
					else {
						if (j == 0 || j == h - 1)
							a[i][j] = 1;
						else {
							a[i][j] = (a[i - 1][j - 1]*(h - j)+a[i - 1][j])%999101;
						}
					}
				}
				h++;
			}
			long m1 = 1,n1 =1;
			long x=n.subtract(new BigInteger(k+"")).mod(md.subtract(BigInteger.ONE)).longValue();
			long n3 = pow1(2,x);
			for (int i = k - 1; i >= 0; i--) {
				n1=n3*pow1(2,i)%999101;
				m1 = m1*(n.subtract(new BigInteger((k - 1 - i) + "")).mod(md).longValue())%999101;
				sum = (sum+m1*a[k - 1][i]*n1)%999101;
			}
			sum = sum*Cnm%999101;
		}
		System.out.println(sum);
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		
	}

}

