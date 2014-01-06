package test50;

import java.util.Scanner;

/**
 * @author VellBibi
 *【程序39】 Test2.java
 *题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数
 *1/1+1/3+...+1/n(利用指针函数)
 *注：java里面貌似没有指针函数吧！这个题是不是C++的啊！我就不纠结指针函数了，实现功能就行了 
 */
public class Test2 {

	/**
	 * 一个函数搞定两种情况
	 * @param n
	 * @return
	 */
	public static double sum(int n){
		double ans = 0;
		int i = 1;
		if(n%2 == 0)
			i = 2;
		
		for(; i<=n;i=i+2){
			ans = ans + 1.0/i;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		System.out.println(sum(n));
	}
}
