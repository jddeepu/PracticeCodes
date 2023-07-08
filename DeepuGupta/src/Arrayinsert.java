import java.util.Scanner;

public class Arrayinsert {
	public static void main(String[] args) {
		int size;
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size");
		size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[size + 1];
		System.out.print("enter element");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("enter index value");
		int n = sc.nextInt();
		System.out.print("enter new element ");
		p = sc.nextInt();
		for (int i = 0; i < size; i++) {
			if (i < n) {
				b[i] = a[i];
			} else if (i == n) {
				b[i]=p;

			} else {
				b[i] = a[i - 1];
			}

		}
		for (int i = 0; i < size+1; i++) {
			System.out.print(b[i] + "  ");
		}

	}
}
