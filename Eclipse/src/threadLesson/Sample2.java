package threadLesson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample2 {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		pool.submit( () -> doTask(1));
		pool.submit( () -> doTask(2));
		pool.submit( () -> doTask(3));
		pool.submit( () -> doTask(4));
		pool.shutdown();
	}
	
	public static void doTask( int n) {
		Tools.sleep(1000);			// 1秒休止
		Tools.print("task-" + n);	// 実行情報を表示
	}
	
	/*
	11:33:36.5664(pool-1-thread-1)task-1
	11:33:36.5584(pool-1-thread-3)task-3
	11:33:36.5674(pool-1-thread-2)task-2
	11:33:37.5778(pool-1-thread-3)task-4
	 */

}
