package flowctrl.java.exam07.polymorphismOfParameters;

public class Bus extends Vehicle{ //자식 클래스
	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}
}
