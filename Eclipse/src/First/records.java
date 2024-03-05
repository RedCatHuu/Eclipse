package First;

public class records {

	// オブジェクト(インスタンス)を作成できる。
	public record Meibo(int number, String name, String mail) {}
	
	public static void main(String[] args) {
		
		Meibo meibo = new Meibo(100, "田中", "t@t");
		System.out.println(meibo); // Meibo[number=100, name=田中, mail=t@t]		
		System.out.println(meibo.number()); // 100
		System.out.println(meibo.name()); // 田中
		System.out.println(meibo.mail()); // t@t
	}

}
