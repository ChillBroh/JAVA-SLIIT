package synchro_block;

public class Document {
	public void update(Document ob) {
		System.out.println("print");
		System.out.println("print2");
		
		synchronized (ob) { //also can use (new Document()) but this will remove synchro. cause syncro is many threads are tryng to access one object. this will create another object
			for(int i= 0; i < 10; i++) {
				System.out.println("Updating doc " + i);
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.getMessage(); 
				}
			}
		}
	}
}
