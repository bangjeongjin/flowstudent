package flowctrl.java.exam07.methodOverride;

public class ComputerExample { //�޼ҵ� �������̵� �׽�Ʈ
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("������: "+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("������: "+computer.areaCircle(r)); //�����ǵ� �޼ҵ� ȣ��
	}
}
