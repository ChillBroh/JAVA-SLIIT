package pp2018q1;

public class Car extends Item {
	private String model;
	private String type;
	
	public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
	}

	@Override
	public void display() {
		super.display();
		System.out.println(model);
		System.out.println(type);
	}
	
	
	
}
