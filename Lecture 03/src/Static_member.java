class Check{
	private static int count = 1;
	
	public int counter() {
		count++;
		return count;
	}
}

public class Static_member {
	public static void main(String[] args) {
		Check c1 = new Check();
		Check c2 = new Check();
		
		System.out.println(c1.counter());
		System.out.println(c2.counter());
		System.out.println(c1.counter()); //count is common for both objects and there is only one count for all of them cause of static
	}
	
	
}
