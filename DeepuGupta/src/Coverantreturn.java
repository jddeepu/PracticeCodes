
class Coverantreturn {

	void show() {

		System.out.println("this method a");

	}

	public static void main(String args[]) {

		Coverantreturn ob = new XYZ();
		ob.show();
		XYZ obj =new XYZ ();
		obj. show();

	}
}

class XYZ extends Coverantreturn {

	void show() {

		System.out.println("this method b");

	}

}
