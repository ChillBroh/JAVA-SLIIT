package pp2018q1;

import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) {
		ArrayList<Item> item = new ArrayList<>();
		
		Book b1 = new Book(1, "test", 50.0,"pub1", "thirill", "500");
		Book b2 = new Book(2, "test2", 100.0,"pub2", "chill", "200");
		
		item.add(b1);
		item.add(b2);
		
		Car c1 = new Car(3, "car1", 200.0,"ride1", "5800");
		Car c2 = new Car(4, "car2", 2000.0,"ride2", "10000");
		item.add(c1);
		item.add(c2);
		
		for (Item item2 : item) {
			System.out.println("************");
			item2.display();
		}
		
	}
}
