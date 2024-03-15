package First;

import java.util.Scanner;

public class whileLesson {

	public static void main(String[] args) {
		// while文
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		while(!str.equals("end")) {
			System.out.println(str);
			str = scan.next();
		}
		
		// 上を短くしたもの
		Scanner sca = new Scanner(System.in);
		String st;
		while( !(st = sca.next() ).equals("end") ) {
			System.out.println(st);			
		}

	}

}
