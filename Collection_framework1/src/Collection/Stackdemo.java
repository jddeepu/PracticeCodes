package Collection;

import java.util.Iterator ;
import java.util.Stack;

public class Stackdemo {
	public static void main (String[]args) {
		Stack s=new Stack();
		s.push(1000);
		s.push("ravishek");
		s.push(100.10);
		s.push(10);
		
		System.out.println(s);
		s.pop();
		System.out.println(s);
	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
		
		
	}
	}
}
