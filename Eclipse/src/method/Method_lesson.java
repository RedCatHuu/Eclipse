package method;

public class Method_lesson {

	public static void main(String[] args) {
//		mainメソッドがmessageメソッドを呼び出している。
		message();
//		message("Hello!"); messageメソッドと対応できていないのでエラーが起きる。
		puts("Hello!");
		
		System.out.println( calc(1, 2) ); // 3
		
		System.out.println( bmi(70, 180) ); // 21
		
		// 引数が1つ
		System.out.println(menseki(5.5)); // 95.0
		// 引数が2つ
		System.out.println(menseki(5.5, 2)); // 11.0
	}
	
	// messageメソッド
	public static void message() {
		System.out.println("Hello!");
	}
	
	// putメソッド
	public static void puts(String msg) {
		System.out.println(msg);
	}
	
	// 2つの値を足した値を返すメソッド。　voidの代わりに返す値の型を設定(ここではint)
	public static int calc(int x1, int x2) {
		int res = x1 + x2;
		return res;
	}
	
	// bmiを算出
	public static double bmi(double weight, double height) {
		return weight / Math.pow((height / 100), 2);
	}
	
	// メソッドのオーバーロード 引数の数や方が違う場合でもメソッドを実行できるようにするため。
	// 円の面積
	public static double menseki(double hankei) {
		return Math.floor( Math.pow(hankei, 2) * Math.PI );
	}
	// 四角形の面積
	public static double menseki(double height, double width) {
		return height * width;
	}

}
