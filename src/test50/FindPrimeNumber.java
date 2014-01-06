package test50;

/**
 * @author VellBibi
 * 【程序2】 FindPrimeNumber.java
 *题目：判断101-200之间有多少个素数，并输出所有素数。
 *1.程序分析：判断素数的方法：用一个数分别去除2~sqrt(n)或者2~n/2,常用2~n/2，
 *因为一个数的一半的平方大于其本身是从5开始的，解方程：n/2的平方>n .如果能被整除， 
 *则表明此数不是素数，反之是素数。
 */
public class FindPrimeNumber {

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
		int n = 0;
		for(int i=101; i<=200; i++){
			if(isPrimeNumber(i)){
				n++;
				System.out.print(i+",");
			}
		}
		System.out.println("\n101-200之间有"+n+"个素数");
	}
}
