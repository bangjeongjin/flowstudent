package flowctrl.java.exam09.NestingClass_9_4;

//��ø �������̽�
public class Button {
	OnClickListener listener;   //�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) { //�Ű� ������ ������
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();    //���� ��ü�� onClick() �޼ҵ� ȣ��
	}
	
	interface OnClickListener{ // ��ø �������̽�
		void onClick();      
	}
}
