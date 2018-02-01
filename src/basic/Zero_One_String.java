package basic;

/**
 * 
 * 
 * T 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 * 
 * 00000
 * 00001
 * 00010
 * 00011
 * 00100
 * 
 * 请按从小到大的顺序输出这32种01串。
 * 
 * @author tugeng
 *
 */
public class Zero_One_String {
	
public static int a[][] = new int[32][5];


public static int[] index_String(int n) {
	
	int m[] = new int[5];
	
	for (int i = 0; i < 5; i++) {
		
		m[i] = a[n][i];
		
	}
	
	return m;
	
} 
	
public static void is_Zero_One_String(int b[], int ns) {
		
		int index = b.length - 1;
		
		b[index] += 1;
		
		
		for (int i = index; i >= 0; i--) {
			
			
			if (b[i] >= 2) {
				
				b[i] = 0;
				
				b[i - 1] += 1;
				
			}
			
		}
		
		for (int p = 0; p <= index; p++) {
			
			a[ns][p] = b[p];
			
		}
		
	}

	
	public static void main(String[] args) {
		
		for (int i = 1; i < 32; i++) {
			
			int c[] = index_String(i-1);
			
			is_Zero_One_String(c, i);
			
		}
		
		
		for (int i = 0; i < 32; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				System.out.print(a[i][j]);
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
