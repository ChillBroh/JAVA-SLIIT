package Template;

public abstract class Beverage {
	final void prepareRecepie() {
		boil();
		midstep1();
		midstep2();
		pour();
	}
	public void boil() {
		System.out.println("Boiling Water");
	}
	public abstract void midstep1();
	public abstract void midstep2();
	
	public void pour() {
		System.out.println("Pour into Cup");
	}
}
