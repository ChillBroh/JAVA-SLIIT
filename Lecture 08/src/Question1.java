import java.util.ArrayList;

public class Question1 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>(); //we use generic as string
		
		names.add("Ishara");
		names.add("Isuru");
		names.add("sara");
		
		for(String x : names) {
			System.out.println(x); // this will print all the values in name object
		}
	}
}
