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

	}

}
