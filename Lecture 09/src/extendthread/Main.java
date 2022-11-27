package extendthread;

public class Main {
	public static void main(String[] args) {
		Child thread1 = new Child();
		thread1.setName("T1 ");
		thread1.start(); //for start thread
		
//		Child thread2 = new Child();
//		thread2.start();
		
		Child2 thread3 = new Child2();
		thread3.setName("T3 ");
		thread3.start();
		
		
		//change background
		for(int i= 0 ; i < 10; i++) {
			System.out.println("Main thread" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}
