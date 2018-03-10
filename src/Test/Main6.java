package Test;

import java.util.TreeSet;
import java.util.Set;

public class Main6 {
	
	static class A implements Comparable<A>{
		
		public int a;
		
		public int b;

		public A(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(A o) {
			
			if (this.a == o.a && this.b == o.b)
				return 0;
			else 
				return 1;
			
		}
		
//		@Override
//		public boolean equals(Object obj) {
//			
//			A obj2 = (A) obj;
//
//			return ((this.a == obj2.a) && (this.b == obj2.b));
//			
//		}
//		
//		@Override
//		public int hashCode() {
//			
//			return 1;
//			
//		}
		
	}

	public static void main(String[] args) {
		
		Set<A> l = new TreeSet<A>();
		
		Set<A> l2 = new TreeSet<A>();
		
		A a1 = new A(1, 2);
		
		A a2 = new A(1, 3);
		
		A a3 = new A(1, 2);
		
//		System.out.println(a1.equals(a3));
		
		System.out.println(l.add(a1));

		System.out.println(l.add(a2));
		
		System.out.println(l.add(a3));
		
		
//		System.out.println(l);
		
	}
	
}
