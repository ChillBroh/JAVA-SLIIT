import java.util.Scanner;

public class lab_1_ex4 {
	public static void main(String[] args) {
		int day;
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Value of the day : ");
		day = obj.nextInt();
		
		System.out.print("Day of the week : ");
		switch (day) {
			case 1: System.out.println("Monday"); 
			break;
			case 2: System.out.println("Tuesday"); 
			break;
			case 3: System.out.println("Wednesday"); 
			break;
			case 4: System.out.println("Thursday"); 
			break;
			case 5: System.out.println("Friday"); 
			break;
			case 6: System.out.println("Saturday"); 
			break;
			case 7: System.out.println("Sunday"); 
			break;
			default : System.out.println("Invalid day");
		}
		
		System.out.println("Good Bye!");
			
		
	}
}
