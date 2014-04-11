package arithmetic;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = {6,5,42,3,2,4,67,7,2,9,4};
		a = sort(a, 0, a.length-1);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}
	
	public static int[] sort(int[] a, int low, int high){
		if(low < high){
			int p = partition(a, low, high);
			sort(a, low, p-1);
			sort(a, p+1, high);
		}
		return a;
	}
	
	public static int partition(int[] a, int low, int high){
		int key = a[low];
		while(low < high){
			while(low < high && a[high] >= key) high--;
			a[low] = a[high];
			while(low < high && a[low] <= key) low++;
			a[high] = a[low];
		}
		a[low] = key;
		return low;
	}
}
