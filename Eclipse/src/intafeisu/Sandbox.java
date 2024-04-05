package intafeisu;
import java.time.LocalDate;

public class Sandbox {

	public static void main(String[] args) {
		Student student = new Student(10, "田中", "t@t.com", 2, LocalDate.of(2000, 1, 1));
		
		if(student instanceof Student) {
			System.out.println("Student型です。"); // Student型です。
		}
		if(student instanceof Attendable) {
			System.out.println("Attendable型です。"); // Attendable型です。
		}

	}

}
