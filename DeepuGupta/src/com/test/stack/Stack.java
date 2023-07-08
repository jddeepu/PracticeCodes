package com.test.stack;

import java.util.Scanner;

public class Stack {

	int top = -1;
	int n = 10;
	int a[] = new int[n];

	public void push() {
		if (top == n - 1) {
			System.out.print("overflow");

		} else {
			System.out.print("enter data");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			top = top + 1;
			a[top] = i;
			System.out.print("item inserted");
		}

	}

	void pop() {
		if (top == -1) {
			System.out.print("underflow");
		} else {
			top = top - 1;
			System.out.print("item deleted");
		}
	}

	void display() {
		System.out.print("item are");
		for (int j = top; j >= 0; j--) {

			System.out.print(a[j]);
		}
	}

	public static void main(String args[]) {
		int d;

		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);

		int m;
		do {
			System.out.println("press 1to push");
			System.out.println("press2 to pop");
			System.out.println("press 3 to display");
			System.out.println("enter your choice");

			d = sc.nextInt();

			switch (d) {
			case 1: {
				s.push();
				break;
			}
			case 2: {
				s.pop();
			}
			case 3: {
				s.display();
			}

			}
			System.out.print("enter 0 to go back to the main menu");
			System.out.print("enter any key to exit");
			m = sc.nextInt();
		} while (m == 0);
		System.out.print("exit successfully");

	}

}
