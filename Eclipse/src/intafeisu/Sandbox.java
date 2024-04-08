package intafeisu;
import java.time.LocalDate;
import java.util.List;

public class Sandbox {

	public static void main(String[] args) {
		Student student = new Student(10, "田中", "t@t.com", 2, LocalDate.of(2000, 1, 1));
		
		if(student instanceof Student) {
			System.out.println("Student型です。"); // Student型です。
		}
		if(student instanceof Attendable) {
			System.out.println("Attendable型です。"); // Attendable型です。
		}
		
		// 要素がAttendable型の不変リスト
		var list = List.of(
			new Student(10, "田中", "t@t.com", 2, LocalDate.of(2000, 1, 1)),
			new AuditingStudent(20, "木村", "kimura@k.com", 3, 112),
			new Student(12, "森下", "mori@m.com", 2, LocalDate.of(2004, 7, 1))
		);
		
		// インタフェースのメソッドを実行
		for(Attendable att : list) {
			att.readAttendance();
		}
		
		
		Tax tax = new Tax(100, "田中", 150);
//		int zei = tax.zeigaku( gaku -> gaku > 100 ? 0.1 : 0.05); ラムダ式
		int zei = tax.zeigaku(new Rate1());
		System.out.println(tax.getName() + "\t" + zei); // 田中	 15
		
		Tax tax2 = new Tax(100, "田中", 150);
		int zei2 = tax2.zeigaku(new Rate2());
		System.out.println(tax2.getName() + "\t" + zei2); // 田中	18
		

	}

}
