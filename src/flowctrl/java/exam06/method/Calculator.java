package flowctrl.java.exam06.method;

public class Calculator {
	
	//�� �ۼ��� �޼ҵ�
//	void run() {}
//	void startEngine() {}
//	String getName() {}
//	int[] getScores() {}
	
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}
