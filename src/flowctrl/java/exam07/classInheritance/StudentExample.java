package flowctrl.java.exam07.classInheritance;

public class StudentExample { //�ڽ� ��ü �̿�
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-4789", 1);
		System.out.println(student.name);  //�θ����� �������� �ʵ� ���
		System.out.println(student.ssn);   //�θ����� �������� �ʵ� ���
		System.out.println(student.studentNo);
	}
}
