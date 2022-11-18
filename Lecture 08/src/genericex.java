
public class genericex <T> { //no need of specifing a type. can use a letter instead of type

		private T number1;
		
		public T addition(T res) {
			res = number1;
			return res;
		}
	
	
	public static void main(String[]args) {
		genericex<Integer> ob = new genericex<>(); //must add the wrapper class to the class and it will use as the data type
		System.out.println(ob.addition(20));
	}
}


