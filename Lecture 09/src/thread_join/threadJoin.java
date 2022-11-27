package thread_join;

public class threadJoin extends Thread {
	public void run() {
		System.out.println("start executing child ");
		for(int i =0; i < 10; i++) {
			System.out.println("Child" + i);
		} 
		System.out.println("finished child");
	}
	public static void main(String[] args) {
		threadJoin t1 = new threadJoin();
		t1.start();
		System.out.println("main started");
		try {
			t1.join();
		} catch (Exception e) {
			e.getMessage();
		}
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("Main " + i);
		}
		
		System.out.println("Finished exec");
		
	}
}
