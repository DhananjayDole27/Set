package set;

public class Student implements Comparable<Student> {
	private int rollno;
	private String Name;
	

	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollno-o.rollno;
	}

}
