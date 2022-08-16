
class Person{
	void method() {
		System.out.println("Display Person");
	}
}

class Employee extends Person{
	void Method() {
		System.out.println("Display Employee");
	}
}
public class company {
	public static void main(String[] args) {
		
		Person p1 = new Person();//Reference type is superclass so only access that one
		p1.method();
		p1.method();
		System.out.println("************");
		Employee e1 = new Employee(); //Reference type is subclass so can also access superclass
		e1.method();
		e1.Method();
		System.out.println("************");
		Person e2 = new Employee(); //Reference type is superclass so only access that one
		e2.method();
		e2.method();
		
//		Employee e3 = new Person(); cannot reference from sub class to super class
	}
}
