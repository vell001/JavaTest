package test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author VellBibi
 *【程序8】 TestAdd.java 
 *题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。 
 *1.程序分析：关键是计算出每一项的值。
 */
public class TestAdd {
	
	public static long sumAdd(int a, int n){
		long cup = 0;
		long ans = 0;
		for(int i=0; i<n; i++){
			cup = 0;
			for(int j=0; j<=i; j++){
				cup = cup + a * (long)Math.pow(10, j);
			}
			ans = ans + cup;
		}
		return ans;
	}

	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));
		int n = 0;
		try {
			n = Integer.parseInt(buffer.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sumAdd(2, n));
	}
}
