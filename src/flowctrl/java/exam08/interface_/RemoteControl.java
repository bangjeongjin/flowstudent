package flowctrl.java.exam08.interface_;

public interface RemoteControl { //��� �ʵ� ����
	//���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� - �޼ҵ� ����θ� �ۼ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó����");
		}else {
			System.out.println("���� ����");
		}
	}
	
	//���� �޼ҵ�
	static void changBattery() {
		System.out.println("������ ��ȯ�Ѵ�");
	}
}
