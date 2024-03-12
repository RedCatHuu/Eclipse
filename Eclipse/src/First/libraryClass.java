package First;
/**
 * ユーティリティクラス
 * <p>
 * 便利なメソッドを集めたクラスです。<br>
 * これからもいろいろなメソッドを追加していきます。
 * 
 * @autor RedCatHuu
 */
public class libraryClass {
	// ここにあるメソッドは、クラス名.メソッド名の形で他のプログラムから呼び出せる。
	/**
	 * 四角形の面積の算出
	 * 
	 * @param a　底辺
	 * @param b　高さ
	 * @return 四角形の面積
	 */
	public static double menseki(double a, double b) {
		return a * b;
	}
	
	/**
	 * BMIの算出
	 * 
	 * @param w
	 * @param h
	 * @return　BMI値
	 */
	public static double bmi(double w, double h) {
		return w / Math.pow(h/100, 2);
	}

}
