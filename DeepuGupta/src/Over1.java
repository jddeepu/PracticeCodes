
public class Over1 {
void show() {
		System.out.println("1");
	}
}
class Over2 extends Over1 {
	void show() {
		System.out.println(2);
	}
	public static void main(String args[]) {
		Over1 ob = new Over1();
		ob.show();
		Over2 ob1 = new Over2();
		ob1.show();
	}
}
