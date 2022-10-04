
public class object_paraMain {
	public static void main(String[] args) {
		Object_para p1 = new Object_para("Kamal", 25, 8000.0);
		Object_para p2 = new Object_para("Raja",26,85.2);
		
		p1.show();
		System.out.println("********************");
		p2.show(p1);
		System.out.println("********************");
		p1.show(p2); 
		
		
	}
}
