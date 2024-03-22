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
	
	// ゲッター
	public int zeigaku() {
		return (int)(( shotoku - koujo) * 0.1);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getShotoku() {
		return shotoku;
	}

	public int getKoujo() {
		return koujo;
	}
	
	// セッター
	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShotoku(int shotoku) {
		this.shotoku = shotoku;
	}

	public void setKoujo(int koujo) {
		this.koujo = koujo;
	}
	
}
