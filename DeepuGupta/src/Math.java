import java.util.Scanner;

public class Math {


	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre number ");

		int x = sc.nextInt();
		
		for (int i = 0; i <= 5; i++) {
			if (i!=5)
		

			System.out.print(java.lang.Math.pow(x, i) + ",");
			else   
				
		System.out.println(java.lang.Math.pow(x, i)+"");   //if enter 2 then 2powe1, 2power2, 2power3...2 power5
			
		}

	}

}
