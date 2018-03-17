package Seven_Zhenti;

public class Put_Together_A_Formula_Three {
	
	public static void main(String[] args) {
		
		double count = 0;
		
		for (double A = 1; A < 10; A++) {
			
			for (double B = 1; B < 10; B++) {
				
				for (double C = 1; C < 10; C++) {
					
					for (double D = 1; D < 10; D++) {
						
						for (double E = 1; E < 10; E++) {
							
							for (double F = 1; F < 10; F++) {
								
								for (double G = 1; G < 10; G++) {
									
									for (double H = 1; H < 10; H++) {
										
										for (double I = 1; I < 10; I++) {
											
											if (A == B || A == C || A == D || A == E || A == F || A == G || A == H || A == I
													|| B == A || B == C || B == D || B == E || B == F || B == G || B == H || B == I 
													|| C == A || C == B || C == D || C == E || C == F || C == G || C == H || C == I 
													|| D == A || D == B || D == C || D == E || D == F || D == G || D == H || D == I
													|| E == A || E == B || E == C || E == D || E == F || E == G || E == H || E == I
													|| F == A || F == B || F == C || F == D || F == E || F == G || F == H || F == I
													|| G == A || G == B || G == C || G == D || G == E || G == F || G == H || G == I
													|| H == A || H == B || H == C || H == D || H == E || H == F || H == G || H == I
													|| I == A || I == B || I == C || I == D || I == E || I == F || I == G || I == H)
												continue;
											
											if ((A + B / C + (D * 100.0 + E * 10 + F) / (G * 100 + H * 10 + I)) == 10) {
												
												count ++;
												
												System.out.println(A + " " + B + "/" + C + " " + (D * 100 + E * 10 + F) + "/" + (G * 100 + H * 10 + I));
											
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
		
		System.out.println(count);
		
		
	}

}
