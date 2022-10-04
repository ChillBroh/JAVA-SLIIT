package Lec_5;

public class runtime_error {
		public static void main(String[] args) {
			int a = 10;
			int b = 5;
			int c = 5;
			int x = a / (b-c); //division by 0
			
			System.out.println("x is " + x);
			int y = a /(b+c);
			System.out.println("y" + y);
			
		}
}
