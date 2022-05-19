package set;
// removes duplicates
import java.util.HashSet;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
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
