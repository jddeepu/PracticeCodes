package Collection;

/* Set: isme size fixed nahi hota hai    

isme index base element nahi hota hai 
set cannot allow dublicat element
set can store only one null
set does not follow the insertion order
isme ListIterator nahi  hota hai 
ye ek sequance me nahi print kata hai*/
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setdemo {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		
		
		System.out.println(s);
		/*
		Iterator itr = s.iterator (); //ise likhne se ek coloum me print hota hai
		 while (itr.hasNext()) { System.out.println(itr.next());
		 */

	}
}
