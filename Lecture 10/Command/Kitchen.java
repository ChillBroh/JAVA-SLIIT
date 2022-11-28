package Command;

public class Kitchen implements Light {

	@Override
	public void on() {
		System.out.println("Light is on for Kitchen");

	}

	@Override
	public void off() {
		System.out.println("Light is off for Kitchen");
	}

}
