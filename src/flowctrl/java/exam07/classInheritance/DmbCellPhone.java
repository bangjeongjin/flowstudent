package flowctrl.java.exam07.classInheritance;

public class DmbCellPhone extends CellPhone { //�ڽ� Ŭ����
	//�ʵ�
	int channel;
	
	//������
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model; // CellPhone�θ�� ���� ��ӹ��� �ʵ�
		this.color = color; // CellPhone�θ�� ���� ��ӹ��� �ʵ�
		this.channel = channel;
	}
	//�޼ҵ�
	public void turnOnDmb() {
		System.out.println("ä��"+channel+"�� DMB ��� ������  �����մϴ�");
	}
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println(channel+"������ �ٲߴϴ�.");		
	}
	public void turnOffDmb() {
		System.out.println("DMB ��ۼ����� ����");
	}
	
}
