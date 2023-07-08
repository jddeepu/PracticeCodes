
interface Printable {

	public void print();

}

class A6 implements Printable {
	public void print() {

		System.out.println("sonhan shiv tira");

	}

	public static void main(String args[]) {
		Printable obj = new A6();
		obj.print();
//or ham A6 ka object banakar call kara sakte HAI 
		
	}
}