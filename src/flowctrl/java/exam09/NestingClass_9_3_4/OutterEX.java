package flowctrl.java.exam09.NestingClass_9_3_4;

//���� Ŭ����
public class OutterEX {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
