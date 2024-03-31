package First;

public class innerClass {
	private int number;
	public innerClass(int number) {
		this.number = number;
	}
	
	public void print() {
		Inner inner = new Inner();
		System.out.println(inner.msg());
	}
	
	private class Inner {
		public String msg() {
			return "number is " + number; // innerClass(アウタークラス)のフィールドを使用できる。
		}
	}
}
