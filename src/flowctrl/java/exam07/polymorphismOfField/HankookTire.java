package flowctrl.java.exam07.polymorphismOfField;

public class HankookTire extends Tire{
	
	//�ʵ�
	
	
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	//�޼ҵ�
	@Override						//��� ������ �޸��ϱ� ���� ������ �� roll �޼ҵ�
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location +"�ѱ�Ÿ�̾� ����: "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println(location+"�ѱ�Ÿ�̾� ��ũ");
			return false;
		}
	}
	
}
