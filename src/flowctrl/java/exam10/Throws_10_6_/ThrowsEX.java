package flowctrl.java.exam10.Throws_10_6_;

public class ThrowsEX {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ ���� ���� �ʽ��ϴ�.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class Clazz = Class.forName("java.lang.String2");
	}

}
