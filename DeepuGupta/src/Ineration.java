
public class Ineration {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int position = 2;
		int element = 1000;

		for (int i = a.length-1; i > position; i--) {

			a[i] = a[i - 1];

		}
		a[position] = element;

		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
 
		}

	}

}
