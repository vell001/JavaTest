package test50;

import java.util.Scanner;

/**
 * @author VellBibi
 *【程序40】 Test3.java
 *题目：字符串排序。
 *注:把字符串转成char，进行排序 
 */
public class Test3 {

	/**
	 * 冒泡排序
	 * @param str
	 * @return
	 */
	public static String bubbleSort(String str){
		boolean flag = true;
		char[] chs = str.toCharArray();
		char cup = 0;
		for(int i=0; i<str.length()-1 && flag; i++){
			flag = false;
			for(int j=0; j<str.length()-1-i; j++){
				if((int)chs[j+1] < (int)chs[j]){
					flag = true;
					cup = chs[j+1];
					chs[j+1] = chs[j];
					chs[j] = cup;
				}
			}
		}
		return new String(chs);
	}
	
	public static void main(String[] args) {
		String str = new Scanner(System.in).next();
		System.out.println(bubbleSort(str));
	}
}
