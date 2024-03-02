import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		System.out.println("Eclipseを始めよう");
		
//		next と　nextLine
		Scanner sc = new Scanner("a b c");
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		System.out.println(a); // a
		System.out.println(b); // b
		System.out.println(c); // c
		
		sc = new Scanner("a b c"); // a b c
		String line = sc.nextLine();
		System.out.println(line);
		
		int month;
		month = 2;
		int day = 29;
		System.out.println(month + "月" + day + "日に更新。");
		
		// 配列の宣言
		int[][] array = {{1, 2}, {3, 4}, {5, 6}};
		
		// 浮動小数点の宣言
		double data = 1.234;
		System.out.println(data);
		// 長い浮動小数点はアンダースコアを挿入できる。
		double data2 = 1.234_567_891;
		System.out.println(data2); // 1.234567891
		// double型には整数を入れることもできる。自動型変換。
		double data3 = 0.1;
		data3 = 100;
		System.out.println(data3); // 100.0
		
		// 文字の宣言(シングルクオーテーション)
		char ch = 'a';
		System.out.println(ch);
		// char型はint型の変数に代入できる。自動型変換。文字番号が表示される。
		int number = ch;
		System.out.println(number); //97
		
		// 文字列の宣言
		String str = "文字列";
		System.out.println(str);
		
		// 論理値
		boolean result = true;		
		System.out.println(result);

		// for文　jsと違うのは宣言部分だけかな。
		for (int i = 0; i < 3; i++) {
			int token1 = array[i][0];
			int token2 = array[i][1];
			System.out.println(token1 + token2);
		}
		
		// if文
		String s = "Yes";
		if ( s.equals("Yes")){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
