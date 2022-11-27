package pp2018q1;

public class Book extends Item {
	private String publisher;
	private String category;
	private String pages;
	public Book(int itemNo, String decription, double unitPrice, String publisher, String category, String pages) {
		super(itemNo, decription, unitPrice);
		this.publisher = publisher;
		this.category = category;
		this.pages = pages;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println(publisher);
		System.out.println(category);
		System.out.println(pages);
	}
}
