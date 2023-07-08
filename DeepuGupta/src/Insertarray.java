import java.util.Scanner;

public class Insertarray {
	public static void main(String[] args) {
		int n; int count =0;
		Scanner sc = new Scanner(System.in); 
		System.out.print("enter array size");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("enter element");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
System.out.print("put value of x  which you are want  found index");
		int x = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				count++;
		
			}
			
		
		}
		if (count>0) {
			System.out.println("item found "+count+"times");
		}
		else {
			System.out.println("item not found ");
		}
	}
}
