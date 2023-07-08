
public class Inheritance {
	void showA() {
		System.out.println("A is good");

	}

	class B extends Inheritance {

		void showB() {
			System.out.println("Bis good");
		}

		void showc() {

			System.out.println("c is good");
		}

		public static void main(String args[]) {
			Inheritance ob1 = new Inheritance();
			ob1.showA();

			B ob2 = new B();
			ob2.showA();
			ob2.showB();

		}
	}
}