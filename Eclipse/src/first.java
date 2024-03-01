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
