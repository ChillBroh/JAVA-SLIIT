package synchro_block;

public class Thread1 extends Thread {
	Document ob;

	public Thread1(Document ob) {
		super();
		this.ob = ob;
	}
	
	public void run() {
		ob.update(ob);
	}
}
