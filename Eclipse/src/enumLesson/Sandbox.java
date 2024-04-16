package enumLesson;

import java.util.Arrays;
import java.util.Comparator;

public class Sandbox {

	public static void main(String[] args) {
		
		Size s = Size.LARGE;		
		System.out.println( s.name()); // LARGE
		System.out.println( s.ordinal()); // 2
		
		for(Size size : Size.values()) {
			System.out.println( size.name() + ":" + size.ordinal());
		}
		/*
		SMALL:0
		MEDIUM:1
		LARGE:2
		*/
		
		Size[] ss = {Size.MEDIUM, Size.LARGE, Size.SMALL};
		Arrays.sort(ss);
		for(Size size : ss) {
			System.out.println( size.name() + ":" + size.ordinal());
		}
		/*
		SMALL:0
		MEDIUM:1
		LARGE:2
		*/
		
		// 降順
		Arrays.sort(ss, Comparator.comparingInt(size -> -size.ordinal() ));
		for(Size size : ss) {
			System.out.println( size.name() + ":" + size.ordinal());
		}
		/*
		LARGE:2
		MEDIUM:1
		SMALL:0
		*/
		
		
	}

}
