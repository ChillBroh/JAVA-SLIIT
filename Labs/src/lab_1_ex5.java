
public class lab_1_ex5 {
	public static void main(String[] args) {
		int i = 0, j = 0,k = 0;
		//for square
		while(i < 5) {
			i++;
			while(j < 5) {
				System.out.print("*");
				j++;
			}
			j = 0;
			System.out.println();
		}
		
		
		
		
		//for triangle
		for(i = 1; i <= 5; i++) {
			
			for(j = 1; j <= 10; j++) {
				
				if(j <= (5+k) && j >= (5-k)) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}	
					
			}
			k++;
			System.out.println();
		}
	
	
	}
}
