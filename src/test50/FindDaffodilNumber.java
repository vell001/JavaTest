package test50;

/**
 * @author VellBibi
 *【程序3】FindDaffodilNumber.java
 *题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如： 
 *153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
 *1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class FindDaffodilNumber {

	public static boolean isDaffodNumber(int n){
		char[] ch = String.valueOf(n).toCharArray();
		int cup = 0;
		for(int i=0; i<ch.length; i++){
			cup = cup + (int)Math.pow(Integer.parseInt(String.valueOf(ch[i])), 3) ;
		}
		
		return (cup == n);
	}
	
	public static void main(String[] args) {
		for(int i=100; i<1000; i++){
			if(isDaffodNumber(i)){
				System.out.print(i + ",");
			}
		}
	}

}
