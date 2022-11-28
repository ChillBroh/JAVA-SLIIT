package Bridge;

public class Remote implements RemoteController {
	private TV tv;
	
	
	public Remote(TV tv) {
		this.tv = tv;
	}

	@Override
	public void onTV() {
		tv.on();

	}

	@Override
	public void offTV() {
		tv.off();

	}

	@Override
	public void tuneC(int channel) {
		tv.tune(channel);

	}

}
