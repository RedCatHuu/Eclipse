package method;

public class MathClass {

	public static void main(String[] args) {
		// Mathクラスのメソッド
		
		// 平方根
		System.out.println(Math.sqrt(20)); // 4.47213595499958
		
		// べき乗　2の10乗
		System.out.println(Math.pow(2,  10)); // 1024.0
		
		//乱数
		double data = Math.random();
		System.out.println(data); // 0.9228918207230487
		System.out.println(Math.floor(data*10)); // 9.0
		System.out.println(Math.round(data)*10); // 10 long型

	}

}
