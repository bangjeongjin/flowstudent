package flowctrl.java.exam11.stringBulider_11_9;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //stringBulider ��ü ����
		
		sb.append("Java ");				//���ڿ��� ���� �߰�
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2"); 			   // index4 ��ġ �ڿ� 2�� ����
		System.out.println(sb.toString());

		sb.setCharAt(4, '6');		  // index4 ��ġ�� ���ڸ� 6���� ����
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); 	  // index6���� index13 �� ������ Book ���ڿ��� ��ġ
		System.out.println(sb.toString());
		
		sb.delete(4, 5);			  // index4���� index5 ������ ����
		System.out.println(sb.toString());
		
		int length = sb.length();		// �� ���� �� ���
		System.out.println("�ѹ��ڼ�: " + length);
		
		String result = sb.toString(); // ���ۿ� �ִ°��� String Ÿ������ ����
		System.out.println(result);		
	}
}
