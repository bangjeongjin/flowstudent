package flowctrl.java.exam07.abstractMethodsAndOverriding;

public class Dog extends Animal{

	public Dog() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�۸�");  //�߻�޼ҵ� ������
	}
	
}
