package flowctrl.java.exam09.NestingClass_9_3_2;

//멤버 클래스에서 사용 제한
public class A {
	int field1;
	
	void method1() {
		
	}
	
	static int field2;
	static void method2() {
		
	}
	
	class B {
		void method() {
			field1 = 10;	//ㄱ
			method1();		//ㅣ
							//ㅣ   모든 필드와 메소드에 접근 할수 있다.
			field2 = 10;	//ㅣ
			method2();		// 」
		}
	}
	
	static class C {
		void method() {
			//field1 = 10;    // 인스턴스 필드와 메소드는 접근할수 없다.
			//method1();      //
			
			field2 = 10;
			method2();
		}
	}
}
