
public class Bubbleshort {

	public static void main(String[] args) {
		int[] a = { 15, 16, 6, 8 };
		int temp;
		int flage = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
 
				
				
				
				if (a[j] > a[j + 1]) {

					
					temp = a[j];

					a[j] = a[j + 1];

					a[j + 1] = temp;
					flage = 1;
				}

			}
			if (flage == 0) {
				break;
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");

		}
	}

}
