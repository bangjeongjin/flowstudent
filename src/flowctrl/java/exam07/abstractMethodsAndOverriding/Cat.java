package flowctrl.java.exam07.abstractMethodsAndOverriding;

public class Cat extends Animal{

	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");  //추상메소드 재정의
	}
	
}