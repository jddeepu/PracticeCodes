import java.util.Scanner;

public class Delet_element {
	public static void main(String[] arg) {
		int size, location;
		Scanner sc = new Scanner(System.in);

		System.out.print("enter array size");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter element in array");
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
		System.out.print("delet element locatiopn");

		location = sc.nextInt();
		for (int i = location; i < size-1; i++) {
			a[i] = a[i + 1];

		}
		for (int i = 0; i < a.length-1; i++) {

			System.out.print(a[i] + "  ");

		}
	}
}
