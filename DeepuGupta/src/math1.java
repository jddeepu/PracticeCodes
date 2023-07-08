import java.util.Scanner;

public class math1 { // 10 to 20
	public static void main(String[] arg) {
		Scanner ob = new Scanner(System.in);

		System.out.println("enter numberof a");

		double a = ob.nextDouble();

		System.out.println("enter number of b");
		double b = ob.nextDouble();
		System.out.println("enter number of c");
		double c = ob.nextDouble();

		double x = (-b - java.lang.Math.sqrt(b * b - 4 * a * c) / 2.0 * a);
		System.out.println("get value of a" + x);

	}

}
