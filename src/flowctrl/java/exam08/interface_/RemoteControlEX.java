package flowctrl.java.exam08.interface_;

public class RemoteControlEX {

	public static void main(String[] args) {
		//�����޼ҵ� ���
//		RemoteControl.changBattery();
				
		//�������̽� ������ ���� ��ü ����
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
	
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		//�͸� ���� Ŭ����
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
