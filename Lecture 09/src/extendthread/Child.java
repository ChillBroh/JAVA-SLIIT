package extendthread;


public class Child extends Thread {
	
	public void run() {
		
		//change speed
		for(int i = 0; i < 10; i ++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}
