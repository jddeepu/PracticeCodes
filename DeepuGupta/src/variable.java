
public class variable {
		
	
		int a =1200; //instance variable
		
		static int b= 100;         //static variable
		
		
		public static void main (String args []) {
 variable ob1 = new variable ();                     //below all statement local variable
 
 
 System.out.println( "a="+ ob1.a);
 System.out.println("b="+ob1.b);
	   
 
 ob1.a=1000;
 ob1.b =1500;
 System.out.println("a="+ob1.a  );
 System.out.println("b=" +ob1.b);
 
 variable ob2 =new variable();
System.out.println ("a="+ob2.a);
System.out.println("b="+ob2.b);

		}
		
	}

