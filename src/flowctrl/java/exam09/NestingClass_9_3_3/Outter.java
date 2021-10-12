package flowctrl.java.exam09.NestingClass_9_3_3;

//로컬 클래스에서 사용 제한
public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
//		arg = 100;           // X
//		localVariable = 100; // X
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}		
	}
	
	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100;           // X
//		localVariable = 100; // X
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
