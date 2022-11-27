package implementthread;

public class Child1 implements Runnable {
public void run() {
		
		//change speed
		for(int i = 0; i < 10; i ++) {
			System.out.println("Child thread" + i);
		}
}
}
