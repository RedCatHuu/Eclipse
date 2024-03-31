package First;

public class sandbox {

	public static void main(String[] args) {
		Joining j = new Joining(" ");
		j.add("apple");
		j.add("banana");
		j.add("peach");
		System.out.println(j.getCsv()); // apple banana peach
		
		NoField nf = new NoField(); // デフォルトコンストラクタを使用している
		nf.println(); // NoFieldクラス
		
		NoConstructor nc = new NoConstructor();
		System.out.println(nc.getNumber()); // 0
		System.out.println(nc.getStr()); // ***
		
		staticJoining.init("", ","); // 初期化 インスタンスを作成しなくても使用できる。
		staticJoining.add("apple");
		staticJoining.add("banana");
		staticJoining.add("peach");
		System.out.println(staticJoining.getCsv()); // apple,banana,peach
		
		Id id = new Id(100, "田中");
		immutableTax itax = new immutableTax(id, 300000, 10000);
		System.out.println(itax); // immutableTax [id=Id [number=100, name=田中], shotoku=300000, koujo=10000]
		itax.getId().setNumber(200);
		// immutableTax自体は不変で、他のidインスタンスを代入することはできないが、idのメンバフィールドをセッターで変更することは可能。
		System.out.println(itax); // immutableTax [id=Id [number=200, name=田中], shotoku=300000, koujo=10000]
		
		innerClass ic = new innerClass(102);
		ic.print(); // number is 102
		

	}

}
