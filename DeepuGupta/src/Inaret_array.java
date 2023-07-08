import java .util.Scanner;
public class Inaret_array {
	public static void main(String[] arg) {
		System.out.print("enter size array");
		int size, pos, insert_element;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[size + 1];
		System.out.print("enter element in array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("insert index position");
		pos = sc.nextInt();
		System.out.print("insert new element  index position");
		insert_element=sc.nextInt();
		for (int i = 0; i < size+1; i++) {  
			if (i < pos) {                                         
				b[i] = a[i];     
			}
			else if (i == pos) { 
			b[i]=insert_element;
			} else {                     
				b[i] = a[i-1];                 
			}
		}
		System.out.println("element are");
		for (int i = 0; i < size+1; i++) {
			System.out.println(b[i] + "   ");
		}
	}

}
