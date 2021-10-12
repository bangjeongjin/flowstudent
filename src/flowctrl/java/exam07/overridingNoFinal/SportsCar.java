package flowctrl.java.exam07.overridingNoFinal;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	//오버라이딩 할수 없음
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
//	클래스를 선언할때 final 키워드를 class앞에 붙이게 되면 이 클래스는 최종적인 클래스이므로 상속 할수 없는 클래스가 된다.
//	즉 final 클래스는 부모클래스가 될수 없어 자식클래스를 만들수 없다.
}
