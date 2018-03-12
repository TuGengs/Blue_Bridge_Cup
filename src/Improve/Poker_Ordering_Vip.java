package Improve;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Poker_Ordering_Vip {
	
	static class Poker {
		
		public int flower;
		
		public int count;

		public Poker(int flower, int count) {

			this.flower = flower;
			
			this.count = count;
			
		}
		
	}
	
	public static List<Poker> list = new ArrayList<Poker>();
	
	public static String Translate2(int a) {
		
		if (a == 4) return "s";
		if (a == 3) return "h";
		if (a == 2) return "c";
		
		return "d";
		
	}
	
	public static String Translate3(int a) {
		
		if (a == 14) return "A";
		if (a == 11) return "J";
		if (a == 12) return "Q";
		if (a == 13) return "K";
		
		return String.valueOf(a);
		
	}
	
	public static int Translate(String str) {
		
		if ("s".equals(str)) return 4;
		
		if ("h".equals(str)) return 3;
		
		if ("c".equals(str)) return 2;
		
		if ("d".equals(str)) return 1;
		
		if ("A".equals(str)) return 14;
		
		if ("J".equals(str)) return 11;
		
		if ("Q".equals(str)) return 12;
		
		if ("K".equals(str)) return 13;
		
		return Integer.valueOf(str);
		
	}

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i += 2) {
			
			list.add(new Poker(Translate(str.substring(i + 1, i + 2)), 
					Translate(str.substring(i, i + 1))));
			
		}
		
		Collections.sort(list, new Comparator<Poker>() {

			@Override
			public int compare(Poker o1, Poker o2) {
				
				if (o1.count != o2.count) {
					
					return o1.count > o2.count == true ? 1 : -1;
					
				} 
					
				if (o1.flower != o2.flower) {
				
					return o1.flower > o2.flower == true ? 1: -1;
						
				}
				
				return 0;
				

			}
			
			
		});
		
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.print(Translate3(list.get(i).count) + Translate2(list.get(i).flower) + " ");
			
		}
		
		
	}
	
}







