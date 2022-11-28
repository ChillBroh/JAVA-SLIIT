package Question04A;

public class ToyotaCar implements Car {
	private CarAirBag car;
	
	
	public ToyotaCar(CarAirBag car) {
		this.car = car;
	}

	@Override
	public void assembleLight() {
		System.out.println("Assembing for Toyota");
		car.airBagLightIndecator();
	
	}

	@Override
	public void assembleMotionSensor() {
		System.out.println("Assembing for Toyota");
		car.airBagMotionDetection();

	}

}
