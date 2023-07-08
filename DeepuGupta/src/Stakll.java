import java.util.Scanner;

public class Stakll {

	static class node {
		int data;
		node next;

		node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	node top = null;

	public void push() {
		System.out.print("enter data");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		node newnode = new node(data);
		if (top == null) {
			top = newnode;
		} else {
			newnode.next = top;
			top = newnode;
		}
	}

	void pop() {
		if (top == null) {
			System.out.print("empty");
		} else {
			top = top.next;
		}
	}

	void display() {
		node temp = top;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}

}

class Deepak {
	public static void main(String args[]) {
		int d;

		Stakll s = new Stakll();
		Scanner sc = new Scanner(System.in);

		int m;
		do {
			System.out.println("press 1to push");
			System.out.println("press2 to pop");
			System.out.println("press 3 to display");
			System.out.println("enter your select");

			d = sc.nextInt();

			switch (d) {
			case 1: {
				s.push();
				break;

			}
			case 2: {
				s.pop();
				break;
			}
			case 3: {
				s.display();
				break;
			}

			}
			System.out.print("enter 0 to go back to the main menu");
			System.out.print("enter any key to exit");
			m = sc.nextInt();
		} while (m == 0);
		System.out.print("exit successfully");

	}
}

