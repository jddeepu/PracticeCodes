import java.util.Scanner;

public class switch2 {

	public static void main(String args[]) {
		char operator ;
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("chose any symbol  for  add sbubtract multiply divide");
		operator = sc.next().charAt(0);
		System.out.println("enter first no");
		a = sc.nextInt();
		System.out.println("enter second no");
		b = sc.nextInt();

		switch (operator) {
		case '+':
			c = a + b;
			System.out.println("Addition=" +c);

			break;
		case '-':
			c = a - b;
			System.out.println("sub=" + c);
			break;
		case '*':
			c = a * b;
			System.out.println("mul=" + c);
			break;
		case '/':
			c=a/b;
			System.out.println("div=" + c);
			break;
		default:
			System.out.println("not found element");
		}

	}

}