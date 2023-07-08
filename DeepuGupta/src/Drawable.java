
interface Drawable {
	void draw() ;
	
		
	}
class Rectangle implements Drawable{
	
	public void draw () {
		
		System.out.println ("drawing rectangle");
		
	}
	
}
class Circular extends Rectangle {
	public void draw () {
		System.out.println("drawing circle");
		
	}
	public static void main (String args []) {
		Rectangle obj = new Rectangle ();
		obj. draw();
		Circular obj1 = new Circular ();
		obj1.draw();
	}
}



