package flowctrl.java.exam07.classInheritance;

public class Student extends People{ //�ڽ� Ŭ����

	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //�θ� ������ ȣ��
		this.studentNo = studentNo;
	}
}
