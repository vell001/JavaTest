package test50;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author VellBibi
 * 【程序4】Explode.java 
 *题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 
 *程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成： 
 *(1)运用两层循环
 *(2)外循环得到2~n之间的所有质数，内循环将n循环除以质数，知道不能整除
 *(3)要是内循环n等于1了就说明n被完全整除了
 */
public class Explode {
	
	/**
	 * 判断n是不是质数
	 * @param n
	 * @return
	 */
	public static boolean isPrimeNumber(int n){
		
		if(n == 2) return true;
		
		for(int i=2; i<=n/2; i++){
			if(n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));
		int N = 0;
		try {
			N = Integer.parseInt(buffer.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print(N+"=");
		for(int i=2; i<N; i++){
			if(!isPrimeNumber(i)) continue;
			while(N%i == 0){
				System.out.print(i);
				N = N/i;
				if(N != 1) System.out.print("*");
				else break;
			}
		}
		if(N != 1) System.out.println(N);
	}

}
