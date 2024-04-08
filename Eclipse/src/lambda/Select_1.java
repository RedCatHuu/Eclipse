package lambda;

public class Select_1 implements Predicate {
	public boolean test(Apple a) {
		return a.weight() >= 300;
	}
}
