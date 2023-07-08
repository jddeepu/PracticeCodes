import java.util.Scanner;

public class LL {
	static class node {
		int data;
		node next;

		node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	node head = null;

	public void creation() {
		int data, m;
		int p;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("enter data");

			data = sc.nextInt();

			node new_node = new node(data);

			if (head == null) {
				head = new_node;
			} else {
				// System.out.print("enter position of nodeto be inserted");
				// 10
				// p=sc.nextInt();
				node temp = head;
				// new_node.next= head;
				// head=new_node;

				while (temp.next != null) {
					// for (int i = 0; i < p -2; i++) {
					temp = temp.next;

				}

				temp.next = new_node;
			}

			System.out.print("do you want add more if yes press 1");
			m = sc.nextInt();
		} while (m == 1);
	}

	public void traverser() {
		node temp = head;
		if (head == null) {
			System.out.print("link list are not exist");
		} else {
			while (temp != null) {
				System.out.print(temp.data + "   ");
				temp = temp.next;
			}
		}

	}
	public static void main(String args[]) {
		LL obj = new LL();
		obj.creation();
		obj.traverser();

	}

}
