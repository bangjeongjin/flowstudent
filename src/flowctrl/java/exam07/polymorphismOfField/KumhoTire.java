package flowctrl.java.exam07.polymorphismOfField;

public class KumhoTire extends Tire{
	
	//�ʵ�
	
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	//�޼ҵ�
		@Override						//��� ������ �޸��ϱ� ���� ������ �� roll �޼ҵ�
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation < maxRotation) {
				System.out.println(location +"��ȣŸ�̾� ����: "+(maxRotation-accumulatedRotation)+"ȸ");
				return true;
			}else {
				System.out.println(location+"��ȣŸ�̾� ��ũ");
				return false;
			}
		}

}
