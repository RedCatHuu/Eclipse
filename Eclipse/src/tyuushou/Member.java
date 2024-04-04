package tyuushou;

public abstract class Member {
	private long id;
	private String name;
	protected Member(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	protected abstract int kai_hi(); // 抽象メソッド具体的な内容は継承したサブクラスで定義する。

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
