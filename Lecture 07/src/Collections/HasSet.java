import java.util.TreeSet;

public class test {
	public static void main(String[]args) {
	
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(40);
		tree.add(5);
		tree.add(10);
		tree.add(20);
		tree.add(50);
		tree.add(10);
		
		System.out.println(tree);
		
		for(int x : tree) {
			System.out.println(x);
		}
}
}