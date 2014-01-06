package test50;

/**
 * @author VellBibi
 *【程序41】 MonkeyPeach.java
 *题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一
 *个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中
 *，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 */
public class MonkeyPeach {

	/**
	 * 获得第n个猴子还没拿桃子时的桃子数
	 * 最后一个猴子拿了m个桃子
	 * @param n
	 * @param m
	 * @return
	 */
	public static int getNum(int n, int m){
		if(n > 5) return m*4;
		else {
			double ans = getNum(n+1, m) / 4.0 * 5 + 1;
			if(ans%1 != 0.0 || ans == 1){//判断结果是否为整数，或者结果不为1
				return 0;
			}else
				return (int)ans;
		}
	}
	
	public static void main(String[] args) {
		int ans = 0;
		for(int i=1; ; i++){
			ans = getNum(1, i);
			if(ans != 0){
				System.out.println("当最后一只猴子拿走" + i + "个桃子时，海滩上原来桃子得到最小值为：");
				System.out.println(ans);
				break;
			}
		}
	}
}
