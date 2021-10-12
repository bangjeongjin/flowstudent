package flowctrl.java.exam09.NestingClass_9_4;

//구현 클래스
public class MessageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
}
