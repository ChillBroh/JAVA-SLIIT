package lab3_ex5;

public class Main {
	public static void main(String[] args) {
		Pet p = new Pet("sudda", "ishara", 3);
		p.showDetails();
		
		Pet p1 = new Pet("hehe" , "aj");
		p1.showDetails();
		
		Cat c = new Cat("suddi", "isuru", 5, 2);
		c.showDetails();
		
		Cat c1 = new Cat("los" , "sehan");
		c1.showDetails();
		
		Dog d = new Dog("rs","sudda",0,1);
		d.showDetails();
		
		Dog d1 = new Dog("rs","hehe");
		d1.showDetails();
	}
}
