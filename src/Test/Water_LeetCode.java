package Test;

public class Water_LeetCode {
	
	public static void main(String[] args) {
		
		int data[] = {-1, 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
//		int data[] = {-1, 1, 2, 1, 2, 3, 1, 2};
		
		int sum [] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
//		int sum [] = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int j = 1;
		
		int maxIndex = 8; 	// O (1／2 n) 可以得到...
		
		int max2Index = 9;
		
//		int maxIndex = 5;
		
//		int max2Index = 7;
		
		
		for (int i = 1; i < data.length; i++) {
			
			if (data[j] <= data[i]) {
				
				j = i;
				
				if (i == maxIndex && i + 1 == max2Index) {
					
					j ++;
					
				} 
				
				if (i == maxIndex && i + 1 != max2Index) {
					
					int s = (max2Index - maxIndex - 1) * data[max2Index];
					
					for (int k = i + 1; k < max2Index; k++) {
						
						s -= data[k];
						
					}
					
					sum[i] = s;
					
					i = max2Index;
					
					j = max2Index;
					
				}
				
				
				
			} else {
				
				if (i != data.length - 1) {
					
					if (j != 1) {
					
						sum[j] += data[j] - data[i];
						
					}
					
				}
				
				
			}
			
			
		}
		
		int rs = 0;
			
			for (int i = 0; i < sum.length; i++)
				rs += sum[i];

		
		System.out.println(rs);
		
		
	}

}
