package flowctrl.java.exam07.polymorphismOfField;

public class KumhoTire extends Tire{
	
	//필드
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	//메소드
		@Override						//출력 내용을 달리하기 위해 재정의 한 roll 메소드
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation < maxRotation) {
				System.out.println(location +"금호타이어 수명: "+(maxRotation-accumulatedRotation)+"회");
				return true;
			}else {
				System.out.println(location+"금호타이어 펑크");
				return false;
			}
		}

}
