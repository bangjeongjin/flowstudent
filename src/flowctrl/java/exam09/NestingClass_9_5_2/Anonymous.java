package flowctrl.java.exam09.NestingClass_9_5_2;

//익명 구현 클래스의 객체 생성
public class Anonymous {
	//필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("티비를 켭니다.");
		}
		 										//필드 선언과 초기값 대입
		@Override
		public void turnOff() {
			System.out.println("티비를 끕니다.");
		}
	};
	
	void method1() {
		//로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}
												//로컬 변수 선언과 초기값 대입
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		//로컬 변수 사용
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
}
