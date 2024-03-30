package First;

public class Joining {
	private String csv;
	private String delimiter;
	
	public Joining(String csv, String delimiter) {
		this.csv = csv; // csv形式の文字列
		this.delimiter = delimiter; // 区切り文字
	}
	
	// コンストラクタのオーバーロード。引数を指定しない場合の初期値の設定。
	// delimiterだけ指定した場合、csvは初期値として空文字を設定。
	public Joining(String delimiter) {
		this.csv = "";
		this.delimiter = delimiter;
		
		/*簡易表現
		 * this("", delimiter);
		 */
	}
	
	// どっちも指定しない場合。
	public Joining() {
		this.csv = "";
		this.delimiter = ",";
		
		/*簡易表現
		 * this("", ",");
		 */
	}
	
	
	// メソッド
	public void add(String s) { // sを連結するメソッド
		csv += csv.isEmpty() ? s : delimiter + s;
	}
	public String getCsv() { // csv文字列を返すメソッド
		return csv;
	}

}
