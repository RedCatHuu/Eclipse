package lambda;
import java.util.List;

public class Sandbox {

	public static void main(String[] args) {
//		testApple( new Select_1() );
		testApple( a -> a.weight() >= 300 );
	}
	
	public static void testApple(Predicate p) {
		var list = getAppleList();
		for(Apple apple : list) {
			if(p.test(apple)) {
				System.out.println(apple);
			}
		}
	}
	
	//Appleのリストを返すメソッド
	public static List<Apple> getAppleList(){
		var list = List.of(
				new Apple(320, "red"),
				new Apple(280, "green"),
				new Apple(350, "green"),
				new Apple(330, "red"),
				new Apple(250, "red")
		);
		return list;
	}

}
