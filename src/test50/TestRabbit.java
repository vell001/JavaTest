package test50;

/**
 * @author VellBibi
 * 【程序1】 TestRabbit.java
 *题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的总兔子对数为多少？ 
 *1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21...
 */
public class TestRabbit {

	/**
	 * @param m 总月数
	 * @return 这月兔子对数
	 */
	public static int sumRabbitNumber(int m){
		int n = 1;//第0个月对数
		int e = 0;//第0个月对数
		int cup = 0;
		for(int i=1; i<m; i++){
			cup = n;
			n = e + n;
			e = cup;
		}
		return n;
	}
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++){
			System.out.print(sumRabbitNumber(i)+",");
		}
	}

}
