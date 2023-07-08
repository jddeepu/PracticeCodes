
public class Aa { // inheritance

	public void methodA() {

		System.out.println("a class method");
	}

	public static void main(String args[]) {

		C obj = new C();
		obj.methodA();
		obj.methodB();
		obj.methodc();

	}

}

class B extends Aa {

	public void methodB() {
		System.out.println("b class method");

	}

}


class C extends B {
	public void methodc() {
		System.out.println("c class method");

	}

}
