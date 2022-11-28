package Factory;

public class PizzaFactory {
	public Pizza getType(String type) {
		if(type.equalsIgnoreCase("Veggie")) 
			return new VegPizza();		
		if (type.equalsIgnoreCase("chicken")) 
			return new ChickenPizza();
		else {
			return null;
		}
		
	}
}
