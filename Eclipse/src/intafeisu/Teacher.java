package intafeisu;

public class Teacher extends User {
	private String url;
	
	public Teacher(int id, String name, String mail, int role, String url) {
		super(id, name, mail, role);
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

	
}
