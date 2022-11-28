package Singleton;

public class ThreadsafeSingleton {
	private static ThreadsafeSingleton ts;
	
	private ThreadsafeSingleton() {
		System.out.println("Thread safe singleton created");
	}
	public static ThreadsafeSingleton getInstance() {
		if(ts==null) {
			synchronized (ThreadsafeSingleton.class) {
				if (ts==null) {
					ts = new ThreadsafeSingleton();
				}
			}
		}
		return ts;
	}
	
	
}
