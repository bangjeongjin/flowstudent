package flowctrl.java.exam09.NestingClass_9_3_3;

//���� Ŭ�������� ��� ����
public class Outter {
	//�ڹ� 7 ����
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
	
	//�ڹ� 8 ����
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
