

class Main{
	static int a = 3;
	static int b;
	
	public static void meth(int x) { // this will load in to memeory. but will not get executed. cause it's a static method.-1 
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	static {
		System.out.println("Static block initialized");//this will load in to memeory and executes.cause it's static block  -1
		b = a * 4;
	}
}
public class Static_demo {
	public static void main(String[] args) { // main will load and executed - 3
		Main.meth(42);
	}

	
}
