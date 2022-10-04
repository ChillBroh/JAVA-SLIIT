import Lec_5.MathOp;
import Lec_5.try_catch;

public class MathopMain {
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
 