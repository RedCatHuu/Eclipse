package First;
import java.util.Scanner;

public class switchLesson {

	public static void main(String[] args) {
		System.out.println("ひらがなで星座を入力してください。");
		String fname = "";
		Scanner scan = new Scanner(System.in);
		String seiza = scan.next();
		
		switch(seiza) {
			case "おひつじざ" -> fname = "aries";
			case "おうしざ" -> fname = "taurus";
			case "ふたござ" -> fname = "gemini";
			case "かにざ" -> fname = "cancer";
			case "ししざ" -> fname = "leo";
			case "おとめざ" -> fname = "virgo";
			case "てんびんざ" -> fname = "libra";
			case "さそりざ" -> fname = "scorpio";
			case "いてざ" -> fname = "sagittarius";
			case "やぎざ" -> fname = "capricorn";
			case "みずがめざ" -> fname = "aquarius";
			case "うおざ" -> fname = "pisces";
			default -> {
				System.out.println("入力エラー");
				
			}
		}
		System.out.println(seiza + "を英訳すると" + fname + "です。");
		
	}
	
}
