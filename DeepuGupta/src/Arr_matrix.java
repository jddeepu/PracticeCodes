import java.util.Scanner;

public class Arr_matrix {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("row");
		int row = sc.nextInt();
		System.out.print("coloum");
		int coloum = sc.nextInt();
		int[][] a = new int[row][coloum];
		int[][] b = new int[row][coloum];
		int[][] c = new int[row][coloum];

		System.out.print("make first  matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				a[i][j] = sc.nextInt();

			}
		}
		System.out.print("second matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				b[i][j] = sc.nextInt();

			}

		}
		System.out.print("first matrix print");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				System.out.print(a[i][j] + "  ");

			}
			System.out.println();
		}

		System.out.print("second matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				System.out.print(b[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.print("sum of two matrix ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				c[i][j] = a[i][j] + b[i][j];

				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
