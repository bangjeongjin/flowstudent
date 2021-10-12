package flowctrl.java.exam09.NestingClass_9_5_2;

//UI 클래스
public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
						//↑
	Window() {			//↑
		button1.setOnClickListener(listener);  //매개밧으로 필드 대입
		
		button2.setOnClickListener(new Button.OnClickListener() { //매개값으로 익명 구현 객체 대입
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
	
}
