package Lec_5;

public class try_catch {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			int i = 10/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Values cannot be devided by 0");
		}
		
		System.out.println("hello");
	}
}
