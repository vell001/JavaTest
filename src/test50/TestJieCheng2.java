package test50;

/**
 * @author VellBibi
 *【程序21】TestJieCheng.java 
 *题目：求1+2!+3!+...+20!的和 
 *1.程序分析：此程序只是把累加变成了累乘。
 */
public class TestJieCheng2 {

	/**
	 * 求n的阶乘
	 * @param n
	 * @return
	 */
	public static long jieCheng(int n){
		if(n == 1) return 1;
		else return jieCheng(n-1)*n;
	}
	
	public static void main(String[] args) {
		System.out.println(jieCheng(5));
	}
}
