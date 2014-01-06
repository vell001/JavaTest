package test50;

/**
 * @author VellBibi
 *【程序43】 Test5.java
 *题目：求0—7所能组成的奇数个数。
 * 注：当有一位数时：有1.3.5.7这4个奇数
 *  当有两位数时：最高为有7种（除0）选择，最低为有4（1.3.5.7为奇数的条件）种  总数为4*7
 *  当有三位数时：最高为有7中（除0）选择，第二位有8中选择，最后一位4种（1.3.5.7） 总数 4*8*7
 *  当有四位数时：最高为有7中（除0）选择，第三位有8中选择，第二位有8中选择，最后一位4种（1.3.5.7） 总数 4*8*8*7
 */
public class Test5 {
	
	public static void main(String[] args) {
		int cup = 7*4;//二位数
		int count = cup + 4;
		for(int i=2; i<8; i++){
			cup = 8*cup;
			count = count + cup;
		}
		System.out.println("0—7所能组成的奇数个数:" + count);
	}
}
