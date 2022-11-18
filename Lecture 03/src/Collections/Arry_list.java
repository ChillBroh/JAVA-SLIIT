package Collections;


import java.util.ArrayList;
import java.util.Arrays;


public class Arry_list {
	public static void main(String[] args) {
			ArrayList<Integer> arrayList = new ArrayList<>();
			
			//add elements
			arrayList.add(100);
			arrayList.add(400);
			arrayList.add(500);
			
			System.out.println("conternt of array" + arrayList);
			System.out.println("Size of the array" + arrayList.size());
			//add value to waanted position
			arrayList.add(1, 1000); //new values are 100,1000,400,500
			System.out.println("conternt of array" + arrayList);
			
			arrayList.remove(3); //3 will remove
			System.out.println("conternt of array" + arrayList);
			
			arrayList.add(50000);
			
			
			//convert ArrayList To Array
			
			Integer arr[] = new Integer[arrayList.size()];
			
			arr = arrayList.toArray(arr);
			
			System.out.println("Content of new converted array are " + Arrays.toString(arr));
			
			//print using for each
			for(int Value : arrayList) {
				System.out.println(Value);
			}
	}
}
