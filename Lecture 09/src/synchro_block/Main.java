package synchro_block;

public class Main {
	public static void main(String[] args) {
		Document d = new Document();
		Thread1 t1 = new Thread1(d);
		Thread2 t2 = new Thread2(d);
		t1.start();
		t2.start();
	}
}
