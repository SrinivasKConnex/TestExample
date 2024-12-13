package learnOOPs;

public class Dog extends Animal {

	public Dog(String s) {
		super("Dog");
		System.out.println("dog constructer:" + s);
	}

	void sound() {
		super.sound();
		System.out.println("dog bark");

	}

}
