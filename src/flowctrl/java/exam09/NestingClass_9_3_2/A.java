package flowctrl.java.exam09.NestingClass_9_3_2;

//��� Ŭ�������� ��� ����
public class A {
	int field1;
	
	void method1() {
		
	}
	
	static int field2;
	static void method2() {
		
	}
	
	class B {
		void method() {
			field1 = 10;	//��
			method1();		//��
							//��   ��� �ʵ�� �޼ҵ忡 ���� �Ҽ� �ִ�.
			field2 = 10;	//��
			method2();		// ��
		}
	}
	
	static class C {
		void method() {
			//field1 = 10;    // �ν��Ͻ� �ʵ�� �޼ҵ�� �����Ҽ� ����.
			//method1();      //
			
			field2 = 10;
			method2();
		}
	}
}
