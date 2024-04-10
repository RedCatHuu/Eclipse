package collectionFrame;
import java.util.List;

import lambda.Apple;

public class Sandbox {

	public static void main(String[] args) {
		var list = getAppleList();
		list.forEach(t -> System.out.println(t));
	}
	
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
