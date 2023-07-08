package Sort;

public class Bubbll_sort {
	public static void main(String[] args) {
		int a[] = { 7, 3, 9, 5, 1, 8 };
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length -1-i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");

		}
	}
}