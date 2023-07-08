package Collection;

import java.util.Deque;
import java.util.PriorityQueue;

public class Queue {
	public static void main (String[]args) {  
	
		PriorityQueue<Integer>q=new PriorityQueue<>();
	
	q.add(10);
	q.add(20);
	q.add(30);
	q.add(40);
	q.add(50);
	q.add(60);
	q.add(70);
	q.add(80);
	q.add(90);
	q.add(100);
	System.out.println(q);
	System.out.println(q.poll()); //poll ka matlam retrive hoga aur delet bhi hoga  
	                                           //peek me bas retrive hoga 
	System.out.println(q);
	System.out.println(q.remove(q));
	System.out.println(q);
q.remove(50);

System.out.println(q);
	
	

		
	
	}

}
