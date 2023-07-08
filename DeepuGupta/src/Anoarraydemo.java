
public class Anoarraydemo {

	public static void sum(int[] no) {
		int total = 0;
		for (int i : no) {
			total = total + i;

		}
		System.out.print("sum is  "   + total);

	}

	public static void main(String[] args) {

		Anoarraydemo.sum(new int[] { 20,23,23,123,1231 });

	}
}