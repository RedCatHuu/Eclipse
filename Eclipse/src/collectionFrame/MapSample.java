package collectionFrame;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class MapSample {

	public static void main(String[] args) {
		var map = new HashMap<Integer, String>();
		map.put(205, "田中");
		map.put(100, "木村");
		map.put(300, "佐藤");
		System.out.println(map.get(100)); // 木村
		System.out.println(map.get(150)); // null
		map.forEach((k, v) -> System.out.println(k + " " + v));
		/*
		100 木村
		300 佐藤
		205 田中
		 */
		
		// 削除
		map.remove(300);
		map.forEach((k, v) -> System.out.println(k + " " + v));
		// 100 木村
		// 205 田中
		
		
		// 要素の登録順序が保存されるMap
		var map2 = new LinkedHashMap<Integer, String>();
		map2.put(205, "田中");
		map2.put(100, "木村");
		map2.put(300, "佐藤");
		map2.forEach((k, v) -> System.out.println(k + " " + v));
		/*
		205 田中
		100 木村
		300 佐藤
		*/
		
		var map3 = new TreeMap<Integer, String>();
		map3.put(205,  "田中");
		map3.put(100,  "木村");
		map3.put(300,  "佐藤");
		map3.forEach((k, v) -> System.out.println(k + " " + v));
		/*
		100 木村
		205 田中
		300 佐藤
		*/
		
	}

}
