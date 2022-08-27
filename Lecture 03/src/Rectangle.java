
public class Rectangle extends Shape{
private int len, wid;
	Rectangle(int l, int w){
		this.len = l;
		this.wid = w;
	}
	public int calcArea() {
		return len * wid;
	}
}
