package test50;

import java.util.Scanner;

/**
 * @author VellBibi
 *【程序47】 TestPrint.java
 *题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。
 */
public class TestPrint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[7];
		for(int i=0; i<7; i++){
			System.out.print("输入第"+(i+1)+"个整数：");
			a[i] = s.nextInt();
		}
		
		for(int i=0; i<7; i++){
			for(int j=0; j<a[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
