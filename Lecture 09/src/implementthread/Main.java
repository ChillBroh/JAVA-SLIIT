package implementthread;

public class Main {
	public static void main(String[] args) {
//		Child thread1 = new Child();
//		thread1.start(); //for start thread
	
		
//		Child2 thread3 = new Child2();
//		thread3.start();
		
		Child1 ob = new Child1();
		Thread thread = new Thread(ob);
		thread.start(); 
		
		//or Thread thread = new Thread(new Child1());
		
		
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
