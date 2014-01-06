package test50;

import java.util.Scanner;

/**
 * @author VellBibi
 *【程序49】 TestString2.java
 *题目：计算字符串中子串出现的次数 
 */
public class TestString2 {

	/**
	 * 在str1中查找str2的个数
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static int findString(String str1, String str2){
		int count = 0;
		char[] chs1 = str1.toCharArray();
		char[] chs2 = str2.toCharArray();
		for(int i=0,j=0; i<chs1.length; i++){
			for(j=0; j<chs2.length; j++){
				if(chs1[i+j] != chs2[j])
					break;
			}
			if(j == chs2.length){//完全匹配
				count++;
				i = i + j - 1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("输入字符串:");
		String str1 = s.next();
		System.out.println("输入要查找的字符串:");
		String str2 = s.next();
		
		System.out.println("查找到的个数：" + findString(str1, str2));
	}
}
