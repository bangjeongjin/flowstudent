package flowctrl.java.exam06.method;

public class Computer { //매개 변수의 수를 모를경우
	
	int sum1(int[] values) {
		int sum = 0;
		//for(초기값;조건식;증감값){}
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
}
