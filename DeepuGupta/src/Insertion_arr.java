
public class Insertion_arr {

	public static void main(String[] arg) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int position = 2;
		int element = 10000;

		for (int i = a.length - 1; i > position - 1; i--) {
			a[i] = a[i - 1];

		}
 
		a[position - 1] = element;

	
	for (int i=0; i<a.length;i++) {
		System.out.print(a[i]  +"  "  );
	}
}}