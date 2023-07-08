package Quesation;

public class Boardmas {
	public static void main (String[]args ) {
	int sum =0;
	int a[]= {10,20,30,40,50};
for (int i=0;i<=a.length-1;i++){
	sum=sum+a[i];
	
	System.out.println(sum);

}
//find avrage
	int D=sum/a.length;
	System.out.println("Avarge="+D);


	}
}
