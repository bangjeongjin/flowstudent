package flowctrl.java.exam07.classInheritance;

public class DmbCellPhoneExample { //�ڽ� Ŭ���� ���
	
	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone���κ��� ��� ���� �ʵ�
		System.out.println("��: "+dmbCellPhone.model);
		System.out.println("����: "+dmbCellPhone.color);
		
//		DmbCellPhone�� �ʵ�
		System.out.println("ä��: "+dmbCellPhone.channel);
		
//		CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� ���� �����Դϴ�");
		dmbCellPhone.sendVoice("�� ���� ");
		dmbCellPhone.hangUp();
		
//		DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}
}
