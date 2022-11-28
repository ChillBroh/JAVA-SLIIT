package Strategy;

public class Bird {
	IFlyBehaviour flyb;
	IQuackBehaviour quack;
	
	public void setFlyBehaviour(IFlyBehaviour fly) {
		this.flyb = fly;
	}
	public void setIQuackBehaviour(IQuackBehaviour quack) {
		this.quack = quack;
	}
	
	void performfly() {
		this.flyb.fly();
	}
	void performquack() {
		this.quack.quack();
	}
}
