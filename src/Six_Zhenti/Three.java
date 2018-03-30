package Six_Zhenti;

/**
 * 
 * 
 *  祥瑞生辉三羊献瑞气
	2 8 1 7 0 3 6 5
	2 8 1 9 0 3 6 7
	3 7 1 2 0 4 6 9
	3 7 1 9 0 4 5 6
	3 8 2 1 0 4 6 9
	3 8 2 9 0 4 5 7
	5 7 3 1 0 6 4 8
	5 7 3 2 0 6 4 9
	5 8 4 9 0 6 3 7
	6 4 1 5 0 7 3 9
	6 4 1 9 0 7 2 3
	6 5 2 4 0 7 3 9
	6 8 5 1 0 7 3 9
	6 8 5 3 0 7 2 1
	7 3 1 6 0 8 2 9
	7 4 2 9 0 8 1 3
	7 5 3 1 0 8 2 6
	7 5 3 4 0 8 2 9
	7 5 3 9 0 8 1 4
	7 6 4 3 0 8 2 9
	7 6 4 9 0 8 1 5
	8 3 2 4 0 9 1 7
	8 4 3 2 0 9 1 6
	8 5 4 2 0 9 1 7
	9 5 6 7 1 0 8 2
 * 
 * @author tugeng
 *
 */
public class Three {

	public static void main(String[] args) {
		
		for (int A = 0; A <= 9; A++) {
			
			for (int B = 0; B <= 9; B++) {
				
				for (int C = 0; C <= 9; C++) {
					
					for (int D = 0; D <= 9; D++) {
						
						for (int E = 1; E <= 9; E++) {

							for (int F = 0; F <= 9; F++) {
								
								for (int G = 0; G <= 9; G++) {
									
									for (int H = 0; H <= 9; H++) {
										
										if (A == B || A == C || A == D || A == E || A == F || A == G || A == H
												   || B == C || B == D || B == E || B == F || B == G || B == H
												   	 	     || C == D || C == E || C == F || C == G || C == H
												   	 	     		   || D == E || D == F || D == G || D == H
												   	 	     		   			 || E == F || E == G || E == H
												   	 	     		   			 		   || F == G || F == H
												   	 	     		   			 		   			 || G == H) {
											
											continue;
											
										}
										
//										System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + F + " " + G + " " + H);
										
										int X1 = A * 1000 + B * 100 + C * 10 + D;
										
										int X2 = E * 1000 + F * 100 + G * 10+ B;
										
										int X3 = E * 10000 + F * 1000 + C * 100 + B * 10 + H;
										
//										System.out.println(X1 + " " + X2 + " " + X3);
										
										if (X1 + X2 == X3) {
											
											System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + F + " " + G + " " + H);
											
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
	
}
