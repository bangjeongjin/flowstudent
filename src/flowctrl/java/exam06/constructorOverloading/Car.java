package flowctrl.java.exam06.constructorOverloading;

public class Car { //�������� �����ε�
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// 1.������
	Car(){
		
	}
	
//	// 2.������
//	Car(String model){
//		this.model = model;
//	}
//	
//	// 3.������
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
//	
//	// 4.������
//	Car(String model, String color, int maxSpeed){
//		this.model = model;         //�ߺ��ڵ��
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
	
	// �ٸ� �����ڸ� ȣ���ؼ� �ߺ��ڵ� ���̱�
	
	// 2.������
		Car(String model){
			this(model, "����", 250);  //ȣ��
		}
		
		// 3.������
		Car(String model, String color){
			this(model, color, 250);  //ȣ��
		}
		
		// 4.������
		Car(String model, String color, int maxSpeed){  //���� ���� �ڵ�
			this.model = model;         
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
}
