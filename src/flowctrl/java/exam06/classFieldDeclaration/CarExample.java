package flowctrl.java.exam06.classFieldDeclaration;

public class CarExample { //�ܺ� Ŭ�������� Car �ʵ尪 �б�� ����
	
	public static void main(String[] args) {
		
		//��ü ����
		Car myCar = new Car(); //�ܺ� person Ŭ�������� CarŬ������ speed �ʵ尪�� ����Ϸ��� Car ��ü�� �켱 �����Ͽ��� �Ѵ�.
		
		//�ʵ尪 �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
		
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);

	}
}
