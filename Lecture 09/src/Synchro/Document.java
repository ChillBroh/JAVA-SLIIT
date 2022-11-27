package Synchro;

public class Document {
	public synchronized  void update(Document ob) {
		for(int i = 0; i < 10; i++) {
			System.out.println("Update Doc" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}
