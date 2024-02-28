import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		System.out.println("Eclipseを始めよう");
		
//		next と　nextLine
		Scanner sc = new Scanner("a b c");
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc = new Scanner("a b c");
		String line = sc.nextLine();
		System.out.println(line);

	}

}
