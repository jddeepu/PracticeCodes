
public class Animal {
	public void eat() {

		System.out.println("i am eating");

	}

	public static void main(String args[]) {

		Animal buzo = new Animal();
		bird ob = new bird();
		buzo.eat();
		buzo.run();
		ob.fly();
	}

	public void run() {
		System.out.println("i am very fast run");

	}

}

class bird {
	public void fly() {
		System.out.println("bird fly in the sky");

	}
}