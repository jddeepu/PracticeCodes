import java.util.Scanner;

public class Queue_array {

	int f = -1;
	int r = -1;
	int n = 10;
	int i;
	int a[] = new int[n];

	void Equeue() {
		if (r == (n - 1)) {
			System.out.println("overflow codition");

		}

		else {
			System.out.println("enter data ");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			if (f == -1 & r == -1) {
				f = 0;
				r = 0;
				a[r] = i;
			} else {
				r = r + 1;
				a[r] = i;

			}
		}
	}

	void Dqueue() {
		if (r == -1 & f == -1) {
			System.out.println("under flow condition");
		} else {
			f = f + 1;
		}
	}

	void display() {
		System.out.println("item are ");
		for (int i = f; i <= r; i++) {

			System.out.println(a[i]);
		}
	}

	public static void main(String args[]) {
		int d;

		Queue_array s = new Queue_array();
		Scanner sc = new Scanner(System.in);

		int m;
		do {
			System.out.println("press 1to Equeue");
			System.out.println("press2 to Dqueue");
			System.out.println("press 3 to display");
			System.out.println("enter your choice");

			d = sc.nextInt();

			switch (d) {
			case 1: {
				s.Equeue();
				break;
			}
			case 2: {
				s.Dqueue();
			}
			case 3: {
				s.display();
			}

			}
			System.out.print("enter 0 to go back to the main menu");
			System.out.print("enter any key to exit");
			m = sc.nextInt();
		} while (m == 0);
		System.out.print("exit successfully");

	}

}
