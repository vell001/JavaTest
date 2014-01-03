package test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author VellBibi
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 * 1.程序分析：舍近求远，练习容器，可以使用List容器很简单实现。
 */
public class Sort {

	public static List<Double> readDouble(String str, String sp){
		List<Double> l = new ArrayList<Double>();
		int j = 0;
		for(int i=0; i<str.length(); i++){
			if(str.substring(i, i+1).equalsIgnoreCase(sp) ){
				l.add(Double.parseDouble(str.substring(j, i)));
				j = i + 1;
			}
		}
		return l;
	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Double> l = null;
		try {
			System.out.println("输入数据，如:1,2,3,4,");
			l = readDouble(br.readLine(), ",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(l.isEmpty());
		Collections.sort(l);
		Iterator<Double> it = l.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
	}

}
