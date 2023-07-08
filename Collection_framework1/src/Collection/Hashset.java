package Collection;

import java.util.HashSet;
import java.util.Iterator;
//isme dublicate object nahi hota hai 
public class Hashset {
public static void main (String[]args) {
	HashSet<String>set=new HashSet<String>();
	set.add("deepak");
	set.add("ravi");
	set.add("vicky");
	set.add("Akhilesh");
	set.add("nitesh");
	set.add("shreyansh");
	set.add("shreyansh");
	System.out.println(set);
	System.out.println(set.size());
	System.out.println(set.contains("vicky"));
	System.out.println(set.contains("pari"));
	set.remove("deepak");
	System.out.println(set);

	Iterator it=set.iterator();
	/*
	while(it.hasNext()) {
		System.out.println(it.next());
		*/
	
	
	it.next();
	it.next();
	
		while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
