package flowctrl.java.exam11.stringMethod_11_7_2;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

