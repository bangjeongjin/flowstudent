package flowctrl.java.exam11.toString_11_3_3;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);  //myPhone.toString() �� �ڵ� ȣ���ؼ� ���ϰ��� ���� �� ���
	}
}
