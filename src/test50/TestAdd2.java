package test50;

/**
 * @author VellBibi
 *【程序20】TestAdd2.java
 *题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 *1.程序分析：请抓住分子与分母的变化规律。
 */
public class TestAdd2 {

	public static double add(int n){
		double ans = 0;
		double a = 2;
		double b = 1;
		double cup = 0;
		for(int i=0; i<n; i++){
			ans = ans + a/b;
			cup = a;
			a = a + b;
			b = cup;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(add(20));
	}

}
