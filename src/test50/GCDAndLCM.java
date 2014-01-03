package test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author VellBibi
 *【程序6】GCDAndLCM.java后者是辗转相除法 
 *题目：输入两个正整数m和n，求其最大公约数和最小公倍数。 
 *1.程序分析：利用辗除法。 
 *2.辗转相除法基于如下原理：两个整数的最大公约数等于其中较小的数和两数的相除余数的最大公约数。 
 *3.最小公倍数等于两数之积除以最大公约数
 */
public class GCDAndLCM {
	
	/**
	 * 最大公约数普通求法
	 * @param m
	 * @param n
	 * @return 最大公约数
	 */
	public static int getGCDNormal(int m, int n){//最大公约数普通求法
		int i = (m > n ? n : m);
		
		for(; i>1; i--){
			if(m%i == 0 && n%i == 0)
				return i;
		}
		return 1;
	}
	
	/**
	 * 最大公约数辗转相除法
	 * @param m
	 * @param n
	 * @return 最大公约数
	 */
	public static int getGCD(int m, int n){//最大公约数辗转相除法
		if(m%n == 0) return n;
		else return getGCD(n, m%n);//递归辗转相除
	}
	
	/**
	 * 最小公倍数
	 * @param m
	 * @param n
	 * @return 最小公倍数
	 */
	public static int getLCM(int m, int n){
		return (m * n)/getGCD(m, n);//最小公倍数等于两数之积除以最大公约数
	}
	
	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));
		int m = 0, n = 0;
		try {
			m = Integer.parseInt(buffer.readLine());
			n = Integer.parseInt(buffer.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("最小公倍数:" + getLCM(m, n));
		System.out.println("最大公约数:" + getGCD(m, n));
	}
}
