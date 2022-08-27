
public class AddMain {
	
		public static void main(String[] args) {
			Add ob = new Add();
			
			int a = ob.calculate(2, 3);
			int b = ob.calculate(2,3, 5);
			int c = ob.calculate(2, 3,5, 10);
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	
}
