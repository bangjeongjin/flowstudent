package flowctrl.java.exam07.polymorphismOfField;

public class CarEX {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) { //Car ��ü�� run() �޼ҵ� 5�� �ݺ� ����
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;

			case 2:
				car.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
			
			case 3:
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
				
			case 4:
				car.backRightTire = new KumhoTire("�ڿ�����", 17);
				break;	
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~");
		}
		
		//---------------
//		for(int i=1; i<=5; i++) {
//			int problemLocation = car.run();
//			if(problemLocation != 0) {
//				System.out.println(car.tires[problemLocation-1].location+"�ѱ�Ÿ�̾�� ��ü");
//				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
//			}
//			System.out.println("------------------------");
//		}
		
	}
}
