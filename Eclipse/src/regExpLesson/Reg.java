package regExpLesson;

public class Reg {
	public static void test(String reg, String... strs) { // strsは複数の文字列を一度にテストできるよう、可変長引数 
		String sb = reg + "    ";
		for(String s : strs) {
			boolean match = s.matches(reg);
			sb += (match ? "〇 " : "× ") + s + "    ";
		}
		System.out.println(sb);
	}

}
