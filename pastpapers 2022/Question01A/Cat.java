package Question01A;

public class Cat extends Pet {
	
	private static int catPoint = 0;
	
	public void feed() {
		System.out.println("Feeding the Cat");
		catPoint += 5;
		
	}
	
	public void clean() {
		System.out.println("cleaning the Cat");
		catPoint += 15;
	}
	
	public void cuddle() {
		System.out.println("Cuddeling the Cat");
		catPoint += 10;
	}
	
	public void GetTotalPoint() {
		System.out.println("Total Point is " + catPoint);
	}
}
