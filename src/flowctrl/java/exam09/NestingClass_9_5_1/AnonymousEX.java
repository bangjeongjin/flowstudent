package flowctrl.java.exam09.NestingClass_9_5_1;

//�͸� �ڽ� ��ü ����
public class AnonymousEX {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.wake();
		
		//�͸� ��ü ���� ���� ���
		anony.method1();
		
		//�͸� ��ü �Ű��� ���
		anony.method2(
		 new Person() {  //�Ű���
			 void study() {
				 System.out.println("�����մϴ�.");
			 }
			 @Override
			 void wake() {
				 System.out.println("8�ÿ� �Ͼ�ϴ�.");
				 study();
			 }
		 }					
	   );
	}

}
