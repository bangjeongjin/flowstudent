package flowctrl.java.exam07.abstractMethodsAndOverriding;

public class Cat extends Animal{

	public Cat() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�߿�");  //�߻�޼ҵ� ������
	}
	
}