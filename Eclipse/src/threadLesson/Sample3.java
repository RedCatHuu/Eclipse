package threadLesson;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample3 {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		CompletableFuture
			.supplyAsync( () -> mailService(), pool)
			.exceptionally( throwable ->{
				Tools.print("エラーが発生しました\n" + throwable);
				return "エラーのため送信できませんでした";
			})
			.thenAccept( (message) -> sendReport(message));
		
		Tools.print("メールサービスに送信を依頼しました");
		pool.shutdown();
		
		/*
		2:59:8.7118(main)メールサービスに送信を依頼しました
		2:59:9.6973(pool-1-thread-1)エラーが発生しました
		java.util.concurrent.CompletionException: java.lang.ArithmeticException: / by zero
		2:59:9.6973(pool-1-thread-1)エラーのため送信できませんでした
		 */
	}
	
	public static String mailService() {
		Tools.sleep(1000);
		int n = 10 / 0;
		return "送信:〇件、アドレス不正：〇件";
	}
	
	public static void sendReport( String message) {
		Tools.print(message);
	}

}
