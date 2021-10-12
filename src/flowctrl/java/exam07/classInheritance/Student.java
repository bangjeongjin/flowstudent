package flowctrl.java.exam07.classInheritance;

public class Student extends People{ //자식 클래스

	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //부모 생성자 호출
		this.studentNo = studentNo;
	}
}
