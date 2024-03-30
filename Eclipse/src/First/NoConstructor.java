package First;

public class NoConstructor {
	//フィールドを初期化する必要のないクラス。そのためコンストラクタは不要
	private int number; // 既定の初期値として0がセットされる。
	private String str="***";
	
	public int getNumber() {
		return number;
	}
	public String getStr() {
		return str;
	}

}
