package flowctrl.java.exam08.interface_;
// ���� �������̽� ���� Ŭ����
public class SmartTV implements RemoteControl, Searchable{

	private int volume;
	
	//RemoteControl�� �߻�޼ҵ忡 ���� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("Ƽ�� Ų��");
	}
	
	public void turnOff() {
		System.out.println("Ƽ�� ����");
	}

	public void setVolume(int volume) {
		//�������̽� ����� �̿��ؼ� volume �ʵ��� ���� ����
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Ƽ�� ����: "+this.volume);
	}
	
	//Searchable �� �߻�޼ҵ忡 ���� ��ü �޼ҵ�
	public void search(String url) {        
		System.out.println(url + "�� �˻��մϴ�");
	}
	
}
