

public class employee {
	int a; // constructot
	String b;

	employee(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String args[]) {
		employee e1 = new employee(5, "deepak");
		employee e2 = new employee(6, "deepu");

		System.out.println("employee 1: " + e1.a + " " + e1.b);
		System.out.println("employee 2: " + e2.a + " " + e2.b);

	}
}
