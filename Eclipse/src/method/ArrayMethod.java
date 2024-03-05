package method;

public class ArrayMethod {

	public static void main(String[] args) {
		
		// 拡張for文
		int[] number = {5, 12, 8, 21, 9};
		for ( int n : number) {
			System.out.print(n + "\t"); // 5	12	8	21	9	
		}
		
		// 合計
		int total = 0;
		for( int n : number) {
			total += n;
		}
		System.out.println("合計=" + total); // 合計=55
		System.out.println("平均=" + total / number.length); // 平均=11

	}

}
