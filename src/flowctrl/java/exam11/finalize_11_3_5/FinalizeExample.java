package flowctrl.java.exam11.finalize_11_3_5;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			counter = null; //Counter ��ü�� ������� ����
			System.gc(); // ������ ������ ���� ��û
		}
	}
}