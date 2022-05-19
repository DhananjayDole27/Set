package set2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<Student> s = null;
		System.out.println("----Select\n" + "1.Rollnosort \n" + "2.NameSort \n");
		
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.nextInt();
		
		if (ch ==1)
			s= new TreeSet<Student> (new RollnoSort());
		
		else if (ch ==2)
			s= new TreeSet<Student> (new NameSort());
		
	}

}
