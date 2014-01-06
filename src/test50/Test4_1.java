package test50;

/**
 * @author VellBibi
 *【程序42】 Test4.java
 *题目：809*??=800*??+9*??+1
 *其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。 
 */
public class Test4_1 {

	public static void main(String[] args) {
		for(int i=10; i<100; i++){
			for(int j=10; j<100 && 8*j<100; j++){
				for(int l=10; l<100 && 9*l<1000; l++){
					if(809*i == 800*j + 9*l + 1){
						System.out.println("809*"+i+" == 800*"+j+"+ 9*"+l+" + 1");
						System.out.println("809*??后的结果" + i*809);
						return;
					}
				}
			}
		}
		System.out.println("没有符合的数");
	}
}
