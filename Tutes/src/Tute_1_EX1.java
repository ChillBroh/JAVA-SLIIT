
class Student{
	private int id;
	private String name;
	private int mark1,mark2,mark3;
	
	public Student() {
		this.id = 0;
		this.name = "";
		this.mark1 = this.mark2 = this.mark3 = 0;
	}
	public Student(int pid, String pname, int m1,int m2, int m3) {
		this.id = pid;
		this.name = pname;
		this.mark1 = m1;
		this.mark2 = m2;
		this.mark3 = m3;
	}
	public double calcAvg() {
		double avg = (mark1 + mark2 + mark3)/3.0;
		return avg;
	}
	public void display() {
		System.out.println("ID is : " + this.id);
		System.out.println("Name is : " + this.name);
		System.out.println("Average is : " + this.calcAvg());
	}
	
}
public class Tute_1_EX1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		System.out.println();
		Student s2 = new Student(25,"Ishara",40,20,30);
		s2.display();
	}
}
