package threadLesson;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tools {
	public static void sleep( int n ) {
		try {
			Thread.sleep(n);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void print(String s) {
		var timeFormat = DateTimeFormatter.ofPattern("h:m:s.SSSS");
		System.out.println( LocalTime.now().format(timeFormat) 
				+ "(" + Thread.currentThread().getName() + ")" + s);
		
	}
	
	public static void print(long s) {
		print(String.valueOf(s));
	}
}
