package flowctrl.java.exam10.Get_Exception_Information_10_8;

import flowctrl.java.exam10.BalanceInsufficientException_10_7_1.BalanceInsufficientException;
import flowctrl.java.exam10.Raising_An_Exception_10_7_2.Account;

public class AccountEX {

	public static void main(String[] args) {
		Account account = new Account();
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: " + account.getBalance());
		
		//����ϱ�
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage(); //���� �޼��� ���
			System.out.println(message);
			System.out.println(); //���� ���� �� ���
			e.printStackTrace();
		}
	}

}
