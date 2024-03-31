package First;

// Joiningクラスをstaticメンバだけで書き換えたもの
public class staticJoining{
	private static String csv;
	private static 	String delimiter;
	
	public static void init(String _csv, String _delimiter) {
		csv = _csv;
		delimiter = _delimiter;
	}
	
	public static String add(String s) {
		csv += csv.isEmpty() ? s : delimiter + s;
		return csv;
	}
	
	public static String getCsv() {
		return csv;
	}

}