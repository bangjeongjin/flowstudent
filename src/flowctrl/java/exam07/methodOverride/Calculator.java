package flowctrl.java.exam07.methodOverride;

public class Calculator { //부모 클래스
	double areaCircle(double r) {
		System.out.println("Calculator객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}
