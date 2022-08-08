import java.util.Scanner;

public class lab_1_ex3 {
	public static void main(String[] args) {
		int age;
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		age = objScanner.nextInt();
		
		if (age > 18 )
			System.out.println("Adult");
		else 
			System.out.println("Child");
	}
}
