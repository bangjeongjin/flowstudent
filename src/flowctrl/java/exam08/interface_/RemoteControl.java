package flowctrl.java.exam08.interface_;

public interface RemoteControl { //상수 필드 선언
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드 - 메소드 선언부만 작성
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리함");
		}else {
			System.out.println("무음 해제");
		}
	}
	
	//정적 메소드
	static void changBattery() {
		System.out.println("건전지 교환한다");
	}
}
