package flowctrl.java.exam06.methodCall;

public class Calculator { //Ŭ���� ���ο��� �޼ҵ� ȣ��
	int plus(int x, int y) { //2��
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) { //1�� 
		double sum = plus(x, y);
		double result = sum / 2; //2�� ȣ��
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); //1�� ȣ��
		println("������: "+ result); //3�� ȣ��
	}

	void println(String message) { //3��
		System.out.println(message);
	}
	
}
