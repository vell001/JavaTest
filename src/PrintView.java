import java.util.Scanner;


/**
 * @author VellBibi
 *编写程序根据用户输入的整数来在屏幕上产生图形（必须使用循环）：
　　　　　输入7时:                 
　　　　    *
     * *
    *   *
   *     *
  *       *
 *         *
*           *
 *         *
  *       *
   *     *
    *   *
     * *
      *
 */
public class PrintView {

	public static void print(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n+i; j++){
				if(j == n-i-1 || j == n+i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<n-1; i++){
			for(int j=0; j<2*(n-1)-i; j++){
				if(j == i+1 || j == 2*(n-1)-i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		print(n);
	}

}
