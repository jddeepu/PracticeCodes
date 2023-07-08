import java.util.Scanner;

public class Double_LL {
	class node {
		int data;
		node next;
		node previous;

		node(int data) {
			this.data = data;
			this.next = null;
			this.previous = null;

		}
	}

	node head = null;
	node tail = null;

	public void creation() {
		int n; 
		int p;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("enter data this nonde");

			int data = sc.nextInt();

			node new_node = new node(data);

			if (head == null) {
				head = new_node;
				tail = new_node;
			} else {
			//	System.out.print("enter the position of node");
				//p=sc.nextInt();
				 head.previous = new_node;
				new_node.next = head;
				 head = new_node;
				// tail.next=new_node;
				// new_node.previous=tail;
				// tail=new_node;
				//any position
				//node temp=head;
			//node ptr=temp.next;
			//for( int i=0; i<p-1;i++) {
			 //temp.next=new_node;
			 //new_node.previous=temp;
			// ptr.previous=new_node;
			// new_node.next=ptr.previous;
			}
			
			System.out.print("for add data press 2");

			n = sc.nextInt();

		}while(n==2);
		this.Delet();

	}

	public void Delet() {
		 //starting  delet
		//node temp=head;
		//temp= temp.next;
		//head=temp;
		node temp= tail;
		temp=temp.previous;
		tail=temp;
		temp.next=null;
head. previous=null;
	}

	public void traiverse() {
		if (head == null) {
			System.out.print("link lisi are not exist");

		} else {
			node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "   ");
				temp = temp.next;
			}

		}
	}

	public static void main(String args[]) {
		Double_LL obj = new Double_LL();
		obj.creation();
		obj.traiverse();
	}

}
