
public class ShapeMain {
	public static void main(String[] args) {
		Shape ob = new Shape();
		System.out.println(ob.calcArea());
	
		Circle ob1 = new Circle(7);
		System.out.println(ob1.calcArea());
		
		Rectangle ob2 = new Rectangle(5, 6);
		System.out.println(ob2.calcArea());
		
	}
}

