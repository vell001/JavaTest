package test50;

import java.util.Scanner;

/**
 * @author VellBibi
 *【程序38】 TestLength.java
 *题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 */
public class TestLength {

	public static int getLength(String str){
		return str.toCharArray().length;
	}
	
	public static void main(String[] args) {
		System.out.println("输入你的字符串：");
		String str = new Scanner(System.in).next();
		System.out.println("你的字符串长度为:"+getLength(str));
	}

}
