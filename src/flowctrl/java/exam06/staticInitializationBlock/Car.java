package flowctrl.java.exam06.staticInitializationBlock;

public class Car { //���� �޼ҵ�� ���� ����� ��������	
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		
//		speed = 60; //������ ����
//		run();
		
		Car myCar = new Car();		
		myCar.speed = 60;
		myCar.run();
	}
}