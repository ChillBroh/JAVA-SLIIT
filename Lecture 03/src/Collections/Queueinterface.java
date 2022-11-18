package Collections;

import java.util.PriorityQueue;

public class Queueinterface {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.add(11);
		queue.add(22);
		queue.add(50);
		queue.add(25);
		
		
		
		System.out.println(queue);
		//print first element
		System.out.println("Queue peek = " + queue.peek());
		
		//remove first element
		System.out.println("Queue poll " + queue.poll());
		
		//print after poll
		System.out.println(queue);
	}
}
