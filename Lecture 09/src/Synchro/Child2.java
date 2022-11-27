package Synchro;

public class Child2 extends Thread {
	Document ob;

	public Child2(Document ob) {
		super();
		this.ob = ob;
	}
	
	public void run() {
		//changing the background
		
	ob.update(ob);
	}
}

