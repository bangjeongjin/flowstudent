package flowctrl.java.exam07.automaticTypeConversion;

public class ChildEX {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //�ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2(); //�����ǵ� �޼ҵ尡 ȣ���
//		parent.method3(); ȣ�� �Ұ���
	}
}
