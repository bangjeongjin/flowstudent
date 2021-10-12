package flowctrl.java.exam07.polymorphismOfField;

public class Tire {
	//�ʵ�
	public int maxRotation;     //�ִ� ȸ����
	public int accumulatedRotation; //���� ȸ����
	public String location;		//Ÿ�̾��� ��ġ
	
	
	
	//������	
	public Tire(String location, int maxRotation) {
		this.location = location;   //Ÿ�̾��� ��ġ �ʱ�ȭ
		this.maxRotation = maxRotation; //�ִ� ȸ���� �ʱ�ȭ				 
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation; //���� ȸ���� 1����
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Ÿ�̾� ����: " + (maxRotation-accumulatedRotation)+ "ȸ");
			return true;	
		}else {
			System.out.println("***"+location+" Ÿ�̾� ��ũ***");
			return false;
		}
	}
	
	
	
	
	
}
