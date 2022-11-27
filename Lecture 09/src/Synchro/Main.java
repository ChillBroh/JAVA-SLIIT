package Synchro;

public class Main {
	public static void main(String[] args) {
		Document ob = new Document();
		Child1 thread1 = new Child1(ob);
		Child2 thread2 = new Child2(ob);
		thread1.setName("T1 ");
		thread2.setName("T2 ");
		thread1.start();
		thread2.start();
	}
}
