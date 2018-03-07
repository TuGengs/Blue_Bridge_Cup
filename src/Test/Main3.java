package Test;

public class Main3 {

    static int[] first = new int[9];
    static int[] s = new int[9];
    static int sum = 0;

    public static void main(String[] args) {
    	
    		for (int i1 = 1; i1 < 10; i1++) {
    			for (int i2 = 1; i2 < 10; i2++) {
    				for (int i3 = 1; i3 < 10; i3++) {
    					for (int i4 = 1; i4 < 10; i4++) {
    						for (int i5 = 1; i5 < 10; i5++) {
    							for (int i6 = 1; i6 < 10; i6++) {
    								for (int i7 = 1; i7 < 10; i7++) {
    									for (int i8 = 1; i8 < 10; i8++) {
    										for (int i9 = 1; i9 < 10; i9++) {
    											
    												if (i1 != i2 
    													&& i1 != i3 
    													&& i1 != i4
    													&& i1 != i5
    													&& i1 != i6
    													&& i1 != i7
    													&& i1 != i8
    													&& i1 != i9
    													&& i2 != i1
    													&& i2 != i3
    													&& i2 != i4
    													&& i2 != i5
    													&& i2 != i6
    													&& i2 != i7
    													&& i2 != i8
    													&& i2 != i9
    													&& i3 != i1
    													&& i3 != i2
    													&& i3 != i4
    													&& i3 != i5
    													&& i3 != i6
    													&& i3 != i7
    													&& i3 != i8
    													&& i3 != i9
    													&& i4 != i1
    													&& i4 != i2
    													&& i4 != i3
    													&& i4 != i5
    													&& i4 != i6
    													&& i4 != i7
    													&& i4 != i8
    													&& i4 != i9
    													&& i5 != i1
    													&& i5 != i2
    													&& i5 != i3
    													&& i5 != i4
    													&& i5 != i6
    													&& i5 != i7
    													&& i5 != i8
    													&& i5 != i9
    													&& i6 != i1
    													&& i6 != i2
    													&& i6 != i3
    													&& i6 != i4
    													&& i6 != i5
    													&& i6 != i7
    													&& i6 != i8
    													&& i6 != i9
    													&& i7 != i1
    													&& i7 != i2
    													&& i7 != i3
    													&& i7 != i4
    													&& i7 != i5
    													&& i7 != i6
    													&& i7 != i8
    													&& i7 != i9
    													&& i8 != i1
    													&& i8 != i2
    													&& i8 != i3
    													&& i8 != i4
    													&& i8 != i5
    													&& i8 != i6
    													&& i8 != i7
    													&& i8 != i9
    													&& i9 != i1
    													&& i9 != i2
    													&& i9 != i3
    													&& i9 != i4
    													&& i9 != i5
    													&& i9 != i6
    													&& i9 != i7
    													&& i9 != i8
    													
    													) {
    											
	    											s[0] = i1;
	    											s[1] = i2;
	    											s[2] = i3;
	    											s[3] = i4;
	    											s[4] = i5;
	    											s[5] = i6;
	    											s[6] = i7;
	    											s[7] = i8;
	    											s[8] = i9;
	    											
	    											seek(9);
    											
    											}
    											
    										}
    									}
    								}
    							}
    						}
    					}
    				}
    			}
    		}
    											
        System.out.println(sum / 6);
    }

    public static void seek(int code) {
    	
//    		System.out.println(code);
    		
        if (code == 9) {
            if (s[0] + s[1] + s[3] + s[5] == s[0] + s[2] + s[4] + s[8]
                    && s[0] + s[1] + s[3] + s[5] == s[5] + s[6] + s[7] + s[8])
                sum++;
            return;
        }

    }
}