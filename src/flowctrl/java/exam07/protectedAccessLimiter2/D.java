package flowctrl.java.exam07.protectedAccessLimiter2;
import flowctrl.java.exam07.protectedAccessLimiter.A;

public class D extends A{
	public D() {
		super();      	       // O
		this.field = "value";  // O
		this.method();		   // O
	}
}
