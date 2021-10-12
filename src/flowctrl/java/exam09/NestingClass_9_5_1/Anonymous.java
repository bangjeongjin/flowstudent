package flowctrl.java.exam09.NestingClass_9_5_1;

//�͸� �ڽ� ��ü ����
public class Anonymous {
	//�ʵ� �ʱⰪ���� ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		@Override                                   //�ʵ� ����� �ʱⰪ ����
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	
	void method1() {
		//���� ���������� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}									    //���� ���� ����� �ʱⰪ ����
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		
		//���� ���� ���
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
