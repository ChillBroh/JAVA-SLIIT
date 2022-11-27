package pp2018q1;


abstract public class Item {
	private int itemNo;
	private String description;
	private double unitPrice;
	
	public Item(int itemNo, String description, double unitPrice) {
		super();
		this.itemNo = itemNo;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	public void display() {
		System.out.println(itemNo);
		System.out.println(description);
		System.out.println(unitPrice);
		
	}
	
	
}
