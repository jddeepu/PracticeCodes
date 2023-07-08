import java.util.ArrayList;
import java.util.LinkedList;

public class LLuse {
	public static void main (String []args) {
		//constructor
		
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add(20);
		al.add(30);
		
		LinkedList obj= new LinkedList(al);
		
		obj.add(0,"Ram");
		obj.add(1,"Abhi");
		obj.add(2,"12");
		obj.add(3,"10");  
		obj.add(4,"Aman");
		        
		System.out.print(obj  );
	
		obj.remove(0);
				System.out.print(obj);
		
	
		
		
		
		
	}

}

