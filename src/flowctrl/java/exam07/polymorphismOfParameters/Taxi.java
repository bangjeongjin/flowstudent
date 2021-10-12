package flowctrl.java.exam07.polymorphismOfParameters;

public class Taxi extends Vehicle{ //자식 클래스
	@Override
	public void run() {
		System.out.println("택시가 달린다");
	}
}
