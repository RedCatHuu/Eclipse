package keisyou;

public class GeneralMember {
	private long id;
	private String name;
	private Lesson lesson;
	
	public GeneralMember(long id, String name) {
		this.id = id;
		this.name = name;
//		this.lesson = lesson;
	}
	
	public int kai_hi(){
		return 1000;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//移譲メソッド
	public int ryokin() {
		return lesson.ryokin();
	}

	public String getLessonId() {
		return lesson.getLessonId();
	}

	public String getLessonName() {
		return lesson.getLessonName();
	}
	
	
}
