package Question04A;

public class NissanCar implements Car {
	private CarAirBag car;
	
	public NissanCar(CarAirBag car) {
		this.car = car;
	}

	@Override
	public void assembleLight() {
		System.out.println("Assembling for Nissan");
		car.airBagLightIndecator();

	}

	@Override
	public void assembleMotionSensor() {
		System.out.println("Assembing for Nissan");
		car.airBagMotionDetection();

	}

}
