import java.util.Scanner;

public class CLL {

	static class node {
		int data;
		node next;

		node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	node head = null;
	node tail = null;

	public void creation() {
		int data, m;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("enter data");

			data = sc.nextInt();

			node new_node = new node(data);

			if (head == null) {
				head = new_node;
				tail = new_node;
				new_node.next = head;
			} else {
				new_node.next = head;
				head = new_node;
				tail = new_node.next;

			}

			System.out.print("do you want add more if yes press 5");
			m = sc.nextInt();
		} while (m == 5);
	}

	public void traverser() {
		node temp = head;
		if (head == null) {
			System.out.print("link list are not exist");
		} else {
		
			do{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			while(temp!=head);
			
			
		}	}
	public static void main(String args[]) {
		CLL obj = new CLL();
		obj.creation();
		obj.traverser();

	}

}
