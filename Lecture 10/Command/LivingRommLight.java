package Command;

public class LivingRommLight implements Light {

	@Override
	public void on() {
		System.out.println("Light is on for living room");

	}

	@Override
	public void off() {
		System.out.println("Light is off for living room");

	}

}
