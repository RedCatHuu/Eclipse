package intafeisu;

public class AuditingStudent extends User implements Attendable{
	private int subjectId;
	
	public AuditingStudent(int id, String name, String mail, int role, int subjectId) {
		super(id, name, mail, role);
		this.subjectId = subjectId;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	
	@Override
	public void writeAttendance() {
		System.out.println("聴講科目の出席報告を完了しました。");
	}
	@Override
	public void readAttendance() {
		System.out.println("聴講科目の出席情報を読み込みました。");
	}

}
