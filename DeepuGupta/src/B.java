
public class B {
	B show () {
		System.out.println( "this method B");
		return this;
	}
	public static void main (String args []) {
		B ob = new B ();
	
		ob.A();
		ob.B();
		
	}
	


}
