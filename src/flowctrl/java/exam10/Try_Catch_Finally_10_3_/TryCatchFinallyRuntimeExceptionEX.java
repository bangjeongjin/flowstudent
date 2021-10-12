package flowctrl.java.exam10.Try_Catch_Finally_10_3_;

//���� ���� ó��
public class TryCatchFinallyRuntimeExceptionEX {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java TryCatchFinallyRuntimeExceptionEX	num1  num2");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
		}catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}finally {
			System.out.println("�ٽ� �����ϼ���");
		}
	}

}