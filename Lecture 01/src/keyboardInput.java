import java.util.Scanner;
//or we can use import java.util.*;

public class keyboardInput{
	public static void main(String []args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = obj.next(); //use to get string
		System.out.print("hey " + name + " Enter your age : ");
		int age = obj.nextInt(); //use to get integer
		System.out.println("Your age is " + age);
		System.out.println("After 10 years your age will be "+ (age + 10));
	
	}

}