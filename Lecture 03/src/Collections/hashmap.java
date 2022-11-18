package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer> hash = new HashMap<>();
		
		hash.put("Ishara", 90);
		hash.put("shavini" , 100);
		hash.put("Ishara", 10);
		
		Set<Map.Entry<String, Integer>> mySet =hash.entrySet();
		
		for(Map.Entry<String, Integer> val :mySet) {
			System.out.println("key " + val.getKey());
			System.out.println("value " + val.getValue());
		}
	}
}
