package Question03A;

import java.util.ArrayList;

public class ConsumerThread extends Thread {
	private ArrayList<Integer> arr;
	
	public ConsumerThread(ArrayList<Integer> arr) {
		this.arr = arr;
	}
	
	public void run() {
		synchronized (arr) {
			while (true) {
				System.out.println("Consumer Started");
				System.out.println("Consumer thread consumes " + arr.get(0));
				arr.remove(0);
				System.out.println("Elements in queue = " + arr);
				try {
					Thread.sleep(1000);
					arr.notify();
					arr.wait();
					
				} catch (InterruptedException e) {
					e.getMessage();
				}
			}
		}
	}
}
