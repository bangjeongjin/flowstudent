package flowctrl.java.exam08.interface_;

public class Audio implements RemoteControl {
	// �ʵ�
	private int volume;
	private boolean mute;

	// turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("������� �մϴ�");
	}

	// turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("������� ���ϴ�");
	}

	// setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		// �������̽� ����� �̿��ؼ� volume �ʵ��� ���� ����
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Ƽ�� ����: " + this.volume);
	}
	
	//����Ʈ �޼ҵ� ������
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó����");
		}else {
			System.out.println("���� ����");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
