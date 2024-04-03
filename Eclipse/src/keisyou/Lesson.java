package keisyou;

public class Lesson {
	private String lessonId;
	private String lessonName;
	
	public Lesson(String lessonId, String lessonName) {
		lessonId = lessonId;
		lessonName = lessonName;
	}
	
	public int ryokin() {
		return 1000;
	}

	public String getLessonId() {
		return lessonId;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonId(String lessonId) {
		this.lessonId = lessonId;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	

}
