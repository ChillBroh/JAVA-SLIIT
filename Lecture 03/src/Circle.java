

public class Circle extends Shape{
	private int r;
	Circle(int radius){
		this.r = radius;
	}
	public int calcArea() {
		return (int)(2 * 3.14 * r *r) ; 
	}
}


