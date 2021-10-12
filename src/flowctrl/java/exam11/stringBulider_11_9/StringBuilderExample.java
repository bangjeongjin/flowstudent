package flowctrl.java.exam11.stringBulider_11_9;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //stringBulider 객체 생성
		
		sb.append("Java ");				//문자열을 끝에 추가
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2"); 			   // index4 위치 뒤에 2를 삽입
		System.out.println(sb.toString());

		sb.setCharAt(4, '6');		  // index4 위치의 문자를 6으로 변경
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); 	  // index6부터 index13 전 까지를 Book 문자열로 대치
		System.out.println(sb.toString());
		
		sb.delete(4, 5);			  // index4부터 index5 전까지 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();		// 총 문자 수 얻기
		System.out.println("총문자수: " + length);
		
		String result = sb.toString(); // 버퍼에 있는것을 String 타입으로 리턴
		System.out.println(result);		
	}
}
