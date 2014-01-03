package test50;

/**
 * @author VellBibi
 *题目：取一个整数a从右端开始的4～7位。
 */
public class Ex32 {

	/**
	 * 从a里面取出从右端开始的m～n位
	 * @param a
	 * @param m
	 * @param n
	 * @return
	 */
	public static int[] getNum(int a, int m, int n){
		int[] ans = new int[n-m+1];
		for(int i=1,j=0; j<ans.length && a>0;i++){
			if(i>=m && i<=n){
				ans[j] = a%10;
				j++;
			}
			a = a / 10;
		}
		return ans;
	}
	
	public static void printArray(int[] a){
		for(int i=a.length-1; i>=0; i--){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int a = 123456789;
		int[] ns = getNum(a, 4, 7);
		System.out.println(a);
		printArray(ns);
	}
}
