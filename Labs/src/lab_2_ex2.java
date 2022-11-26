import java.util.Scanner;

public class lab_2_ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = scan.next();
		System.out.print("Enter your IT number : ");
		String it = scan.next().toUpperCase();
		System.out.print("Enter your District : ");
		String dis = scan.next();
		
		System.out.println("It number : " + it + "\nName : " + name + "\nDistrict : " + dis);
		
		//or can use args[]
		
		System.out.println("It number : " + args[0] + "\nName : " + args[1] + "\nDistrict : " + args[2]);
	}
}
