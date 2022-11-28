package Bridge;

public class LGTV implements TV {

	@Override
	public void on() {
		System.out.println("Switch on LG TV");

	}

	@Override
	public void off() {
		System.out.println("Switch off LG TV");

	}

	@Override
	public void tune(int Channel) {
		System.out.println("Switch on chanel in LG TV is : " + Channel);

	}

}
