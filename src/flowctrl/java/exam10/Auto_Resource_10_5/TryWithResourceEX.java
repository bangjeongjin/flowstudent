package flowctrl.java.exam10.Auto_Resource_10_5;

//AutoCloseable 구현 클래스
public class TryWithResourceEX {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); //강제적으로 예외 발생시킴
		}catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}

}
