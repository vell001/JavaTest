package test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author VellBibi
 *【程序5】 ConditionOperator.java 
 *题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。 
 *1.程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */
public class ConditionOperator {

	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));
		int N = 0;
		try {
			N = Integer.parseInt(buffer.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("学习成绩为：" + ((N < 60) ? "C" : (N < 90) ? "B" : "A"));
	}

}
