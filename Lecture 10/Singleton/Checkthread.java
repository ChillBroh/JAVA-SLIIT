package Singleton;

public class Checkthread implements Runnable {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Doublecheck_sin.getObject();
			ThreadsafeSingleton.getInstance();
		}
		for (int i = 0; i < 5; i++) {
			Doublecheck_sin.getObject();
			ThreadsafeSingleton.getInstance();
		}
		
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			Doublecheck_sin.getObject();
			ThreadsafeSingleton.getInstance();
		}
	}
}
