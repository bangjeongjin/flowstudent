package flowctrl.java.exam06.staticInitializationBlock;

public class Car { //정적 메소드와 블록 선언시 주의할점	
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		
//		speed = 60; //컴파일 에러
//		run();
		
		Car myCar = new Car();		
		myCar.speed = 60;
		myCar.run();
	}
}
