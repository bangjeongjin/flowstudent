package flowctrl.java.exam10.Try_Catch_Finally_10_3_;

//�Ϲ� ���� ó��
public class TryCatchFinallyEX {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2"); 
		}catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ ���� ���� �ʽ��ϴ�.");
		}
	}

}
