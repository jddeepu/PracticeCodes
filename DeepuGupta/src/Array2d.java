
public class Array2d {
	public static void main(String args[]) {

		int a[][] = { { 2, 3, 4 }, { 3, 7, 8 }, { 9, 0, 8 } };
        int b[][]= {{2,3,4},{6,5,4},{0,9,8}};
        //array size
        int c[][]=new int[3][3];
        
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				
 c[i][j]=  a[i][j]+b[i][j];
 
				System.out.print(c[i][j] + " ");

			}
			System.out.println();
			
		}

	}
}