package Bridge;

public class Main {
	public static void main(String[] args) {
		TV lg = new LGTV();
		TV sony = new SonyTV();
		
		RemoteController remote = new Remote(lg);
		remote.onTV();
		remote.offTV();
		remote.tuneC(40);
	}
}
