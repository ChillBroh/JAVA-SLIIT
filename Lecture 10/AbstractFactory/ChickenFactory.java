package AbstractFactory;

public class ChickenFactory extends AbstractFactory {
	public Chicken getChicken(String ctype) {
		if(ctype.equalsIgnoreCase("devlilled"))
			return new DevilledChicken();
		if(ctype.equalsIgnoreCase("Thandoori"))
			return new ThandooriChicken();
		else
			return null;
	}


	@Override
	public Veggie getVeggie(String msg) {
		// TODO Auto-generated method stub
		return null;
	}
}
