package First;

import java.util.ArrayList;

public class records {

	// オブジェクト(インスタンス)を作成できる。
	public record Meibo(int number, String name, String mail) {}
	
	public static void main(String[] args) {
		
		Meibo meibo = new Meibo(100, "田中", "t@t");
		System.out.println(meibo); // Meibo[number=100, name=田中, mail=t@t]		
		System.out.println(meibo.number()); // 100
		System.out.println(meibo.name()); // 田中
		System.out.println(meibo.mail()); // t@t
		
		// 可変リスト
		// 文字列型の配列
		var list = new ArrayList<String>();
		System.out.println(list); // []
		list.add("apple");
		list.add("banana");
		list.add("grape");
		System.out.println(list); // [apple, banana, grape]
		
		for(String item : list) {
			System.out.println(item);
		}
		
		// 要素数
		System.out.println(list.size()); // 3
		
		// 指定した要素の取得
		System.out.println(list.get(1)); // banana
		
		// 指定した要素を含むか判定
		System.out.println(list.contains("grape")); // true
		
		// 指定したインデックスの要素を削除。返り値は削除した要素
		System.out.println(list.remove(2)); // grape	
		System.out.println(list); // [apple, banana]
		
		// 要素の全削除
		list.clear();
		System.out.println(list); // []
		
		// 要素が空か判定
		System.out.println(list.isEmpty()); // true
		
		
		
		
	}
}
