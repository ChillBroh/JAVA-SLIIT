import java.util.Scanner;

class Receptionist{
	private int ID;
	private String Name;
	private String phone;
	
	public Receptionist() {
		this.ID = 0;
		this.Name = "";
		this.phone = "";
	}
	public Receptionist(int pid, String pname,String tel ) {
		this.ID = pid;
		this.Name = pname;
		this.phone = tel;
	}
	
	public Boolean checkRoomAvailability(int no) {
		if(no > 0)
			return true;
		else 
			return false;
	}
	public double generateBill() {
		double x = 0.0;
		return x;
	}
}

public class ReceptionistMain {
		public static void main(String[] args) {
			Receptionist r1 = new Receptionist(1, "Ishara", "0766859740");
			
			Scanner obj = new Scanner(System.in);
			System.out.print("Enter Availability: ");
			int no = obj.nextInt();
			boolean x = r1.checkRoomAvailability(no);
			String reply;
			if(x) {
				reply = "Yes";
			}
			else {
				reply = "No";
			}
			System.out.println("Room available or not : " + reply );
			System.out.println("Your bill is : " + r1.generateBill());
		}
}
