package intafeisu;

public class Tax {
	private long number;
	private String name;
	private int shotoku;
	
	public Tax(long number, String name, int shotoku) {
		this.number = number;
		this.name = name;
		this.shotoku = shotoku;
	}
	
	public int zeigaku(RateIntf r) {
		return (int)(shotoku * r.taxRate(shotoku)); // 所得税額の計算
	}
	
	public long getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getShotoku() {
		return shotoku;
	}
	
	// 表示のためのtoStringメソッド
	@Override
	public String toString() {
		return "Tax [number=" + number + ", name" + name + ", shotoku=" + shotoku + "]";
	}
}