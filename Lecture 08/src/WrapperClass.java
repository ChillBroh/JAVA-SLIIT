
public class WrapperClass {
	public static void main(String[] args) {
		
		//autoboxing
		int res = 78;
		
		Integer myres;
		myres = res; //1 method to assign primitive to wrapper
		System.out.println(myres); 
		
		Integer res2 = myres.valueOf(res); // 2nd method to assign primitive to wrapper both can use
		System.out.println(res2);
		
		
		//unboxing
		
		Integer val = new Integer(45);
		
		int x = val; //method 1
		System.out.println(x);
		
		int z = val.intValue(); //method 2
		System.out.println(z);
	}
}
