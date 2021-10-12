package flowctrl.java.exam06.constructorOverloading;

public class Car { //생성자의 오버로딩
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 1.생성자
	Car(){
		
	}
	
//	// 2.생성자
//	Car(String model){
//		this.model = model;
//	}
//	
//	// 3.생성자
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
//	
//	// 4.생성자
//	Car(String model, String color, int maxSpeed){
//		this.model = model;         //중복코드들
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
	
	// 다른 생성자를 호출해서 중복코드 줄이기
	
	// 2.생성자
		Car(String model){
			this(model, "은색", 250);  //호출
		}
		
		// 3.생성자
		Car(String model, String color){
			this(model, color, 250);  //호출
		}
		
		// 4.생성자
		Car(String model, String color, int maxSpeed){  //공통 실행 코드
			this.model = model;         
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
}
