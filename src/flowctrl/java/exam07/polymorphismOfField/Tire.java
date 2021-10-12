package flowctrl.java.exam07.polymorphismOfField;

public class Tire {
	//필드
	public int maxRotation;     //최대 회전수
	public int accumulatedRotation; //누적 회전수
	public String location;		//타이어의 위치
	
	
	
	//생성자	
	public Tire(String location, int maxRotation) {
		this.location = location;   //타이어의 위치 초기화
		this.maxRotation = maxRotation; //최대 회전수 초기화				 
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation; //누적 회전수 1증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "타이어 수명: " + (maxRotation-accumulatedRotation)+ "회");
			return true;	
		}else {
			System.out.println("***"+location+" 타이어 펑크***");
			return false;
		}
	}
	
	
	
	
	
}
