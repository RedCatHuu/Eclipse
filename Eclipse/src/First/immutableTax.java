package First;

// インスタンス作成後の変更不可
public final class immutableTax {
	private final Id id;
	private final int shotoku;
	private final int koujo;
	
	public immutableTax(Id id, int shotoku, int koujo) {
		this.id = id;
		// immutableTaxクラスを真にimmutableにするには、以下の通り、idにコピーを渡す。
//		this.id = new Id(id.getNumber(), id.getName());
		this.shotoku = shotoku;
		this.koujo = koujo;
	}
	
	public int zeigaku() {
		return (int) ((shotoku - koujo) * 0.1);
	}

	public Id getId() {
		return id;
//		return new Id(id.getNumber(), id.getName());
		
	}

	public int getShotoku() {
		return shotoku;
	}

	public int getKoujo() {
		return koujo;
	}	
	
	// セッターは無し。
	
	@Override
	public String toString() {
		return "immutableTax [id=" + id + ", shotoku=" + shotoku + ", koujo=" + koujo + "]";
	}

}
