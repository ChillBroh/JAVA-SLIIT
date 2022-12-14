
class Box{
	private double width;
	private double height;
	private double length;
	
	public Box(int width,int height,int length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	//this will override the print function in main;
	public String toString() {
		return "Length is " + this.length + "\nHeight is " + this.height + "\nWidth is " + this.width;
	}
}

public class Object {
	public static void main(String[] args) {
		Box myBox = new Box(10, 20, 30);
		System.out.println(myBox+"\n");
		
		/*result
		 *  Length is 30.0
			Height is 20.0
			Width is 10.0
		 */
		
		//if toString is not there output will be Box@6504e3b2
		Box myBox2 = new Box(40,50, 60);
		System.out.println(myBox2+"\n");
		
		myBox = myBox2; //garbage collector will delete the old data of my box in the heap part of memory
		System.out.println(myBox + "\n");
		System.out.println(myBox2);
	
	}
}
