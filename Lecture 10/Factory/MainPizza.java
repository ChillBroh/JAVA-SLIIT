package Factory;

import java.util.Scanner;

public class MainPizza {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PizzaFactory manager = new PizzaFactory();
		
		System.out.print("What is your Requirement (Veggie/Chicken): ");
		String type = scan.next();
		Pizza pizza  = manager.getType(type);
		pizza.createPizza();
		
	}
}
