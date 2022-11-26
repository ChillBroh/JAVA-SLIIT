package lab3_ex5;

public class Dog extends Pet{
	private int noOfMasters = 0;
	
	public Dog(String n, String o, int a, int m) {
		super(n,o,a);
		this.noOfMasters = m;
	}
	
	public Dog(String n, String o) {
		super(n, o);
		
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("I am a Dog and I have " + this.noOfMasters + " masters");
	}
}
