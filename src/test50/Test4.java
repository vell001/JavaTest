package test50;

/**
 * @author VellBibi
 *【程序42】 Test4.java
 *题目：809*??=800*??+9*??+1
 *其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。 
 */
public class Test4 {

	public static void main(String[] args) {
		for(int i=10; i<100 && 8*i<100 && 9*i<1000; i++){
			if(809*i == (800*i + 9*i + 1)){
				System.out.println("??代表的两位数:" + i);
				System.out.println("809*??后的结果" + i*809);
				return;
			}
		}
		System.out.println("没有符合的数");
	}
}
