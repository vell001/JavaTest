package test50;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author VellBibi
 *【程序50】TestStu.java
 *题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算 
 *出平均成绩，况原有的数据和计算出的平均分数存放在磁盘文件"stud"中。
 */
public class TestStu {

	public static void main(String[] args) {
		int n = 5;//人数
		Scanner s = new Scanner(System.in);
		String[] num = new String[n];
		String[] name = new String[n];
		float[][] grade = new float[n][3];
		float[] ave = new float[n];
		//输入数据
		for(int i=0; i<n; i++){
			System.out.print("学号:");
			num[i] = s.next();
			System.out.print("姓名:");
			name[i] = s.next();
			for(int j=0; j<3; j++){
				System.out.print("第"+(j+1)+"门课成绩:");
				grade[i][j] = s.nextFloat();
			}
		}
		//处理数据
		for(int i=0; i<n; i++){
			for(int j=0; j<3; j++){
				ave[i] += grade[i][j];
			}
			ave[i] /= 3;
		}
		//写入文件
		try {
			FileWriter fw = new FileWriter(new File("d://stud.txt"));
			BufferedWriter bw  = new BufferedWriter(fw);
			for(int i=0; i<n; i++){
				bw.write("学号:" + num[i] + "  ");
				bw.write("姓名:" + name[i] + "  ");
				bw.write("成绩:{  ");
				for(int j=0; j<3; j++){
					bw.write(grade[i][j] + "  ");
				}
				bw.write("} ");
				bw.write("平均成绩: " + ave[i]);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
