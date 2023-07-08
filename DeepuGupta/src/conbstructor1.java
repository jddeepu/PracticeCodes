
public class conbstructor1 {
	int a;
	int b;
	int c;

	conbstructor1(int a, int b, int c) {
		this.a = a;
		this.b = b;
		a = c + b;
		System.out.print(a);

	}

	public static void main(String args[]) {
		conbstructor1 ob = new conbstructor1(10, 20, 100);

		{

		}
	}
}
