package Synchro;

public class Child1 extends Thread {
	Document ob;

	public Child1(Document ob) {
		super();
		this.ob = ob;
	}
	
	public void run() {
		//changing the background
		
		ob.update(ob);
	}
}
