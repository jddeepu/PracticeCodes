package Collection;

/* List: isme size fixed hota ha i 
 isme index base element hota hai 
 list can store dublicate element   
 isme ListIterator hota hai 
 ye ek sequance me print kata hai*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listdemo {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(100);
		l.add(200);
		l.add(300);
		System.out.println(l);

		// l.remove(0);
		// System.out.println(l);
		/*
		 * Iterator itr = l.iterator (); //ise likhne se ek coloum me print hota hai
		 * while (itr.hasNext()) { System.out.println(itr.next());
		 * 
		 */

		ListIterator itr = l.listIterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

		// itr.next();//inse cursur niche aata hai aur wahi se opposit direction me print
		// hota hai
		// itr.next();
		// itr.next();
		/*
		 * System.out.println("-----------------"); while (itr.hasPrevious()) {
		 * System.out.println(itr.previous());
		 * 
		 * 
		 * }
		 */
	}

}
