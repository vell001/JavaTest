package test50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author VellBibi
 *【程序25】 HuiWenShu.java
 *题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class HuiWenShu {
	
	/**
	 * 分解数字
	 * @param n
	 * @return
	 */
	public static List<Integer> explodeNumber(long n){
		List<Integer> l = new ArrayList<Integer>();
		
		long cup = n;
		while(cup != 0){
			l.add((int) (cup%10));
			cup = cup/10;
		}
		
		return l;
	}
	
	public static void main(String[] args) {
		System.out.println("输入一个数:");
		Scanner s = new Scanner(System.in);
		long n = 0;
		if(s.hasNext()) n = s.nextLong();
		
		List<Integer> l = explodeNumber(n);
		Integer[] a = (Integer[])l.toArray(new Integer[]{});
		for(int i=0; i<=a.length/2; i++) {
			if(!a[i].equals(a[a.length-i-1])){
				System.out.println("不是回文");
				return;
			}
		}
		System.out.println("是回文");
	}
}
