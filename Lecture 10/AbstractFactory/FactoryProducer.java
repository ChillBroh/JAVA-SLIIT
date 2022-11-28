package AbstractFactory;

public class FactoryProducer {
	public AbstractFactory CreatePizza(String type) {
		if(type.equalsIgnoreCase("Chicken"))
			return new ChickenFactory();
		if(type.equalsIgnoreCase("Veggie"))
			return new VeggieFactory();
		else 
			return null;
	}
}
