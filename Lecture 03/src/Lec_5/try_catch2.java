package Lec_5;

import java.util.Scanner;

public class try_catch2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter number 1");
		a = scanner.nextInt();
		System.out.println("Enter number 2");
		b = scanner.nextInt();
		
		try {
			 c = a/b;
			 System.out.println(c);
		}
		catch (ArithmeticException e) { //e is the object this is a object parameter
			System.out.println(e);
			System.out.println("cannot do the perform cause invalid answer");
		}
		catch (NullPointerException e) {
			System.out.println("input is empty");
		}
		catch (NumberFormatException e) {
			System.out.println("entered value is not an integer");
		}
		
		finally {
			System.out.println("done and dusted");
		}
		
	}
}
