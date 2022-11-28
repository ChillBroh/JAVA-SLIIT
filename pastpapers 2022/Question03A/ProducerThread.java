package Question03A;

import java.util.ArrayList;

public class ProducerThread extends Thread {
	private ArrayList<Integer> arr;
	
	public ProducerThread(ArrayList<Integer> arr) {
		super();
		this.arr = arr;
	}
	public void run() {
		
		synchronized (arr) {
			
			int value = 10;
			while(true) {
				System.out.println("Producer Started");
				System.out.println("Producer Adding value = " + value + "to Queue");
				arr.add(value);
				value += 10;
				try {
					Thread.sleep(1000);
					arr.wait();
					arr.notify();
				} catch (InterruptedException e) {
					e.getMessage();
				}	
			}
		}
	}
}
