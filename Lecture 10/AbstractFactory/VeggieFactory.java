package AbstractFactory;

public class VeggieFactory extends AbstractFactory {
	public Veggie getVeggie(String vtype) {
		if(vtype.equalsIgnoreCase("Cheese"))
			return new CheeseVeg();
		if(vtype.equalsIgnoreCase("Normal"))
			return new NormalVeggie();
		else
			return null;
	}

	@Override
	public Chicken getChicken(String msg) {
		// TODO Auto-generated method stub
		return null;
	}

}
