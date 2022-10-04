package interface_lec;

public interface Interface01 {
	// all methods are abstract. no concrete
	// no need to right abstract
	
	final int age = 45;
	public int getArea();
	//no want to write as abstract public int getArea() cause interface methods are always abstract
	
	public int getPerimeter(int x);
	void display();
}
