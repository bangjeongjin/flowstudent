package flowctrl.java.exam09.NestingClass_9_5_2;

//�͸� ���� Ŭ������ ��ü ����
public class Anonymous {
	//�ʵ� �ʱⰪ���� ����
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("Ƽ�� �մϴ�.");
		}
		 										//�ʵ� ����� �ʱⰪ ����
		@Override
		public void turnOff() {
			System.out.println("Ƽ�� ���ϴ�.");
		}
	};
	
	void method1() {
		//���� ���������� ����
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
			}
												//���� ���� ����� �ʱⰪ ����
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
			}
		};
		//���� ���� ���
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
}
