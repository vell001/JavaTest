package test50;

/**
 * @author VellBibi
 *【程序41】 MonkeyPeach_1.java
 *题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一
 *个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中
 *，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 *1.程序分析：采取直接验证结果的方式
 */
public class MonkeyPeach_1 {

	public static boolean isRight(int n) {
		for(int i=0; i<5; i++) {
			if(n % 5 == 1) {
				n = n - 1;
				n = n - n / 5;
			}else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		for(int n=1; ; n++) {
			if(isRight(n)) {
				System.out.println("海滩上原来桃子得到最小值为：" + n);
				return;
			}
		}
	}

}
