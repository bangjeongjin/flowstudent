package flowctrl.java.exam07.abstractClass;

public class Smartphone extends Phone{ //실체 클래스
	//생성자
	public Smartphone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷검색을 합니다");
	}
}
