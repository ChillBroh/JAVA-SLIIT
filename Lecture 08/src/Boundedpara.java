
public class Boundedpara<T extends Number> {
	T ob1;
	T ob2;
	
	public Boundedpara(T para1,T para2) {
		ob1 = para1;
		ob2 = para2;
	}
	public void print() {
		System.out.println(this.ob1);
		System.out.println(this.ob2);
	}
	
	public static void main(String[] args) {
		Boundedpara<Integer> bp = new Boundedpara<>(2,5);
		bp.print();
		
		//Boundedpara<String> bp1 = new Boundedpara<String>(5, 7); 
		//cannot use because String is not a subclass of Number class
	}
}
