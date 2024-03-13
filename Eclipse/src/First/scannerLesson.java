package First;

import java.util.Scanner;

public class scannerLesson {

	public static void main(String[] args) {
		// 入力された文字列を出力
		System.out.println("キーボードから入力してください。");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("入力された文字は「" + str + "」です。");
		
		// 入力された数字を出力 数字以外を入力するとエラー
		System.out.println("キーボードから入力してください。");
		Scanner s = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("入力された数字は「" + num + "」です。");
	}

}
