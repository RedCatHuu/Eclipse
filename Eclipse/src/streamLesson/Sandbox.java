package streamLesson;

import java.util.List;

record Department(String name, List<String> employees) {}

public class Sandbox {

	public static void main(String[] args) {
		var list = List.of("banana", "orange", "peach", "apple", "pineapple");
		list.stream() // ストリームの生成
			.filter(e -> e.length() < 6)
			.map(String::toUpperCase)
			.forEach(System.out::println); // 終端操作
		
		var list2 = List.of("banana", "orange", "peach", "apple", "pineapple");
		var result = list2.stream()
				.filter(e -> e.length() >= 6)
				.map(String::toUpperCase)
				.toList();
		System.out.println(result); // [BANANA, ORANGE, PINEAPPLE]
		
		var list3 = List.of("apple", "peach", "grape", "apple", "banana", "peach");
		list3.stream()
			.distinct()
			.sorted()
			.forEach(e -> System.out.print(e + " ")); // apple banana grape peach 
		System.out.println("");
		
		var list4 = List.of("apple", "peach", "grape", "watermelon", "banana", "cherry");
		list4.stream()
			.skip(3)
			.limit(2)
			.forEach(e -> System.out.print(e + " ")); // watermelon banana
		System.out.println("");
		
		// 1文字目が"w"でない間、要素を捨て続ける。
		list4.stream()
			.dropWhile(e -> e.charAt(0) != 'w')
			.forEach(e -> System.out.print(e + " ")); // watermelon banana cherry 
		System.out.println("");
		
		// 1文字目が"w"出ない間、要素を送り続ける。
		list4.stream()
			.takeWhile(e -> e.charAt(0) != 'w')
			.forEach(e -> System.out.print(e + " ")); // apple peach grape 
		System.out.println("");
		
		// 文字数計
		int total = list4.stream()
			.mapToInt(String::length)
			.sum();
		System.out.println( "総文字数=" + total); // 総文字数=37
		
		// map
		var list5 = List.of(
				new Department("総務", List.of("田中", "木村")),
				new Department("経理", List.of("佐藤", "斎藤")),
				new Department("営業", List.of("山本", "藤田", "山田")) );
		
		list5.stream()
			.map(Department::employees) // ゲッターのemployees()を使って、Departmentレコードから社員名のListのストリームに変換しています。
			.flatMap(List::stream) // この行をコメントアウトすると、 [田中, 木村] [佐藤, 斎藤] [山本, 藤田, 山田] 
			.forEach(e -> System.out.print(e + " ")); // 田中 木村 佐藤 斎藤 山本 藤田 山田 
		System.out.println("");
		
		list5.stream()
			.mapMulti( (e, buf) ->{
				var ls = e.employees(); // listの取得
				ls.forEach( name -> buf.accept(name) ); // bufにnameをため込んでいる。
			})
			.forEach( name -> System.out.print( name + " ")); // 田中 木村 佐藤 斎藤 山本 藤田 山田 
		
		
		var list6 = List.of("apple", "peach", "watermelon");
		list.stream()
			.peek(e -> System.out.print(e + " ")) // 処理の途中で要素を出力。
			.map(String::toUpperCase)
			.forEach(e -> System.out.println(e));		
		/*
		orange ORANGE
		peach PEACH
		apple APPLE
		pineapple PINEAPPLE
		 */

	}

}
