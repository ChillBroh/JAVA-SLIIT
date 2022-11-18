package Lec_5;

public class xxxx {
	 public String name;
	 public void paraseName() {
		 System.out.println("1");
		 try {
			 System.out.println("2");
			 int x = Integer.parseInt(name);
			 System.out.println("3");
		 }
		 catch (NullPointerException e) {
			System.out.println("4");
		}
		 System.out.println("5");
	 }
}
