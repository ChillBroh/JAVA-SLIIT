package Lec_5;

public class MathOpMain {
	public static void main(String[] args) {
		try {
			MathOp math = new MathOp();
			System.out.println(math.add(2, 0));
			math.divide(2, 0);
		}
		
		
		catch (ArithmeticException e) {
			System.out.println("error");
		}
	}
	//also using throws in main method we can throw it without handeling it
}
 
