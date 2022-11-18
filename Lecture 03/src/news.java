
public class news {
	private String color;
	public news() {
		
	}
	
	public news(String color) {
		System.out.println("shape");
		this.color= color;
		
	}
	public static void main(String[] args) {
		new chamith();
	}
}
class chamith extends news{
	public chamith() {
		System.out.println("Rectangle");
	}
}
