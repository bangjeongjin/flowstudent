package flowctrl.java.exam09.NestingClass_9_4;

// ��ư �̺�Ʈ ó��
public class ButtonEX {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
