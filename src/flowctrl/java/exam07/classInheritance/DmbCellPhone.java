package flowctrl.java.exam07.classInheritance;

public class DmbCellPhone extends CellPhone { //자식 클래스
	//필드
	int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model; // CellPhone부모로 부터 상속받은 필드
		this.color = color; // CellPhone부모로 부터 상속받은 필드
		this.channel = channel;
	}
	//메소드
	public void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을  시작합니다");
	}
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println(channel+"번으로 바꿉니다.");		
	}
	public void turnOffDmb() {
		System.out.println("DMB 방송수신을 멈춤");
	}
	
}
