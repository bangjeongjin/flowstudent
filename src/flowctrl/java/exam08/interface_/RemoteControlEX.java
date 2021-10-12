package flowctrl.java.exam08.interface_;

public class RemoteControlEX {

	public static void main(String[] args) {
		//정적메소드 사용
//		RemoteControl.changBattery();
				
		//인터페이스 변수에 구현 객체 대입
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
	
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		//익명 구현 클래스
//			RemoteControl rc = new RemoteControl() {
//			
//			
//			public void turnOn() {
//				System.out.println();
//			}
//			
//			
//			public void turnOff() {
//				System.out.println();
//			}
//			
//			
//			public void setVolume(int volume) {
//				System.out.println();
//			}
//		};	
		
		
	}

}
