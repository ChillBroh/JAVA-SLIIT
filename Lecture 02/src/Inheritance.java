
class Shape{
	private String name;
	public Shape(String name){
		this.name = name;
	}
	public String print() {
		return name;
	}
}

class Rectangle extends Shape{
	private int height;
	private int length;
	
	public Rectangle(int h, int l, String rname) {
		super(rname);
		this.height = h; 
		this.length = l;
	}
	public int calcArea() {
		return height * length;
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 6, "Rectangle_01");
		int area = r1.calcArea();
		
		
		System.out.println("Shape name is :" + r1.print() );
		System.out.println("Area is : " + area);
	}
}
