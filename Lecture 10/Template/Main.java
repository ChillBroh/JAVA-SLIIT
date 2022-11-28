package Template;

public class Main {
	public static void main(String[] args) {
		System.out.println("==============Tea=========\n");
		Beverage tea = new Tea();
		tea.prepareRecepie();
		
		System.out.println("==============Coffie=======\n");
		Beverage coffie = new Coffie();
		coffie.prepareRecepie();
	}
}
