package First;

public class useTax {

	public static void main(String[] args) {
		// Taxクラスで作成したオブジェクトからインスタンスを作成。
		Tax tax = new Tax(100, "田中", 300000, 100000);
		System.out.println(tax.zeigaku() ); // 20000
		
		System.out.println("納税者番号=" + tax.getNumber());
		System.out.println("氏名=" + tax.getName());
		System.out.println("所得額=" + tax.getShotoku());
		System.out.println("控除額=" + tax.getKoujo()); // 控除額=100000
		
		System.out.println("所得税=" + tax.zeigaku());
		tax.setKoujo(120000);
		System.out.println("控除額=" + tax.getKoujo()); // 控除額=120000
		System.out.println(tax.zeigaku()); // 18000
		
		Tax t2 = new Tax(100, "たなか", 280000, 120000);
		if(tax.equals(t2)) {
			System.out.println("等しい"); // 等しい
		}
		
		System.out.println(tax.hashCode()); // 131
		System.out.println(t2.hashCode()); // 131
		
	}

}
