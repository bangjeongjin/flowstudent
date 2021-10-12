package flowctrl.java.exam09.NestingClass_9_5_2;

//익명 구현 클래스와 객체 생성
public class AnonymousEX {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//익명 객체 필드 사용
		anony.field.turnOn();
		//익명 객체 로컬 변수 사용
		anony.method1();
		//익명 객체 매개값 사용
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트 티비를 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트 티비를 끕니다");
			}
		}
	  );
	}

}
