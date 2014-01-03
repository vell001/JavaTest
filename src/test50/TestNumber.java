package test50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author VellBibi
 *【程序24】TestNumber.java
 *题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class TestNumber {

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
		System.out.println("给一个不多于5位的正整数:");
		Scanner s = new Scanner(System.in);
		long n = 0;
		if(s.hasNext()) n = s.nextInt();
		
		List<Integer> l = explodeNumber(n);
		System.out.println("它是"+l.size()+"位数");
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
	}
}
