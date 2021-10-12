package flowctrl.java.exam10.Try_Catch_Finally_10_3_;

//일반 예외 처리
public class TryCatchFinallyEX {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2"); 
		}catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재 하지 않습니다.");
		}
	}

}
