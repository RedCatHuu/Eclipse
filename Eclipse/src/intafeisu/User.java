package intafeisu;

public class User {
	int id;
	String name;
	String mail;
	int role;
	public User(int id, String name, String mail, int role) {
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.role = role;
	}
	
	public void login() {
		System.out.println("ログインしました。");
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
	public int getRole() {
		return role;
	}

}
