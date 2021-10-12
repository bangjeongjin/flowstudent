package flowctrl.java.exam08.interface_;
// 다중 인터페이스 구현 클래스
public class SmartTV implements RemoteControl, Searchable{

	private int volume;
	
	//RemoteControl의 추상메소드에 대한 실체 메소드
	public void turnOn() {
		System.out.println("티비 킨다");
	}
	
	public void turnOff() {
		System.out.println("티비를 끈다");
	}

	public void setVolume(int volume) {
		//인터페이스 상수를 이용해서 volume 필드의 값을 제한
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륭: "+this.volume);
	}
	
	//Searchable 의 추상메소드에 대한 실체 메소드
	public void search(String url) {        
		System.out.println(url + "을 검색합니다");
	}
	
}
