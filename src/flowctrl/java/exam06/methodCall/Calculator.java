package flowctrl.java.exam06.methodCall;

public class Calculator { //클래스 내부에서 메소드 호출
	int plus(int x, int y) { //2번
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) { //1번 
		double sum = plus(x, y);
		double result = sum / 2; //2번 호출
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); //1번 호출
		println("실행결과: "+ result); //3번 호출
	}

	void println(String message) { //3번
		System.out.println(message);
	}
	
}
