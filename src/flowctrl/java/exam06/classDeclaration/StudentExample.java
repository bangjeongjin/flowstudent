package flowctrl.java.exam06.classDeclaration;

// 클래스 변수;
// 변수 = new 클래스();

// 클래스 변수 = new 클래스();

//실행 클래스
public class StudentExample { //클래스로부터 객체 생성
	
	//실행하기 위한 코드
	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		//s1과 s2가 참조하는 Student 객체는 완전히 독립된 서로 다른 객체이다.
		
		//new 연산자는 클래스로 부터 객체를 생성시키는 연산자
	}
}
