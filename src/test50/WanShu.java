package test50;

/**
 * @author VellBibi
 *【程序9】 WanShu.java 
 *题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完数。
 */
public class WanShu {

	public static boolean isWanShu(int a){
		int cup = 0;
		for(int i=1; i<a; i++){
			if(a%i == 0)
				cup = cup + i;
		}
		return (cup == a);
	}
	
	public static void main(String[] args) {
		for(int i=1; i<1000; i++){
			if(isWanShu(i)){
				System.out.print(i + ",");
			}
		}
	}

}
