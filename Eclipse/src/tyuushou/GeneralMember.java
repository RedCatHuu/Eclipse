package tyuushou;

public class GeneralMember extends Member {
	public GeneralMember(long id, String name) {
		super(id, name);
	}
	@Override
	public int kai_hi() {
		return 1000;
	}
}
