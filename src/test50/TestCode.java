package test50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author VellBibi
 *【程序48】 TestCode.java
 *题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字 
 *都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 */
public class TestCode {
	
	public static void encrypt(int[] a){
		int cup = 0;
		for(int i=0; i<4; i++){
			a[i] = (a[i] + 5) % 10;
		}
		cup = a[0];
		a[0] = a[3];
		a[3] = cup;
		
		cup = a[1];
		a[1] = a[2];
		a[2] = cup;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[4];
		for(int i=0; i<4; i++){
			System.out.print("输入第"+(i+1)+"位数：");
			a[i] = s.nextInt();
		}
		encrypt(a);
		System.out.println("加密后:");
		for(int i=0; i<4; i++){
			System.out.print(a[i]);
		}
	}
}
