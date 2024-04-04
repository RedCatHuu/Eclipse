package tyuushou;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SeniorMember extends Member {
	private LocalDate birthday;

	public SeniorMember(long id, String name, LocalDate birthday) {
		super(id, name);
		this.birthday = birthday;
	}
	
	@Override
	public int kai_hi() {
		return age() >= 70 ? 250 : 700;
	}

	public int age() {
		var today = LocalDate.now();
		return (int)(ChronoUnit.YEARS.between(birthday,  today));
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

}
