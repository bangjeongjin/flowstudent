package flowctrl.java.exam09.NestingClass_9_3_4;

// ��ø Ŭ�������� �ٱ� Ŭ���� ���� ���
public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-method";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);        //��ø ��ü ����
			this.method();
			
			System.out.println(Outter.this.field); //�ٱ� ��ü ����
			Outter.this.method();
		}
	}
}
