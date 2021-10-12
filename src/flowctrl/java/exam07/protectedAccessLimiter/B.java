package flowctrl.java.exam07.protectedAccessLimiter;

public class B { // protected 접근 제한자 테스트
	public void method() {
		
		A a = new A();		// O
		a.field = "value";	// O
		a.method();			// O
	}
}
