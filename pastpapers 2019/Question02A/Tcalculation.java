package Question02A;

import java.util.ArrayList;

public class Tcalculation <T extends Number> {
	ArrayList<T> numList = new ArrayList<>();
	
	public void append(T value) {
		numList.add(value);
	}
	
	public double average() {
		double total = 0;
		for (T t : numList) {
			total += t.doubleValue();
		}
		return total/numList.size();
	}
	
	
	
}
