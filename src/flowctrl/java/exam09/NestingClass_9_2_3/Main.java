package flowctrl.java.exam09.NestingClass_9_2_3;

//��ø Ŭ���� ��ü ����
public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.field1 = 3;
		b.method();
		
		//���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}

}
