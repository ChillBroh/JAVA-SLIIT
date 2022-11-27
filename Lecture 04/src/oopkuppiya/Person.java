package oopkuppiya;

public class Person implements common_d,school_d {
	
	private String uname="hehe";
	private String pass="boss";
	@Override
	public void getSDetails(school_d x) {
	
		System.out.println(school_d.sid);
		
	}
	@Override
	public void getCDetails(common_d y) {
		System.out.println(common_d.name);
		System.out.println(common_d.town);
		System.out.println(common_d.age);
		
	}
	
	public void privated() {
		System.out.println(this.uname);
		System.out.println(this.pass);
	}
	
	
	
}
