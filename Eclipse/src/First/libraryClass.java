package First;

public class libraryClass {
	// ここにあるメソッドは、クラス名.メソッド名の形で他のプログラムから呼び出せる。
	public static double menseki(double a, double b) {
		return a * b;
	}
	
	public static double bmi(double w, double h) {
		return w / Math.pow(h/100, 2);
	}

}
