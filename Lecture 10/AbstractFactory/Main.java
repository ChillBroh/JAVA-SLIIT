package AbstractFactory;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Which type pizza do you want? (Chicken/Veggie) ");
		String type = scan.next();
		
		FactoryProducer manager = new FactoryProducer();
		AbstractFactory ob = manager.CreatePizza(type);
		
		if(type.equalsIgnoreCase("chicken")) {
			System.out.print("Which type do you want (Thandoori or Devilled) : ");
			String p_type = scan.next();
			Chicken Cchoice = ob.getChicken(p_type);
			Cchoice.serveChicken();
		}
		if(type.equalsIgnoreCase("veggie")) {
			System.out.print("Which type do you want (Thandoori or Devilled) :");
			String p_type = scan.next();
			Veggie Vchoice = ob.getVeggie(p_type);
			Vchoice.serveVeggie();
			
		}
		scan.close();
		
	
	
		
		
		
	}
}
