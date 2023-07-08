abstract class bike {
	abstract void run();

}

class eng extends bike {

	public void run() {

		System.out.println("breAK, GAIR clauch");

	}
}

class hero extends eng {

	public void run() {

		System.out.println("running fast");
		
	}

	public static void main(String args[]) {

	//bike h=new eng();             rafrance
	//h.run();

		hero obj1 = new hero();
		eng obj2 = new eng();
	obj2.run();
	obj1.run();

}}
