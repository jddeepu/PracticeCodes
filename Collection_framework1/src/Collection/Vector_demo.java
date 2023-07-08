package Collection;

import java.util.Enumeration;
import java.util.Vector;    
//isme bas forword hopta hai isme remove nahi hota  hai element
/*
JDK 1.0
in this version are provides  we can store the data /object 
vector ,stack, Hastable poopesties sictionary(remodify class is ligace class)
JDK 1.2version 
in this version collection framework  was introduce introduce 

property
vector allow dublicate element

*/
public class Vector_demo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add("shivam");
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.set(0, "abhay");
		System.out.println(v);
	
	//	v.remove(0);
	//	System.out.println(v);
		System.out.println(v.lastElement());
	
		System.out.println("capacity=" +v.capacity());//agar 10 ke under rahte hai to capacity 10 batata hai 11 , 12..20 tak 20 capacity batata ahi
		
/*
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

		}
		*/
	}
}
