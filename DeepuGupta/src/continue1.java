

public class continue1 {
	public static void main(String args[]) {
		int i;
		i = 0;
		while (i <= 10) {
			i++;
			
			if (i == 5)
				continue;
			System.out.println(i);
		}
		System.out.println(" execution done ");

	}
}
