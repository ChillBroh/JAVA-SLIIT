import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab_2_ex5 {
	
		public boolean findEvenOrOdd(int i) {
			boolean res;
			
			res = (i % 2 == 0) ? true : false;
			return res;
		}
		
		
	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		int var = Integer.parseInt(reader.readLine());
		lab_2_ex5 num = new lab_2_ex5();
		
		System.out.println(num.findEvenOrOdd(var));
		
		
	}
	
}
