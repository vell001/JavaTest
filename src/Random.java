import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



public class Random {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<100; i++){
			list.add((int)(50*Math.random()+1));
		}
		Map<Integer, Integer> map = sort(list);
		
		System.out.println("奇数:" + map.get(1));
		System.out.println("偶数:" + map.get(2));
	}
	
	public static Map<Integer, Integer> sort(List<Integer> list){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 0);
		map.put(2, 0);
		Iterator<Integer> it = list.iterator();
		Integer cup = null;
		System.out.print("{");
		while(it.hasNext()){
			cup = it.next();
			if(cup%2 != 0){//
				map.put(1, map.get(1)+1);
			}else{
				map.put(2, map.get(2)+1);
			}
			System.out.print(cup+",");
		}
		System.out.println("}");
		return map;
	}
}
