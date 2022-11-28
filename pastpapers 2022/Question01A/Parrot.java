package Question01A;

public class Parrot extends Pet {

	private String command;
	private static int Ppoint;
	
	public Parrot(String msg) {
	command = msg;
		
	}
	
	public void feed() {
		System.out.println("Feeding the Parrot");
		Ppoint += 5;
		
	}
	
	public void clean() {
		System.out.println("cleaning the Parrot");
		Ppoint += 15;
	}
	
	public void cuddle() {
		System.out.println("Cuddeling the Parrot");
		Ppoint += 10;
	}
	
	public void GetTotalPoint() {
		System.out.println("Total Point is " + Ppoint);
		isCaught();
	}
	
	public void isCaught() {
		try {
			if(command.equalsIgnoreCase("Walk"))
				throw new CaughtException("Caught");
		} catch (CaughtException e) {
			System.out.println(e);
		}
			
	}
}
