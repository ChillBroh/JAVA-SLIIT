package lec_4;

public class Animal_main {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.eat();
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.eat();
		cat.makeSound();
	}
	
}
