package test50;

/**
 * @author VellBibi
 *【程序19】LingXing.java 
 *题目：打印出如下图案（菱形） 
   *
  ***
 *****
*******
 *****
  ***
   *
 *1.程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重 for循环，第一层控制行，第二层控制列。
 */
public class LingXing {

	public static void print(int n){
		int i = 0;
		int j = 0;
		for(i=0; i<n; i++){//前四行
			for(j=0; j<n+i;j++){
				if(j < n-i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1; i<n; i++){//后三行
			for(j=0; j<(2*n-i-1); j++){
				if(j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		print(4);
	}
}
