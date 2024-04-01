package keisyou;
import java.time.LocalDate;
public class StudentMember extends GeneralMember { // 継承の宣言
	private LocalDate expDate;
	public StudentMember(long id, String name, LocalDate expDate) {
		super(id, name);
		this.expDate = expDate;
	}
	
	public boolean isExpired() {
		LocalDate today = LocalDate.now();
		return today.isAfter(expDate);
	}
	
	public LocalDate getExpDate() {
		return expDate;
	}
	
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	
}
