package lab3_ex5;

public class Pet {
	private String name, owner;
	private int age;
	
	public Pet(String n, String o, int a) {
		this.name =n ;
		this.owner = o;
		this.age = a;
	}
	
	public Pet(String n, String o) {
		this.name = n;
		this.owner = o;
	}
	
	public void showDetails() {
		System.out.println("I am a pet. My name is " + this.name + ".My owner is " + this.owner);
	}
	
}
