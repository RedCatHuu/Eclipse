package collectionFrame;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import lambda.Apple;

public class Sandbox {

	public static void main(String[] args) {
		var list = getAppleList();
		list.forEach(t -> System.out.println(t));
		/*		Apple[weight=320.0, color=red]
				Apple[weight=280.0, color=green]
				Apple[weight=350.0, color=green]
				Apple[weight=330.0, color=red]
				Apple[weight=250.0, color=red]
		 */

		
		// naturalSort
		var list2 = Arrays.asList("berry", "banana", "peach", "apple", "orange");
		list2.sort(Comparator.naturalOrder());
		list2.forEach(System.out::println);
		
		var list3 = Arrays.asList(
				new Apple(320, "red"),
				new Apple(280, "green"),
				new Apple(350, "green"),
				new Apple(330, "red"),
				new Apple(250, "red")
			);;
		list3.sort(Comparator.comparing(Apple::weight));
		list3.forEach(System.out::println);
		/*
		 *  Apple[weight=250.0, color=red]
			Apple[weight=280.0, color=green]
			Apple[weight=320.0, color=red]
			Apple[weight=330.0, color=red]
			Apple[weight=350.0, color=green]

		 */
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
