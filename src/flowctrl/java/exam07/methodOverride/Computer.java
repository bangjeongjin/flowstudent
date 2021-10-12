package flowctrl.java.exam07.methodOverride;

public class Computer extends Calculator{ //자식 클래스
	@Override
	double areaCircle(double r) {
		System.out.println("Computer객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
