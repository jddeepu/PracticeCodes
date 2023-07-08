import java.util.Scanner;

public class Insertion {
	public static void main(String[] args) {
		int size, loc, item;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size ");
		size = sc.nextInt();
		int a[] = new int[size + 1];
		System.out.print("enter array elementr");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter array location");
		loc = sc.nextInt();
		System.out.print("enter new item");
		item = sc.nextInt();
		for (int i = size; i > loc; i--) {
			a[i] = a[i - 1];
		}
		a[loc] = item;
		size++;
		for (int i = 0; i < size; i++) {
			System.out.println(a[i] + "  ");

		}
	}
}