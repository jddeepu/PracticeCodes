import java.util.Scanner;

public class Array_delet {
	public static void main(String[] arg) {
		System.out.print("enter size array");
		int size, pos;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[size - 1];
		System.out.print("enter element in array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("delet position");
		pos = sc.nextInt();
		for (int i = 0; i < size; i++) {  //index name- 0    1   2   3   4
			if (i < pos) {                                          // 10 20 30 40 50
				b[i] = a[i];
			} else if (i == pos) { 
				continue;
			} else {                //indx name-  1   2   3   4      
				b[i - 1] = a[i];                    // 10 20 40 50
			}
		}
		System.out.println("element are");
		for (int i = 0; i < size - 1; i++) {
			System.out.println(b[i] + "   ");
		}
	}

}
