package test50;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @author VellBibi
 *有200个小朋友拉成一个圆圈，从其中一个小朋友开始依次编号1－200，从1号小朋友开始循环1－3报数，
 *数到3的小朋友就退出。编写一个Java应用程序，计算出最后一个小朋友的号码是多少。
 */
public class Test3Quit {

	/**
	 * @param l 剩下小朋友List
	 * @param n 第n个开始报数
	 * @param m 数到m的人退出
	 * @return 最后一个小朋友的号码
	 */
	public static int play(List<Integer> l, int n, int m){
		int s = l.size();
		if(s <= 1) return l.get(0);
		else {
			n = n + m - 1;
			while(n >= s)
				n = n-s;
			
			l.remove(n);
			return play(l, n, m);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("输入有多少个小朋友:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		List<Integer> l = new ArrayList<Integer>();
		for(int i=1; i<=n; i++){
			l.add(i);
		}
		System.out.println(play(l, 0, 3));
	}

}
