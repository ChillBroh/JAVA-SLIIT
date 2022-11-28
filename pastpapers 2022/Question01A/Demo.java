package Question01A;

public class Demo {
	public static void main(String[] args) {
		Pet squirrel = new Squirrel("Run3");
		squirrel.cuddle();
		squirrel.feed();
		squirrel.GetTotalPoint();
		
		Pet squirrel2 = new Squirrel("Run5");
		squirrel2.cuddle();
		squirrel2.feed();
		squirrel2.GetTotalPoint();
		
		Pet cat = new Cat();
		cat.cuddle();
		cat.clean();
		cat.feed();
		cat.GetTotalPoint();
		
		Pet parrot1 = new Parrot("walk");
		parrot1.feed();
		parrot1.GetTotalPoint();
		
		
		
		
	}
}
