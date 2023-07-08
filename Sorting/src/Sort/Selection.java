package Sort;

public class Selection {
	public static void main(String [] arg) {
		int temp=0;
		int min = 0;
		
		int a[]= {38,53,29 ,1,28,3,5,6,8,30};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for( int i=0; i<a.length;i++) {
			System.out.println(a[i]);
	}
		
	}

}
