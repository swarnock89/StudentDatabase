package studentDatabase;

public class CreateStudentRecord {

	public static void main(String[] args) {
		StudentDatabase student = new StudentDatabase("Shawn Warnock", "123456789", "Apex, NC", "9197786545");
		student.setLocation("Apex, NC");
		student.studentInformation();

	}

}
