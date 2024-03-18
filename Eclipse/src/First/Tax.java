package First;

public class Tax {
	// フィールド定義
	// privateにすると他のプログラムからはアクセスできない。逆はpublic
	private int number;
	private String name;
	private int shotoku;
	private int koujo;
	
	// コンストラクタ
	public Tax(int number, String name, int shotoku, int koujo) {
		this.number = number;
		this.name = name;
		this.shotoku = shotoku;
		this.koujo = koujo;
	}

	public int zeigaku() {
		return (int)(( shotoku - koujo) * 0.1);
	}
}
