package collectionFrame;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetSample {
	public static void main(String[] args) {
		
		var set = new HashSet<Meibo>();
		set.add(new Meibo(100, "田中"));
		set.add(new Meibo(200, "木村"));
		set.add(new Meibo(100, "田中"));
		set.add(new Meibo(300, "佐藤"));
		set.add(new Meibo(100, "田中")); // 重複した分は登録されない。
		set.forEach(System.out::println);
		
		/*  setは順序関係を持たないデータ構造のため、出力順は入力順ではない。
	 		Meibo[number=200, name=木村]
			Meibo[number=100, name=田中]
			Meibo[number=300, name=佐藤]
		*/
		
		var set2 = new LinkedHashSet<Meibo>();
		set2.add(new Meibo(100, "田中"));
		set2.add(new Meibo(200, "木村"));
		set2.add(new Meibo(100, "田中"));
		set2.add(new Meibo(300, "佐藤"));
		set2.add(new Meibo(200, "田中"));
		set2.forEach(System.out::println);
		
		/*
			Meibo[number=100, name=田中]
			Meibo[number=200, name=木村]
			Meibo[number=300, name=佐藤]
			Meibo[number=200, name=田中]
		 */
		
		
		var set3 = new TreeSet<Meibo>();
		set3.add(new Meibo(300, "田中"));
		set3.add(new Meibo(100, "木村"));
		set3.add(new Meibo(200, "佐藤"));
		set3.forEach(System.out::println);
		
		/*
			Meibo[number=100, name=木村]
			Meibo[number=200, name=佐藤]
			Meibo[number=300, name=田中]
		*/
		
	}
	

	

		
}
