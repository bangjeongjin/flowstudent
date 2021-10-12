package flowctrl.java.exam09.NestingClass_9_3_1;

//바깥 필드와 메소드에서 사용제한
public class A { 
	
	//인스턴스 필드
	B field1 = new B();        // O
	C field2 = new C();		   // O
	
	//인스턴스 메소드
	void method() {
		B var1 = new B();	   // O
		C var2 = new C();	   // O
	}
	
	//정적 필드 초기화
//	static B field3 = new B(); // X
	static C field4 = new C(); // O
	
	//정적 메소드
	static void method2() {
//		B var1 = new B();      // X
		C var2 = new C();	   // O
	}
	
	//인스턴스 멤버 클래스
	class B {
		
	}
	//정적 멤버 클래스
	static class C {
		
	}
}
