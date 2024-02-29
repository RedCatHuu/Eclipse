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

	}

}
