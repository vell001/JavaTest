package test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author VellBibi
 *【程序7】 StChar.java 
 *题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 
 *1.程序分析：利用循环,使用Map存储数据.其实完全可以使用4个变量来解决,这边舍近求远复习下Map啦
 */
public class StChar {

	public static Map<Integer, Integer> countChar(String str){
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 0);
		m.put(2, 0);
		m.put(3, 0);
		m.put(4, 0);
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++){
			if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z')
				m.put(1, m.get(1) + 1);
			else if(ch[i] == ' ')
				m.put(2, m.get(2) + 1);
			else if(ch[i] >= '0' && ch[i] <= '9')
				m.put(3, m.get(3) + 1);
			else
				m.put(4, m.get(4) + 1);
		}
		return m;
	}
	
	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));
		String str = null;
		try {
			str = buffer.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Map<Integer, Integer> m = countChar(str);
		Set<Integer> keys = m.keySet();
		Iterator<Integer> it = keys.iterator();
		int n, k;
		while(it.hasNext()){
			k = it.next();
			n = m.get(k);
			switch (k) {
			case 1:
				System.out.println("英文字母: "+n);
				break;
			case 2:
				System.out.println("空格: "+n);
				break;
			case 3:
				System.out.println("数字: "+n);
				break;
			case 4:
				System.out.println("其它字符: "+n);
				break;

			default:
				break;
			}
		}
	}

}
