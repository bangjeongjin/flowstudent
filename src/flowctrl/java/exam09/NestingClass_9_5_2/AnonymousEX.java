package flowctrl.java.exam09.NestingClass_9_5_2;

//�͸� ���� Ŭ������ ��ü ����
public class AnonymousEX {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("����Ʈ Ƽ�� �մϴ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("����Ʈ Ƽ�� ���ϴ�");
			}
		}
	  );
	}

}
