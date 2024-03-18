package First;

public class useTax {

	public static void main(String[] args) {
		// Taxクラスで作成したオブジェクトからインスタンスを作成。
		Tax tax = new Tax(100, "田中", 300000, 100000);
		System.out.println(tax.zeigaku() ); // 20000

	}

}
