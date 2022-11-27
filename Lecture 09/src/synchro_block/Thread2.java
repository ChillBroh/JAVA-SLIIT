package synchro_block;

public class Thread2 extends Thread {
	Document ob;

	public Thread2(Document ob) {
		super();
		this.ob = ob;
	}
	
	public void run() {
		ob.update(ob);
	}
}
