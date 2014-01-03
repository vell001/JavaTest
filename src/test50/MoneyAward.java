package test50;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author VellBibi
 *【程序12】 MoneyAward.java
 *题目：企业发放的奖金根据利润提成。
 *利润(I)低于或等于10万元时，奖金可提10%；
 *利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 *20万到40万之间时，高于20万元的部分，可提成5%；
 *40万到60万之间时高于40万元的部分，可提成3%；
 *60万到100万之间时，高于60万元的部分，可提成1.5%，
 *高于100万元时，超过100万元的部分按1%提成，
 *从键盘输入当月利润I，求应发放奖金总数？ 
 *1.程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
 */
public class MoneyAward {

	public static double sumMoneyAward(double i){
		if(i <= 10){
			return i * 0.1;
		}else if(i < 20){
			return ((i - 10) * 0.075 + 1);
		}else if(i < 40){
			return (i - 20) * 0.05;
		}else if(i < 60){
			return (i - 40) * 0.03;
		}else if(i < 100){
			return (i - 60) * 0.015;
		}else{
			return (i - 100) * 0.001;
		}
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double I = 0;
		try {
			System.out.println("请输入当月利润I：(单位：万)");
			I = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("奖金总数:" + sumMoneyAward(I) + "万");
	}

}
