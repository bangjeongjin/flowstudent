package flowctrl.java.exam07.classInheritance;

public class StudentExample { //자식 객체 이용
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-4789", 1);
		System.out.println(student.name);  //부모한테 물려받은 필드 출력
		System.out.println(student.ssn);   //부모한테 물려받은 필드 출력
		System.out.println(student.studentNo);
	}
}
