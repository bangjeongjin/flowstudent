package flowctrl.java.exam07.methodOverride;

public class Computer extends Calculator{ //�ڽ� Ŭ����
	@Override
	double areaCircle(double r) {
		System.out.println("Computer��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
