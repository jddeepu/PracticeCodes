public class over {
                                                                             //overloading       
	void show( String a){

		System.out.println("2");

	}

	void show() {

		System.out.println("3");

	}

	public void main(String args[]) {
		over obj = new over();
		obj.show();
	}

} 