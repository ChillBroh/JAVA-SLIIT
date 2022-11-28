package Question01A;

public class Squirrel extends Pet {
	private static int point;
	private String command;
	
	public Squirrel(String msg) {
		this.command = msg;
		
	}
	
	public void feed() {
		System.out.println("Feeding the Squirrel");
		point += 5;
		
	}
	
	public void clean() {
		System.out.println("cleaning the squirrel");
		point += 15;
	}
	
	public void cuddle() {
		System.out.println("Cuddeling the Squirrel");
		point += 10;
	}
	
	public void GetTotalPoint() {
		System.out.println("Total Point is " + point);
		isCaught();
	}
	public void isCaught() {
		int num = command.charAt(3)- '0';
		if(num >= 5 ) {
			try {
				
				throw new CaughtException("Caught");
			} catch (CaughtException e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("Did not caught");
		}
	}
}
