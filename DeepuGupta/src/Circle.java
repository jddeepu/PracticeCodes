class Circle extends Rectangle {
	public void draw () {
		System.out.println("drawing circle");
		
	}
	public static void main (String args []) {
		Rectangle obj = new Rectangle ();
		obj. draw();
		Circle obj1 = new Circle ();
		obj1.draw();
	}
}
