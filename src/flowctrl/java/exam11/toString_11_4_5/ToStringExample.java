package flowctrl.java.exam11.toString_11_4_5;

import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args) {		
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "�̸��� �����ϴ�."));
	}
}
