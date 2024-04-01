package keisyou;

import java.time.LocalDate;

public class Sandbox {

	public static void main(String[] args) {
		var expDate = LocalDate.of(2024, 5, 31);
		var st = new StudentMember(100, "田中", expDate);
		
		System.out.println("id=" + st.getId());
		System.out.println(("name=" + st.getName()));
		System.out.println("回避=" + st.kai_hi());
		
		System.out.println("期限日か=" + st.isExpired());
		System.out.println("期限日 =" + st.getExpDate());

	}

}
