package threadLesson;

public class Sandbox {

	public static void main(String[] args) {
		
		var thread = new Thread( () -> print() );
		thread.start();
		System.out.println("メインスレッド終了");
		
	}
	public static void print() {
		System.out.println("別のスレッドで実行しました");
	}

}
