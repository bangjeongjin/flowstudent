package flowctrl.java.exam07.polymorphismOfField;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("자동차 달린다");
		if(frontLeftTire.roll()==false) {
			stop(); return 1;
		}
		if(frontRightTire.roll()==false) {
			stop(); return 2;
		}
		if(backLeftTire.roll()==false) {
			stop(); return 3;
		}
		if(backRightTire.roll()==false) {
			stop(); return 4;
		}
		return 0;
	}
	
	Tire[] tires = {
		new Tire("앞왼쪽", 6),
		new Tire("앞오른쪽", 2),	
		new Tire("뒤왼쪽", 3),	
		new Tire("뒤오른쪽", 4)
	};
//	int run() {
//		System.out.println("자동차 달린다");
//		for(int i=0; i<tires.length; i++) {
//			if(tires[i].roll()==false) {
//				stop();
//				return (i+1);
//			}
//		}
//		return 0;
//	}
//	 배열로 이렇게 간단하게 할수 있음 CarEX 로 
	

	private void stop() {
		System.out.println("자동차 멈춤");
	}
}
