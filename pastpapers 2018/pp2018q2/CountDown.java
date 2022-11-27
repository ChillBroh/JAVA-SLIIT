package pp2018q2;

public class CountDown extends Thread {
	
	
	public void run() {
		synchronized (CountDown.class) {
			int num = 1;
			
			while(true) {
				
				if(num > 10)
					break;
				System.out.println(num);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}
