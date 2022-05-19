package set;
// insertion order preserved

import java.util.LinkedHashSet;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<>();
		 s.add(5);
		 s.add(10);
		 s.add(30);
		 s.add(5);
		 s.add(30);
		 s.add(10);
		 s.add(20);
	System.out.println(s);
	 for(int x : s)
	 {
		 System.out.println(x);
	 }
		 
	}

	}


