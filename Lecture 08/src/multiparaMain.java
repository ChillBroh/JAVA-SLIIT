


public class multiparaMain {
	public static void main(String[] args) {
		
		multipara<Integer,Float> ob1 = new multipara<>(10, 20.5f);
		
		ob1.show();
		
		multipara<Integer, String> ob2 = new multipara<Integer, String>(15, "Ishara");
		ob2.show();
	}
}
