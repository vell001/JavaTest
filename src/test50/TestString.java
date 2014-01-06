package test50;

import java.util.Scanner;

/**
 * @author VellBibi
 *【程序46】 TestString.java
 *题目：两个字符串连接程序
 *注：转换成数组的连接,实际使用String.concat()
 */
public class TestString {

	public static String connextString(String str1, String str2){
		byte[] buf = new byte[str1.length() + str2.length()];
		str1.getBytes(0, str1.length(), buf, 0);
		str2.getBytes(0, str2.length(), buf, str1.length());
		return new String(buf);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("输入第一个字符串:");
		String str1 = s.next();
		System.out.println("输入第二个字符串:");
		String str2 = s.next();
		System.out.println("合并后：");
		System.out.println(connextString(str1, str2));
	}
}
