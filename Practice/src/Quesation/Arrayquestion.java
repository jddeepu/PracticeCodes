package Quesation;

import java.util.Scanner;

public class Arrayquestion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("row ");
		int row = sc.nextInt();
		System.out.println("coloum");
		int coloum = sc.nextInt();
		int a[][] = new int[row][coloum];
		int b[][] = new int[row][coloum];

		System.out.println("make 1 matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				a[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				System.out.print(a[i][j] +"  ");
				

			}
			System.out.println();
		}
		System.out.println("second matrix ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				b[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				System.out.print(b[i][j] +"  ");
			
			}
			System.out.println();
		}
		
	}
}
