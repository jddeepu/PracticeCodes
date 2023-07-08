import java .util.Scanner;



public class LLd {
static class node{
	int data;
	node next;
	node (int data ){
		this.data =data;
		this.next= null;
		
	}
}
node head = null;

public void creation () {
	int data ;
	int t ;
	do {
	Scanner sc =new Scanner (System.in);
	System.out.print("enter data this linklist ");
	data = sc.nextInt();
	node new_node =new node(data);
	if (head==null) {
		head=new_node;
	
	}
	else {
		node temp= head;
		while (temp.next!=null) {
			
		
		temp =temp.next; 
		}
		temp.next=new_node;
		}
	
	System .out.print("do you want enter elementyes press 1");
	
	
	t=sc.nextInt();
	}
	while(t==1);
	this.Delet();
}

void Delet() {

	if (head == null) {
		System.out.print("link list iare not exist");

	} else {
		//node temp = head;
		//temp=temp.next;
		//head=temp;
		//end delet
		node temp = head ;
		node ptr=temp.next;
		while(ptr.next!=null) {
			temp=ptr;
		ptr=ptr.next;
		}      
		temp.next = null;
	}
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
	LLd obj = new LLd();
	obj.creation();
	obj.traverser();
	obj.Delet();
}

}

