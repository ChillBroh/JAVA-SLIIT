package Collections;

import java.util.Stack;
 

public class Stackarray {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.add("Ishara");
		stack.add("Shavini");
		stack.push("shan");
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		stack.push("isuru");
		System.out.println(stack);
		
		
	}
}
