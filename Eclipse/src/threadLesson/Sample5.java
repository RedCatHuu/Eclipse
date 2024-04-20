package threadLesson;

public class Sample5 {

	public static void main(String[] args) {
		var count = new Count();
		for(int i = 0; i < 5; i++) {
			new Thread( () -> count.update()).start();
		}

	}

}

class Count {
	private int number=0;
	public synchronized void update() {
		number++;
		Tools.sleep(1);
		Tools.print(number);
	}
}
