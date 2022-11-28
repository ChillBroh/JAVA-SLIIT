package Question02A;

public class DemoApp {
	public static void main(String[] args) {
		Tcalculation<Integer> cal = new Tcalculation<>();
		cal.append(10);
		cal.append(20);
		System.out.println("Average is " + cal.average());
		
		Tcalculation<Double> cal2 = new Tcalculation<>();
		cal2.append(50.0);
		cal2.append(100.0);
		System.out.println("Average is " + cal2.average());
	}
	
	
}
