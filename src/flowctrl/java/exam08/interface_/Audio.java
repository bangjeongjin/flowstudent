package flowctrl.java.exam08.interface_;

public class Audio implements RemoteControl {
	// 필드
	private int volume;
	private boolean mute;

	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}

	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}

	// setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		// 인터페이스 상수를 이용해서 volume 필드의 값을 제한
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륭: " + this.volume);
	}
	
	//디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리함");
		}else {
			System.out.println("무음 해제");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
