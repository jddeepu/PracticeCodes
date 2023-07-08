
public class Mergesort {
	public static void conquer( int arr[], int si,int mid, int ei  ) {
	int merge[]	= new int [ ei-si+1];
	int idx1=si;     // ye pahla jo suru hoga si(suruaati point  se) 
	int idx2=mid+1;     //jo suru hoga ei (ending ) se 
	int x=0;
	
	while (idx1<=mid && idx2<=ei){
		if (arr [idx1]<=arr[idx2]) {
			merge [x]=arr[idx1];
		      x++; idx2++;
		}
			else {
				merge [x++]= arr[ idx2++];
				
			}
			
		}
	while (idx1<=mid ) {
			merge [x++]=arr[idx1++];
			
		}
		while(idx2<=mid) {
			merge[x++]=arr[idx2++];
		}
		for (int i=0, j=si; i<merge.length; i++, j++) { 
			
		arr[j]=  merge[i];
	
	}

	public static void divide(int arr[], int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2; // si+/2
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		conquer(arr, si, mid, ei);
	}

	public static void main(String arg[]) {
		int arr[] = { 6, 3, 9, 5, 2, 8 };
		int n = arr.length;
		divide(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);

		}
		System.out.println();

	}

}
