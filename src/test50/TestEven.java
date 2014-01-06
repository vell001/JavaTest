package test50;

import java.util.Scanner;

/**
 * @author VellBibi
 *【程序44】 TestEven.java
 *题目：一个偶数总能表示为两个素数之和。
 */
public class TestEven {

	/**
	 * 判断n是不是质数
	 * @param n
	 * @return
	 */
	public static boolean isPrimeNumber(int n){
		if(n < 2)return false;
		
		for(int i=2; i<n; i++){
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		if(n%2 != 0){
			System.out.println("输入的不是偶数");
			return;
		}
		
		for(int i=2; i<n; i++){
			if(isPrimeNumber(i) && isPrimeNumber(n - i)){
				System.out.println(n + " = " + i + "+" + (n-i));
				return;
			}
		}
	}
}
