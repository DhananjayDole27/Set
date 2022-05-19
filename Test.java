package set;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		 s1.setRollno(1);
		 s1.setName("CCC");
		 
		Student s2 = new Student();
		 s2.setRollno(3);
		 s2.setName("aaa");
		 
		Student s3 = new Student();
		 s3.setRollno(2);
		 s3.setName("bbb");
		 
		Set<Student> s = new TreeSet <Student>();   // arrange data serialwise
		 s.add(s1);
		 s.add(s2);
		 s.add(s3);
		 
		for(Student stu : s)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}

	}

}
