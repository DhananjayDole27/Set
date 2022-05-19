package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class C {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		  l.add(10);
		  l.add(30);
		  l.add(10);
		  l.add(30);
		  l.add(5);
		 
		 System.out.println(l);
		 //print the original list
		 Set<Integer> s = new HashSet(l);
		  System.out.println(s);
		  //print the list by removing duplicates
		  
		 Set<Integer> S = new LinkedHashSet<>(l);
		 
		  System.out.println(S);
		  //print the list by removing duplicates as well as insertion order is preserved.
		 
		 
		 
	}

}
