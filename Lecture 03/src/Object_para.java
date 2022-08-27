
public class Object_para {
	String name;
	int age;
	double sal; 
	
	
	
	public Object_para() {
		super();
	}
	public Object_para(String name, int age, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	void show() {

		System.out.println("name is " + name);
		System.out.println("age is " + age);
		System.out.println("Salary is " + sal);
	}
	void show(Object_para x) {
		System.out.println("name is " + x.name);
		System.out.println("age is " + x.age);
		System.out.println("Salary is " + x.sal);
	}
	



}
