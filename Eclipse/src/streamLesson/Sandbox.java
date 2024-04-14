package streamLesson;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

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
		
		
		// 終端処理
		var list7 = Book.getBookList();
		var myList = list7.stream().collect(Collectors.toList()); // 可変リスト
		var mySet = list7.stream().collect(Collectors.toSet()); // 可変set
		var myLinkedList = list7.stream()
				.collect(Collectors.toCollection(LinkedList::new));
		
		// 可変Map
		var list8 = Book.getBookList();
		var myMap = list8.stream()
				.limit(3)
				.collect( Collectors.toMap(Book::title, Book::price) );
		System.out.println(myMap); // {高瀬舟=500, 三四郎=300, 坊ちゃん=400}
		myMap.forEach( (k, v) -> System.out.println(k + " " + v) );
		/*
		高瀬舟 500
		三四郎 300
		坊ちゃん 400
		 */
		
		// 価格が最大の本 optional
		Optional<Book> book = list8.stream()
				.max( Comparator.comparing(Book::price) );
		System.out.println(book); // Optional[Book[title=吾輩は猫である, author=夏目漱石, price=600]]
		System.out.println( book.orElseGet( Book::new) ); // Book[title=吾輩は猫である, author=夏目漱石, price=600]
		
		// sum average max
		int total2 = list8.stream()
				.mapToInt(Book::price)
				.sum();
		OptionalDouble ave = list8.stream()
				.mapToInt(Book::price)
				.average();
		OptionalInt max = list8.stream()
				.mapToInt(Book::price)
				.max();
		System.out.println( "合計額 = " + total2); // 合計額 = 2000
		System.out.println( "平均額 = " + ave.orElse(0)); // 平均額 = 400.0
		System.out.println( "最高額 = "+ max.orElse(0)); // 最高額 = 600
		
		//　文字列連結
		String titles = list8.stream()
				.map(Book::title)
				.collect(Collectors.joining(","));
		System.out.println(titles); // 坊ちゃん,高瀬舟,三四郎,舞姫,吾輩は猫である
		
		// 分類 groupingBy
		var book_author = list8.stream()
				.collect(Collectors.groupingBy(Book::author));
		book_author.forEach( (k, v) -> {
			System.out.println(k);
			v.forEach(System.out::println);
		});
		/*
		夏目漱石
		Book[title=坊ちゃん, author=夏目漱石, price=400]
		Book[title=三四郎, author=夏目漱石, price=300]
		Book[title=吾輩は猫である, author=夏目漱石, price=600]
		森鴎外
		Book[title=高瀬舟, author=森鴎外, price=500]
		Book[title=舞姫, author=森鴎外, price=200]
		*/
		
		var book_author2 = list8.stream()
				.collect(Collectors.groupingBy(
						Book::author,
						Collectors.mapping(Book::title, Collectors.toList())
						));
		System.out.println(book_author2); // {夏目漱石=[坊ちゃん, 三四郎, 吾輩は猫である], 森鴎外=[高瀬舟, 舞姫]}
		book_author2.forEach( (k, v) -> {
			System.out.println(k);
			String titles2 = v.stream().collect(Collectors.joining(","));
			System.out.println(" " + titles2);
		});
		/*
		夏目漱石
		 坊ちゃん,三四郎,吾輩は猫である
		森鴎外
		 高瀬舟,舞姫
		 */
		
		
		
	}

}
