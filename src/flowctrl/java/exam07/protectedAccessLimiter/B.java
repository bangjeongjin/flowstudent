package flowctrl.java.exam07.protectedAccessLimiter;

public class B { // protected ���� ������ �׽�Ʈ
	public void method() {
		
		A a = new A();		// O
		a.field = "value";	// O
		a.method();			// O
	}
}
