package test50;

import java.util.Scanner;

/**
 * @author VellBibi
 *【程序36】 Array1.java
 *题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数 
 */
public class Array1 {

	public static void move(int[] a, int m){
		for(int i=a.length-2*m-1; i>=0; i--){//前面n-2*m个数
			a[i+m] = a[i];
		}
		for(int i=0; i<m; i++){
			a[a.length-m+i] = a[i];
		}
	}
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5,6,7,8,9};
		printArray(a);
		System.out.println("输入m:");
		int m = new Scanner(System.in).nextInt();
		move(a, m);
		printArray(a);
	}

}
