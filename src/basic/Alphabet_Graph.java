package basic;

import java.util.Scanner;

/**
 * 
 * 
 * T 5 7
 * 
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 
 * 
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * BABCDEFGHIJKLMNOPQRSTUVWXY
 * CBABCDEFGHIJKLMNOPQRSTUVWX
 * DCBABCDEFGHIJKLMNOPQRSTUVW
 * 
 * 满26行后，循环...
 * 
 * @author tugengs
 *
 */

public class Alphabet_Graph {
	
	public static String[] alphabets() {
		
		String[] strs = new String[26];
		
		strs[0] = "A";
		strs[1] = "B";
		strs[2] = "C";
		strs[3] = "D";
		strs[4] = "E";
		strs[5] = "F";
		strs[6] = "G";
		strs[7] = "H";
		strs[8] = "I";
		strs[9] = "J";
		strs[10] = "K";
		strs[11] = "L";
		strs[12] = "M";
		strs[13] = "N";
		strs[14] = "O";
		strs[15] = "P";
		strs[16] = "Q";
		strs[17] = "R";
		strs[18] = "S";
		strs[19] = "T";
		strs[20] = "U";
		strs[21] = "V";
		strs[22] = "W";
		strs[23] = "X";
		strs[24] = "Y";
		strs[25] = "Z";
		
		return strs;
		
	}
	
	public static void main(String[] args) {
		
		Integer a;
		
		Integer b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		b = sc.nextInt();
		
		String c[][] = new String[26][26];
		
		String d[] = alphabets();
		
		for(int i = 0; i < b; i++) {
			
			c[0][i] = d[i];
			
		}
		
		int e = 0;
		
		for(int i = 1; i < 26; i++) {
			
			for(int j = i; j < b; j++) {
				
					
				c[i][j] = d[e];
				
				
				e++;
				
			}
			
			e = 0;
			
			for(int k = i-1; k >= 0; k--) {
				
				if(e + 1 < 26) {
					
					c[i][k] = d[e + 1];
					
				}
				
				e++;
				
			}
			
			e = 0;
			
		}
		
		
		int aa = a;
		
		for(int i = 0; i < a && i < aa; i++) {
			
			if (i >= 26) {
				
				i = 0;
				
				aa -= 26;
				
			}
			
			
			for(int j = 0; j < b; j++) {
				
				System.out.print(c[i][j]);
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
