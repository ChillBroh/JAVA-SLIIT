
public class Person_main {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Ishara";
		p1.age = 24;
		p1.batchid = "Batch 02";
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.batchid);
		System.out.println("************************");
		
		Person p2 = new Person();
		p2.name = "Shavini";
		p2.age = 24;
		

		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.batchid);
		System.out.println("************************");
		
		p2.batchid = "B 02";
		System.out.println(p2.batchid);
		System.out.println(p1.batchid);
	}
}
