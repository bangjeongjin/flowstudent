package flowctrl.java.exam06.methodWithReturnValue;

public class Car { //���� ���� �ִ� �޼ҵ�
	
	//�ʵ�
	int gas;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) { //���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
		this.gas = gas;
	}
	
	boolean isLeftGas() {  //���ϰ��� boolean�� �޼ҵ�� gas �ʵ尪�� 0�̸� false��, 0�� �ƴϸ� true�� ����
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");  
			return false; //false�� ����
		}
		
		return true; //true�� ����
	}
	
	void run() {   //���ϰ��� �ʿ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return������ �޼ҵ带 ��������
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:"+ gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�.(gas�ܷ�:"+ gas + ")");
				return; //�޼ҵ� ���� ����
			}
		}
	}

}
