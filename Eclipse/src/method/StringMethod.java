package method;

public class StringMethod {

	public static void main(String[] args) {
		String str = "superman";
		
		System.out.println(str.length()); // 8
		System.out.println(str.charAt(3)); // e
		
		String str2 = "superman";
		System.out.println(str.equals(str2)); // true
		
		str2 = "supermans";
		System.out.println(str2.indexOf("s")); // 0
		System.out.println(str2.lastIndexOf("s")); // 8
		
		// jsのreplaceと違い、正規表現を使わなくても全置換となる。
		System.out.println( str2.replace("s", "5") ); // 5uperman5
		// 正規表現を使うには以下の通り。ただし全置換。
		System.out.println( str2.replaceAll("[s]", "5") ); // 5uperman5
		// 最初だけを変えたいなら以下。
		System.out.println(str2.replaceFirst("[s]", "5")); // 5upermans
		
		// substring
		System.out.println( str2.substring(1, 3)); // up
		
		// repeat ()内の回数文繰り返す。
		System.out.println( str2.repeat(2)); // supermanssupermans
		
		// strip 文字列の前後の空白を除去
		String str4 = "  space sp     ";
		System.out.println( str4.strip()); // "space sp"
		
		
		//文字配列
		String[] ary;
		String str3 = "abc/def/ghi";
		ary = str3.split("/");
        for (String s : ary) {
            System.out.println(s);
        }
		
	}

}
