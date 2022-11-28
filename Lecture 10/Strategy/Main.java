package Strategy;

public class Main {
	public static void main(String[] args) {
		Bird bird1 = new Bird();
		IFlyBehaviour fly = new FlyWithWings();
		bird1.setFlyBehaviour(fly);
		bird1.performfly();
		
		IQuackBehaviour quack = new Quack();
		bird1.setIQuackBehaviour(quack);
		bird1.performquack();
		
		Bird bird2 = new Bird();
		IFlyBehaviour flys = new FlyWithRocketPower();
		bird2.setFlyBehaviour(flys);
		bird2.performfly();
		
		IQuackBehaviour quac2 = new Model();
		bird2.setIQuackBehaviour(quac2);
		bird2.performquack();
	}
}
