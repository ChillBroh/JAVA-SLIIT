import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		int num, i, count=0; 
		
		Scanner number = new Scanner(System.in);
		System.out.println("Enter your number : ");
		num = number.nextInt();
		
		
			for(i = 1; i <= num; i++) {
				if(num % i == 0 || num % i == num) 
					count++;
			}
			
			if(count > 2)
				System.out.println("number is not a prime number");
			else 
				System.out.println("Number is a prime number");
				
			
	}
}	
		
	

