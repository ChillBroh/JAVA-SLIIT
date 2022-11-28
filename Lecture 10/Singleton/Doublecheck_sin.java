package Singleton;

public class Doublecheck_sin {
	private static Doublecheck_sin ob;
	
	private Doublecheck_sin() {
		System.out.println("Double check sin created");
	}
	
	public static Doublecheck_sin getObject() {
		if(ob==null) {
			synchronized (Doublecheck_sin.class) {
				if(ob == null) {
					ob = new Doublecheck_sin();
				}
			}
		}
		
		return ob;
	}
}
