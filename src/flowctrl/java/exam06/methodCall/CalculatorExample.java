package flowctrl.java.exam06.methodCall;

public class CalculatorExample { //클래스 내부에서 호출
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.execute(); //Calculator의 execute() 호출
	}
}
