import java.util.Scanner;

public class Queuedemo {
	static class node {
		int data;
		node next;

		node(int data) {
			this.data = data;
			this.next = null;

		}
	}

	node f = null;
	node r = null;

	void Equeue() {
		System.out.println("enter your data");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		node newnode = new node(data);
		if (f == null) {
			f = newnode;
			r = newnode;
		} else {
			r.next = newnode;
			r = newnode;

		}

	}

	void Dqueue() {
		if (f == null) {
			System.out.println("underflo condition");

		} else {
			 f= f.next;

		}
	}

	void Display() {
		node temp = f;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Queuedemo q = new Queuedemo();
		Scanner sc = new Scanner(System.in);
		int s;
		int a;
		do {
			System.out.println("for equeue press 1");
			System.out.println("for dqueue press 2 ");
			System.out.println("for display press 3");
			System.out.println("chose your option ");
			s = sc.nextInt();
			switch (s) {
			case 1: {
				q.Equeue();
				break;
			}
			case 2: {
				q.Dqueue();
				break;
			}
			case 3: {
				q.Display();
				break;
			}

			}
			System.out.println("press 0 for go to menu ");
			a = sc.nextInt();
		} while (a == 0);

	}
}
