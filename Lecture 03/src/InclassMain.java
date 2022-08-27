

public class InclassMain {
	public static void main(String[] args) {
		Inclass mybox = new Inclass(10,20,30);
		
		Inclass mybox2 = new Inclass(mybox);
		
		double vol;
		
		vol = mybox.volume();
		System.out.println("my box volume is " + vol);
		
		vol = mybox2.volume();
		System.out.println("My box 2 volume is " + vol);
		
	}
}
