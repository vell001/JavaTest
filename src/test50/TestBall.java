package test50;

/**
 * @author VellBibi
 *【程序10】TestBall.java 
 *题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 *1.程序分析:递归实现
 */
public class TestBall {

	public static double sumBallHeight(double h, int n){
		if(n == 1) return h/2;
		else return sumBallHeight(h/2, n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(sumBallHeight(100, 10));
	}

}
