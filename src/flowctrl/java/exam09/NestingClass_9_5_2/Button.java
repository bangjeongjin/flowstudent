package flowctrl.java.exam09.NestingClass_9_5_2;

//UI Ŭ����
public class Button {
	OnClickListener listener; //�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) { //�Ű� ������ ������
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();  //���� ��ü�� onClick() �޼ҵ� ȣ��
	}
	
	interface OnClickListener { //��ø �������̽�
		void onClick();
	}
}
