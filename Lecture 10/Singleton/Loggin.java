package Singleton;

public class Loggin {
	private static Loggin l;
	
	private Loggin() {
		
	}
	
	public synchronized static Loggin getInstance() {
		//synchronized will lock the object but this will make the perffomance issue.so only use this when performance is  not considering chances
		if(l==null) {
			l = new Loggin();
		}
		return l;
	}
	

}
