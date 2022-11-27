package pp2018q2;

public class MainThreadApp {
	public static void main(String[] args) {
		CountDown c = new CountDown();
		Thread thread1 = new Thread(c);
		
		CalcSum c1 = new CalcSum();
		Thread t1 = new Thread(c1);
		t1.setName("black");
		
		CalcSum c2 = new CalcSum();
		Thread t2 = new Thread(c2);
		t2.setName("white");
		
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		
	}
}
