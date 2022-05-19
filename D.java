package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class D {

	public static void main(String[] args) {
		List <Integer> l = new ArrayList<>();
		 l.add(3);
		 l.add(5);
		 l.add(1);
		 l.add(2);
		 l.add(4);
		 l.add(5);
		 
		System.out.println(l);
		
	  Set<Integer> s = new TreeSet<>(l);  // used  only when we want to sort and remove duplicates
	   System.out.println(s);
	   
	   Collections.sort(l);    // it is only used to sort , it will not remove duplicates.
	   System.out.println(l);
	  

	}

}
