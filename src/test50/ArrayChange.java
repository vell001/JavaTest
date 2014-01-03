package test50;

/**
 * @author VellBibi
 *【程序35】 ArrayChange.java
 *题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class ArrayChange {

	public static void sort(int[] a){//类似冒泡排序
		int cup = 0;
		int l = a.length-1;
		for(int i=1; i<a.length-1; i++){
			if(a[i] > a[0]){
				cup = a[i];
				a[i] = a[0];
				a[0] = cup;
			}
			if(a[i] < a[l]){ 
				cup = a[i];
				a[i] = a[l];
				a[l] = cup;
			}
		}
	}
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{2,3,5,1,2,34,1,0,24};
		printArray(a);
		sort(a);
		printArray(a);
	}
}
