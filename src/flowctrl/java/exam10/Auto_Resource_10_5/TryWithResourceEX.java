package flowctrl.java.exam10.Auto_Resource_10_5;

//AutoCloseable ���� Ŭ����
public class TryWithResourceEX {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); //���������� ���� �߻���Ŵ
		}catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}

}
