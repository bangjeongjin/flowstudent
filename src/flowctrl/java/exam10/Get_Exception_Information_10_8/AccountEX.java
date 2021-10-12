package flowctrl.java.exam10.Get_Exception_Information_10_8;

import flowctrl.java.exam10.BalanceInsufficientException_10_7_1.BalanceInsufficientException;
import flowctrl.java.exam10.Raising_An_Exception_10_7_2.Account;

public class AccountEX {

	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage(); //예외 메세지 얻기
			System.out.println(message);
			System.out.println(); //예외 추적 후 출력
			e.printStackTrace();
		}
	}

}
