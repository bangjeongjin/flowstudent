package flowctrl.java.exam09.NestingClass_9_3_4;

//실행 클래스
public class OutterEX {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
