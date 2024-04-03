package keisyou;

import java.time.LocalDate;
import java.util.List;

public class Sandbox {

	public static void main(String[] args) {
		var expDate = LocalDate.of(2024, 5, 31);
		var st = new StudentMember(100, "田中", expDate);
		
		System.out.println("id=" + st.getId());
		System.out.println(("name=" + st.getName()));
		System.out.println("会費=" + st.kai_hi()); // オーバーライドメソッド
		
		System.out.println("期限日か=" + st.isExpired());
		System.out.println("期限日 =" + st.getExpDate());
		
		// アップキャスト
		GeneralMember gem 
			= new StudentMember(200, "鈴木", expDate);
		System.out.println("ID=" + gem.getId());
		System.out.println("氏名=" + gem.getName());
		System.out.println("会費=" + gem.kai_hi()); // 500
		/* オーバーライドメソッドは、変数の方ではなく、インスタンスの方を調べて、
		 * その定義クラスでオーバーライドされたメソッドが起動される。
		 * 変数gemの型はGeneralMemberだが、インスタンスの実際の方はStudentMemberのため、kai_hiメソッドは500を返す。
		 */
		// StudentMemberのメソッドは使えない。
//		System.out.println("期限日か=" + gem.isExpired());
//		System.out.println("期限日=" + gemExpDate());
		
		List<GeneralMember> list = List.of(
				new GeneralMember(1, "木村"),
				new StudentMember(2, "田中", LocalDate.of(2026,  3, 31) ),
				new SeniorMember(3, "田村", LocalDate.of(1960, 3, 31) )
		);
		
		int total = 0;
		for(GeneralMember item : list) {
			total += item.kai_hi();
		}
		
		System.out.println("合計=" + total); // 2200

	}

}
