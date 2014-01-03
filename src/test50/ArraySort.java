package test50;

/**
 * @author VellBibi
 *【程序30】 ArraySort.java
 *题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。 
 *1. 程序分析：使用二分法
 */
public class ArraySort {

	/**
	 * 往a里插入n(二分法)
	 * @param a
	 * @param n
	 */
	public static int[] addNumber(int[] a, int n){
		int i=0, j=a.length-1;
		int cup = 0;
		if(a[j]<n) cup = j+1;
		else if(a[i]>n) cup = i;
		else{
			while(j-i>1){
				cup = (i + j) /2;
				if(n > a[cup]){//n大于中间数
					i = cup;
				}else if(n < a[cup]){
					j = cup;
				}else{
					break;
				}
			}
			cup = j;
		}
		
		//插入n
		int[] newa = new int[a.length+1];
		for(i=0,j=0; i<newa.length; i++){
			if(i == cup){
				newa[i] = n;
			}else{
				newa[i] = a[j];
				j++;
			}
		}
		return newa;
	}
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{2,3,5,6,7,9,12,16};//已经排好序的数组
		a = addNumber(a, 10);
		printArray(a);
	}
}
