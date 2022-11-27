package extendthread;

public class Child2 extends Thread {
	public void run() {
		
		//change fonts
		
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}
