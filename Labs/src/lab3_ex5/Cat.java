package lab3_ex5;

public class Cat extends Pet {
	private int livesLeft = 0;
	
	public Cat(String n, String o, int a, int l) {
		super(n,o,a);
		this.livesLeft = l;
	}
	
	public Cat(String n, String o) {
		super(n, o);
		this.livesLeft = 7;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("I am a Cat.I have " + this.livesLeft + " lives");
	}
}
